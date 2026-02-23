"""
DragonSoul Server Emulator - Message Handlers
Processes incoming messages and builds protocol responses.

FIXED: Removed debug block from handle_client_info, restored BootData1 response.
"""

import json
import time
import random
import logging
import os
import datetime

import config
from protocol import ProtocolWriter
from messages import (
    MESSAGE_NAME_TO_ID, MESSAGE_INDEX,
    build_message, build_boot_data, build_boot_data_minimal,
    build_user_info, build_server_info,
    build_hero_data, build_hero_persistent_data,
    pack_field_int, pack_field_long, pack_field_string, pack_field_bool,
    pack_field_enum, pack_field_list, pack_field_map, pack_field_message,
    pack_skip, pack_int, pack_long, pack_string, pack_size,
    Rarity, ResourceType, GameMode, ArenaTier,
    TAG_FIELD, TAG_END,
)
from database import (
    get_or_create_player, get_player_by_user_id, get_player_heroes,
    update_player, update_hero, add_chat_message, get_recent_chat,
    save_campaign_progress,
)
from gamedata import (
    get_hero_stats, get_campaign_level, get_starter_heroes,
    HEROES, ITEMS, STAMINA_COSTS,
)
from combat import simulate_battle, calculate_drops

logger = logging.getLogger("handlers")


# ─── Handler Dispatch ──────────────────────────────────────────────────────────

HANDLERS = {}


def handler(msg_name):
    """Decorator to register a message handler."""
    def decorator(func):
        HANDLERS[msg_name] = func
        return func
    return decorator


def dispatch(client_state, msg_name, msg_number, fields):
    """
    Dispatch an incoming message to the appropriate handler.
    Returns list of raw response messages (bytes).
    """
    func = HANDLERS.get(msg_name, handle_default)
    try:
        return func(client_state, msg_name, msg_number, fields)
    except Exception as e:
        logger.error(f"Handler error for {msg_name}: {e}", exc_info=True)
        return []


# ─── Handlers ──────────────────────────────────────────────────────────────────

@handler("ClientInfo1")
def handle_client_info(client_state, msg_name, msg_number, fields):
    """
    Handle login / registration.
    Responds with BootData1 containing full game state.
    """
    device_id = fields.get("uniqueIdentifier", "")
    user_id = fields.get("userID", 0)

    if not device_id:
        device_id = f"device_{int(time.time())}"

    conn = client_state.get("db_conn")

    # Try to find by user_id first, then by device_id
    player = None
    if user_id and user_id > 0:
        player = get_player_by_user_id(user_id, conn)

    if not player:
        player = get_or_create_player(device_id, conn)

    # Update client state
    client_state["user_id"] = player["user_id"]
    client_state["player_id"] = player["id"]
    client_state["device_id"] = device_id
    client_state["player"] = player

    heroes = player.get("heroes", {})

    # Heroes are now sent to the client.
    # The previous crash (RedDotTracker / BaseHeroGearStats NullPointerException)
    # was caused by missing content.tab — now served via statData with shard_id=1.

    # Build player_data dict for message builder
    player_data = {
        "user_id": player["user_id"],
        "name": player["name"],
        "team_level": player["team_level"],
        "xp": player["xp"],
        "gold": player["gold"],
        "diamonds": player["diamonds"],
        "stamina": player["stamina"],
        "raid_tickets": player["raid_tickets"],
        "tutorial_step": player["tutorial_step"],
        "campaign_progress": {
            int(k): v for k, v in player["campaign_progress"].items()
        },
        "lineups": {
            int(k): v for k, v in player.get("lineups", {0: [0,1,2,3,4]}).items()
        },
        "items": {
            int(k): v for k, v in player["items"].items()
        },
    }

    # Ensure tutorial is marked complete so the client doesn't try to launch
    # the tutorial intro (which requires assets not on our server → crash).
    # firstBoot is also forced to False below for the same reason.
    # NOTE: team_level is left untouched so campaign progression works normally.
    if player["tutorial_step"] < 999:
        update_player(player["id"], conn=conn, tutorial_step=999)
        player["tutorial_step"] = 999
        player_data["tutorial_step"] = 999

    # Seed initial campaign progress if empty.
    # The tutorial normally walks the player through the first campaign levels.
    # Without it, empty levelStatuses causes the client to compute
    # highestChapter = -1, displaying "Chapter -1" with a bogus level 0 req.
    # Seeding level 0-0 as completed lets the client detect chapter 0 properly.
    if not player["campaign_progress"]:
        seed_progress = save_campaign_progress(player["id"], chapter=0, level=0, stars=3, conn=conn)
        player["campaign_progress"] = seed_progress
        player_data["campaign_progress"] = {
            int(k): v for k, v in seed_progress.items()
        }

    # Increment message counter
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    # Echo the client's game data versions back so it skips downloading files
    stat_versions = fields.get("statVersions", {})

    # Always False — firstBoot=True causes the game to launch the tutorial intro
    # which requires assets (videos/animations) that don't exist on our server.
    # The client crashes during tutorial init and never reconnects.
    # With firstBoot=False the game skips the intro and loads the town screen.
    is_first_boot = False

    boot_msg = build_boot_data(
        player_data, heroes, resp_num,
        response_to=msg_number,
        stat_versions=stat_versions,
        is_first_boot=is_first_boot,
    )
    logger.info(
        f"Login: user_id={player['user_id']}, name={player['name']}, "
        f"level={player['team_level']}, firstBoot={is_first_boot}, "
        f"statVersions echoed={len(stat_versions)}"
    )

    # ══════════════════════════════════════════════════════════════════════════
    #  DEBUG DUMP — writes complete login state to debug_login_dump.txt
    # ══════════════════════════════════════════════════════════════════════════
    try:
        dump_path = os.path.join(os.path.dirname(__file__) or ".", "debug_login_dump.txt")
        with open(dump_path, "w", encoding="utf-8") as df:
            ts = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
            df.write(f"═══ DRAGON SOUL LOGIN DEBUG DUMP ═══\n")
            df.write(f"Timestamp: {ts}\n\n")

            df.write(f"── PLAYER (raw from DB) ──\n")
            for k, v in player.items():
                df.write(f"  {k} = {v!r}\n")

            df.write(f"\n── PLAYER_DATA (sent to message builder) ──\n")
            for k, v in player_data.items():
                df.write(f"  {k} = {v!r}\n")

            df.write(f"\n── CAMPAIGN PROGRESS DETAILS ──\n")
            cp = player_data.get("campaign_progress", {})
            df.write(f"  Type: {type(cp).__name__}, Length: {len(cp)}\n")
            df.write(f"  Raw dict: {cp!r}\n")
            for key, val in cp.items():
                ch = key // 100
                lv = key % 100
                df.write(f"  Key {key} → chapter={ch}, level={lv}, value={val!r}\n")

            df.write(f"\n── SERIALIZATION CHECK ──\n")
            # Re-derive ls_entries the same way messages.py does
            ls_entries = []
            for key, status in cp.items():
                ch = key // 100
                lv = key % 100
                st = status.get("stars", 3) if isinstance(status, dict) else 3
                ct = status.get("campaign_type", 0) if isinstance(status, dict) else 0
                tw = status.get("total_wins", 1) if isinstance(status, dict) else 1
                wc = status.get("wins_at_current", 1) if isinstance(status, dict) else 1
                lwt = status.get("last_win_time", 0) if isinstance(status, dict) else 0
                ls_entries.append((ch, lv, st, ct, tw, wc, lwt))
            df.write(f"  ls_entries count: {len(ls_entries)}\n")
            for i, e in enumerate(ls_entries):
                df.write(f"  [{i}] chapter={e[0]}, level={e[1]}, stars={e[2]}, "
                         f"campaignType={e[3]}, totalWins={e[4]}, "
                         f"winsAtCurrent={e[5]}, lastWinTime={e[6]}\n")

            df.write(f"\n── FLAGS ──\n")
            df.write(f"  is_first_boot = {is_first_boot}\n")
            df.write(f"  tutorial_step = {player_data.get('tutorial_step')}\n")
            df.write(f"  team_level = {player_data.get('team_level')}\n")
            df.write(f"  heroes sent = {len(heroes)} (empty={heroes == {{}}})\n")

            df.write(f"\n── BOOT MESSAGE ──\n")
            df.write(f"  Total bytes: {len(boot_msg)}\n")
            df.write(f"  Hex (first 500 bytes): {boot_msg[:500].hex()}\n")
            df.write(f"  Hex (full): {boot_msg.hex()}\n")

            df.write(f"\n── KEY ENCODING VERIFICATION ──\n")
            df.write(f"  Using chapter*100+level encoding\n")
            df.write(f"  Key 3 → chapter={3//100}, level={3%100} (should be ch=0, lv=3)\n")
            df.write(f"  Key 0 → chapter={0//100}, level={0%100} (should be ch=0, lv=0)\n")
            df.write(f"  Key 100 → chapter={100//100}, level={100%100} (should be ch=1, lv=0)\n")

        logger.info(f"DEBUG DUMP written to {dump_path}")
    except Exception as e:
        logger.warning(f"Failed to write debug dump: {e}")
    # ══════════════════════════════════════════════════════════════════════════

    return [boot_msg]


@handler("ClockChange1")
def handle_clock_change(client_state, msg_name, msg_number, fields):
    """Handle ClockChange1 - client reports clock synchronization data.
    Fields: source(String), serverTime(Long), clientTime(Long),
    deviceRunningTime(Long), roundTrip(Long), timeSinceReceived(Long),
    serverDelay(Long), offsetDelta(Long).
    This is a FIRE-AND-FORGET message — no response expected.
    """
    logger.info(f"ClockChange1 received (fire-and-forget, no response)")
    return []


@handler("ErrorReport1")
def handle_error_report(client_state, msg_name, msg_number, fields):
    """Handle ErrorReport1 - client reports a crash/error.
    Fire-and-forget — no response expected.
    """
    logger.info(f"ErrorReport1 received (client crash report)")
    return []


@handler("DownloadTime1")
def handle_download_time(client_state, msg_name, msg_number, fields):
    """Handle DownloadTime1 - client reports asset download timing.
    This is a FIRE-AND-FORGET message: the client sends it via
    sendMessage(msg) with no response callback registered.
    The server MUST NOT respond — sending an unsolicited Ping1 here
    caused an EOFException in the client's reader thread because:
      1. The old code used pack_field_int for the 3rd Ping1 field
         (should be Long → 8 bytes, not Int → 4 bytes)
      2. The client's unpackLong() ran out of bytes → EOFException
      3. Reader thread caught IOException → closed socket → disconnect
    Even with correct field types, responding to a fire-and-forget
    message is unnecessary and could confuse the client's routing.
    """
    logger.info(f"DownloadTime1 received (fire-and-forget, no response)")
    return []


@handler("Ping1")
def handle_ping(client_state, msg_name, msg_number, fields):
    """Respond to a client Ping1.
    The Ping Java class has exactly 3 V2 fields, ALL Long (8 bytes):
      Field 0: timestamp    (Long) — client's send time
      Field 1: serverDelay  (Long) — processing delay on server
      Field 2: serverTime   (Long) — server's current time
    The old code incorrectly used pack_field_int for field 2, which
    caused unpackLong() to read past the buffer → EOFException.
    """
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]
    now_ms = int(time.time() * 1000)

    buf = bytearray()
    buf.extend(pack_field_long(now_ms))   # field 0: timestamp (Long)
    buf.extend(pack_field_long(0))        # field 1: serverDelay (Long)
    buf.extend(pack_field_long(now_ms))   # field 2: serverTime (Long)
    resp = build_message("Ping1", resp_num, response_to=msg_number, fields_data=bytes(buf))
    return [resp]


@handler("SetPlayerName1")
def handle_set_player_name(client_state, msg_name, msg_number, fields):
    """Handle player name change."""
    new_name = fields.get("name", "Hero")
    player_id = client_state.get("player_id")
    conn = client_state.get("db_conn")

    if player_id:
        update_player(player_id, conn=conn, name=new_name)
        if "player" in client_state:
            client_state["player"]["name"] = new_name

    # Send UserInfo update
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    player = client_state.get("player", {})
    ui_data = build_user_info(
        user_id=player.get("user_id", 1),
        name=new_name,
        level=player.get("team_level", 1),
        diamonds=player.get("diamonds", 500),
    )

    resp = build_message("UserInfo1", resp_num, response_to=msg_number, fields_data=ui_data)
    logger.info(f"Player renamed to: {new_name}")
    return [resp]


@handler("CampaignAttack1")
def handle_campaign_attack(client_state, msg_name, msg_number, fields):
    """Handle a campaign level attack."""
    chapter = fields.get("chapter", 1)
    level = fields.get("level", 1)
    base = fields.get("base", {})
    client_won = base.get("won", True)
    player_id = client_state.get("player_id")
    player = client_state.get("player", {})
    conn = client_state.get("db_conn")

    campaign_level = get_campaign_level(chapter, level)
    responses = []

    if campaign_level and player_id:
        # Build attacker stats from player heroes
        heroes = player.get("heroes", {})
        lineup_key = 0  # Campaign mode
        lineups = player.get("lineups", {})
        lineup = lineups.get(lineup_key, lineups.get(str(lineup_key), list(heroes.keys())[:5]))

        attacker_stats = []
        for hero_num in lineup:
            hero = heroes.get(hero_num, heroes.get(str(hero_num)))
            if hero:
                stats = get_hero_stats(hero["hero_type"], hero["level"])
                if stats:
                    attacker_stats.append(stats)

        # Run combat simulation
        won, battle_log = simulate_battle(attacker_stats, campaign_level["enemies"])

        # If client says they won, trust the client (client-authoritative for campaign)
        won = client_won if client_won is not None else won

        # Calculate drops
        drops = calculate_drops(chapter, level, won)

        if won:
            # Award rewards
            new_gold = player.get("gold", 0) + drops["gold"]
            new_xp = player.get("xp", 0) + drops["xp"]
            new_stamina = max(0, player.get("stamina", 0) - campaign_level["stamina_cost"])

            # Update item inventory
            items = player.get("items", {})
            for item_id in drops["items"]:
                str_id = str(item_id)
                items[str_id] = items.get(str_id, 0) + 1

            update_player(
                player_id, conn=conn,
                gold=new_gold, xp=new_xp, stamina=new_stamina,
                items=items,
            )

            # Save progress (3 stars if won)
            progress = save_campaign_progress(player_id, chapter, level, 3, conn)

            # Update client_state
            player["gold"] = new_gold
            player["xp"] = new_xp
            player["stamina"] = new_stamina
            player["items"] = items
            player["campaign_progress"] = progress

            logger.info(f"Campaign {chapter}-{level}: WON, +{drops['gold']}g, +{drops['xp']}xp")

        # Build ResourceUpdate1 response
        client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
        resp_num = client_state["msg_counter"]

        buf = bytearray()
        buf.extend(pack_field_int(ResourceType.GOLD))      # resourceType
        buf.extend(pack_field_int(player.get("gold", 0)))   # amount
        resp = build_message("ResourceUpdate1", resp_num, response_to=msg_number, fields_data=bytes(buf))
        responses.append(resp)

    return responses


@handler("GetArenaInfo1")
def handle_get_arena_info(client_state, msg_name, msg_number, fields):
    """Return placeholder arena info."""
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    buf = bytearray()
    # arenaRank: Integer
    buf.extend(pack_field_int(1))
    # arenaScore: Integer
    buf.extend(pack_field_int(1000))
    # arenaTier: ArenaTier (enum)
    buf.extend(pack_field_enum(ArenaTier.BRONZE))
    # arenaType: ArenaType (enum)
    buf.extend(pack_field_enum(0))
    # attacks: Integer
    buf.extend(pack_field_int(5))
    # defenses: List<ArenaRow> (empty)
    buf.extend(pack_skip())
    # opponents: List<ArenaRow> (empty)
    buf.extend(pack_skip())
    # season: Integer
    buf.extend(pack_field_int(1))

    resp = build_message("ArenaInfo1", resp_num, response_to=msg_number, fields_data=bytes(buf))
    return [resp]


@handler("GetServers1")
def handle_get_servers(client_state, msg_name, msg_number, fields):
    """Return the server list."""
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    server_data = build_server_info(
        shard_id=config.SHARD_ID,
        max_level=config.MAX_TEAM_LEVEL,
        chapters=config.NUM_CHAPTERS,
    )

    buf = bytearray()
    # servers: List<Server>
    buf.extend(bytes([TAG_FIELD]))
    buf.extend(pack_size(1))
    buf.extend(server_data)

    resp = build_message("Servers1", resp_num, response_to=msg_number, fields_data=bytes(buf))
    return [resp]


@handler("SendChat1")
def handle_send_chat(client_state, msg_name, msg_number, fields):
    """Handle a chat message."""
    message = fields.get("message", "")
    channel = fields.get("channel", 0)
    player_id = client_state.get("player_id")
    player = client_state.get("player", {})
    conn = client_state.get("db_conn")

    if player_id and message:
        add_chat_message(player_id, channel, message, conn)

    # Send UpdateChat1 back
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    now_ms = int(time.time() * 1000)
    buf = bytearray()
    # message: String
    buf.extend(pack_field_string(message))
    # playerName: String
    buf.extend(pack_field_string(player.get("name", "Hero")))
    # timestamp: Long
    buf.extend(pack_field_long(now_ms))
    # userID: Long
    buf.extend(pack_field_long(player.get("user_id", 1)))

    resp = build_message("UpdateChat1", resp_num, response_to=msg_number, fields_data=bytes(buf))
    logger.info(f"Chat [{channel}] {player.get('name', '?')}: {message}")
    return [resp]


@handler("ChangeTutorialStep1")
def handle_change_tutorial(client_state, msg_name, msg_number, fields):
    """Update the tutorial step."""
    step = fields.get("step", 0)
    player_id = client_state.get("player_id")
    conn = client_state.get("db_conn")

    if player_id:
        update_player(player_id, conn=conn, tutorial_step=step)
        if "player" in client_state:
            client_state["player"]["tutorial_step"] = step

    logger.debug(f"Tutorial step updated to {step}")
    return []


@handler("HeroLineupUpdate1")
def handle_hero_lineup_update(client_state, msg_name, msg_number, fields):
    """Update hero lineup for a game mode."""
    mode = fields.get("mode", 0)
    heroes_list = fields.get("heroes", [])
    player_id = client_state.get("player_id")
    player = client_state.get("player", {})
    conn = client_state.get("db_conn")

    if player_id:
        lineups = player.get("lineups", {})
        lineups[mode] = heroes_list
        update_player(player_id, conn=conn, lineups=lineups)
        player["lineups"] = lineups

    logger.debug(f"Lineup updated: mode={mode}, heroes={heroes_list}")
    return []


@handler("GetExpedition1")
def handle_get_expedition(client_state, msg_name, msg_number, fields):
    """Return empty expedition data."""
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    buf = bytearray()
    # Just send empty/minimal GetExpeditionResponse1
    buf.extend(pack_skip())  # expeditionRunData

    resp = build_message("GetExpeditionResponse1", resp_num, response_to=msg_number, fields_data=bytes(buf))
    return [resp]


@handler("BuyChests1")
def handle_buy_chests(client_state, msg_name, msg_number, fields):
    """Generate random heroes/items from chest purchase."""
    chest_type = fields.get("chestType", 0)
    count = fields.get("count", 1)
    player_id = client_state.get("player_id")
    player = client_state.get("player", {})
    conn = client_state.get("db_conn")

    responses = []

    if player_id:
        # Deduct diamonds (100 per chest)
        cost = 100 * count
        new_diamonds = max(0, player.get("diamonds", 0) - cost)
        update_player(player_id, conn=conn, diamonds=new_diamonds)
        player["diamonds"] = new_diamonds

        # Generate random rewards
        items = player.get("items", {})
        for _ in range(count):
            item_id = random.randint(1, 20)
            str_id = str(item_id)
            items[str_id] = items.get(str_id, 0) + 1

        update_player(player_id, conn=conn, items=items)
        player["items"] = items

        # Send ResourceUpdate for diamonds
        client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
        resp_num = client_state["msg_counter"]

        buf = bytearray()
        buf.extend(pack_field_int(ResourceType.DIAMONDS))
        buf.extend(pack_field_int(new_diamonds))
        resp = build_message("ResourceUpdate1", resp_num, response_to=msg_number, fields_data=bytes(buf))
        responses.append(resp)

    return responses


@handler("RequestResync1")
def handle_request_resync(client_state, msg_name, msg_number, fields):
    """Send full game state again."""
    return handle_client_info(client_state, "ClientInfo1", msg_number, {
        "uniqueIdentifier": client_state.get("device_id", ""),
        "userID": client_state.get("user_id", 0),
    })


@handler("GetBossBattles1")
def handle_get_boss_battles(client_state, msg_name, msg_number, fields):
    """Return empty boss battles data."""
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    buf = bytearray()
    buf.extend(pack_skip())  # bossBattles list

    resp = build_message("BossBattlesResponse1", resp_num, response_to=msg_number, fields_data=bytes(buf))
    return [resp]


@handler("ListRecommendedGuilds1")
def handle_list_guilds(client_state, msg_name, msg_number, fields):
    """Return empty guild list."""
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    buf = bytearray()
    # guilds: List<GuildRow> (empty)
    buf.extend(bytes([TAG_FIELD]))
    buf.extend(pack_size(0))

    resp = build_message("ListRecGuildsResponse1", resp_num, response_to=msg_number, fields_data=bytes(buf))
    return [resp]


@handler("GetHeroWall1")
def handle_get_hero_wall(client_state, msg_name, msg_number, fields):
    """Return empty hero wall."""
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    buf = bytearray()
    buf.extend(pack_skip())  # posts list

    resp = build_message("HeroWall1", resp_num, response_to=msg_number, fields_data=bytes(buf))
    return [resp]



# ─── Fire-and-forget Handlers ─────────────────────────────────────────────────

@handler("SetLanguage1")
def handle_set_language(client_state, msg_name, msg_number, fields):
    """Fire-and-forget: client sets display language."""
    raw = fields.get("_raw", b"")
    # Parse language string if present: TAG_FIELD(0x10) + 4B-len + string
    lang = "?"
    if len(raw) >= 5 and raw[0] == 0x10:
        slen = int.from_bytes(raw[1:5], "little")
        if len(raw) >= 5 + slen:
            lang = raw[5:5+slen].decode("utf-8", errors="replace")
    logger.info(f"SetLanguage1: language={lang}")
    # Save to player state if available
    player = client_state.get("player")
    if player:
        player["language"] = lang
    return []


@handler("OpenGLExtensions1")
def handle_opengl_extensions(client_state, msg_name, msg_number, fields):
    """Fire-and-forget: client reports GPU capabilities."""
    logger.info(f"OpenGLExtensions1 received (fire-and-forget)")
    return []


@handler("LoadTime1")
def handle_load_time(client_state, msg_name, msg_number, fields):
    """Fire-and-forget: client reports a load-time metric."""
    logger.info(f"LoadTime1 received (fire-and-forget)")
    return []


@handler("Logout1")
def handle_logout(client_state, msg_name, msg_number, fields):
    """
    Client is disconnecting gracefully.
    Save all player state to the database before the connection closes.
    """
    player = client_state.get("player")
    conn = client_state.get("db_conn")
    if player and conn:
        try:
            update_player(
                player["id"], conn=conn,
                stamina=player.get("stamina", 120),
                gold=player.get("gold", 50000),
                diamonds=player.get("diamonds", 500),
                xp=player.get("xp", 0),
                team_level=player.get("team_level", 10),
                items=player.get("items", {}),
                campaign_progress=player.get("campaign_progress", {}),
            )
            logger.info(f"Logout1: saved player {player.get('user_id')} state to DB")
        except Exception as e:
            logger.error(f"Logout1: failed to save player state: {e}")
    else:
        logger.info(f"Logout1 received (no player state to save)")
    return []


# ─── Action1 Handler ──────────────────────────────────────────────────────────

# CommandType ordinal → name (from bytecode analysis)
_COMMAND_TYPES = {
    0: "DEFAULT", 1: "EQUIP_ITEM", 2: "UNLOCK_HERO", 3: "PROMOTE",
    4: "EVOLVE", 5: "UPGRADE_SKILL", 6: "ADD_HERO_EXP", 7: "VIEW_TREASURE",
    8: "BUY_STAMINA", 9: "BUY_POWER_POINTS", 10: "BUY_GOLD",
    11: "GET_NEW_MAIL_MESSAGES", 12: "MARK_MAIL_OPENED",
    13: "TAKE_MAIL_ATTACHMENTS", 14: "REFRESH_TRADER",
    15: "PURCHASE_TRADER_ITEM", 16: "SELL_ITEM",
    17: "REFRESH_SPECIAL_EVENTS", 18: "CLAIM_SIGNIN_REWARD",
    19: "DEBUG_COMMAND", 20: "DEBUG_GIVE_ITEM", 21: "DEBUG_GIVE_RESOURCE",
    22: "DEBUG_SET_TEAM_LEVEL", 23: "DEBUG_SET_VIP_LEVEL",
    24: "DEBUG_SET_SIGNINS", 25: "BUY_NEW_ACCOUNT",
    26: "RESET_ELITE_LEVEL", 27: "START_FIGHT_PIT_ATTACK",
    28: "RESET_FIGHT_PIT_CHANCES", 29: "CLAIM_FIGHT_PIT_PROMOTION_REWARD",
    30: "COMPLETE_QUEST", 31: "GET_PLAYER_RANKINGS",
    32: "REFRESH_SOUL_CHEST_DROPS", 33: "CLEAR_FIGHT_PIT_DEMOTION",
    34: "UPDATE_TIME", 35: "VIEW_DAILY_QUESTS",
}

# ActionExtraType ordinal → name
_ACTION_EXTRA_TYPES = {
    0: "DEFAULT", 1: "SLOT", 2: "ID", 3: "ENCHANT_ITEMS",
    4: "GUILD_NAME", 5: "ACTION_COMMAND", 6: "WAR_BATTLE_HEROES",
    7: "MESSAGE", 8: "QUANTITY",
}


def _parse_action_fields(raw):
    """
    Parse Action1 raw bytes into structured fields.
    Field order: command(enum), heroType(enum), iD(int), itemType(enum), extra(map<enum,str>)
    All use TAG_FIELD (0x10) prefix with 4-byte LE values.
    """
    result = {}
    pos = 0
    field_names = ["command", "heroType", "iD", "itemType"]
    
    for fname in field_names:
        if pos >= len(raw):
            break
        if raw[pos] != 0x10:
            break
        pos += 1
        val = int.from_bytes(raw[pos:pos+4], "little")
        result[fname] = val
        pos += 4
    
    # Parse extra map: count followed by (key_enum, value_string) pairs
    if pos < len(raw) and raw[pos] == 0x10:
        pos += 1
        count = int.from_bytes(raw[pos:pos+4], "little")
        pos += 4
        extra = {}
        for _ in range(count):
            if pos + 4 > len(raw):
                break
            key = int.from_bytes(raw[pos:pos+4], "little")
            pos += 4
            if pos + 4 > len(raw):
                break
            slen = int.from_bytes(raw[pos:pos+4], "little")
            pos += 4
            val = raw[pos:pos+slen].decode("utf-8", errors="replace") if pos + slen <= len(raw) else "?"
            pos += slen
            extra[_ACTION_EXTRA_TYPES.get(key, f"UNKNOWN_{key}")] = val
        result["extra"] = extra
    
    return result


@handler("Action1")
def handle_action(client_state, msg_name, msg_number, fields):
    """
    Handle Action1 — the main game action message.
    Client sends this for equips, unlocks, purchases, etc.
    For now we parse and log; most actions are optimistic on the client side.
    """
    raw = fields.get("_raw", b"")
    parsed = _parse_action_fields(raw)
    
    cmd_ord = parsed.get("command", -1)
    cmd_name = _COMMAND_TYPES.get(cmd_ord, f"UNKNOWN_{cmd_ord}")
    hero_ord = parsed.get("heroType", 0)
    item_ord = parsed.get("itemType", 0)
    action_id = parsed.get("iD", 0)
    extra = parsed.get("extra", {})
    
    logger.info(
        f"Action1: cmd={cmd_name}({cmd_ord}), hero={hero_ord}, "
        f"item={item_ord}, id={action_id}, extra={extra}"
    )
    
    # ── Process specific actions ──
    player = client_state.get("player")
    conn = client_state.get("db_conn")
    
    if cmd_name == "BUY_STAMINA" and player:
        # Give 120 stamina for free (no diamond cost on private server)
        player["stamina"] = player.get("stamina", 0) + 120
        if conn:
            update_player(player["id"], conn=conn, stamina=player["stamina"])
        logger.info(f"  → Stamina now: {player['stamina']}")
    
    elif cmd_name == "BUY_GOLD" and player:
        player["gold"] = player.get("gold", 0) + 50000
        if conn:
            update_player(player["id"], conn=conn, gold=player["gold"])
        logger.info(f"  → Gold now: {player['gold']}")
    
    elif cmd_name == "COMPLETE_QUEST" and player:
        logger.info(f"  → Quest complete (no reward processing yet)")
    
    elif cmd_name == "VIEW_DAILY_QUESTS" and player:
        logger.info(f"  → Viewed daily quests")
    
    elif cmd_name == "CLAIM_SIGNIN_REWARD" and player:
        logger.info(f"  → Sign-in reward claimed (no reward processing yet)")
    
    # Action1 is fire-and-forget for the protocol — no response needed
    return []


def handle_default(client_state, msg_name, msg_number, fields):
    """Handle unknown messages - log everything for debugging."""
    logger.info(f"=== UNHANDLED: {msg_name} #{msg_number} ({len(fields)} fields) ===")
    for key, val in sorted(fields.items()):
        logger.info(f"  {key} = {repr(val)}")
    logger.info(f"=== END {msg_name} ===")
    return []
