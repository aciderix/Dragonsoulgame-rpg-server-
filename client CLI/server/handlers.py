"""
DragonSoul Server Emulator - Message Handlers
Processes incoming messages and builds protocol responses.

FIXED: Removed debug block from handle_client_info, restored BootData1 response.
"""

import json
import time
import random
import logging

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
            int(k): v for k, v in player["lineups"].items()
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
    return [boot_msg]


@handler("DownloadTime1")
def handle_download_time(client_state, msg_name, msg_number, fields):
    """Handle DownloadTime1 - client reports asset download timing.
    Respond with a Ping1 to signal the server is alive and ready;
    this keeps the TCP connection open so the game proceeds to the
    town-loading phase instead of disconnecting and crashing.
    """
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]
    now_ms = int(time.time() * 1000)
    buf = bytearray()
    buf.extend(pack_field_long(now_ms))   # clientTime
    buf.extend(pack_field_long(now_ms))   # lastServerTime
    buf.extend(pack_field_int(0))         # sequenceNumber
    buf.append(TAG_END)
    ping = build_message("Ping1", resp_num, response_to=msg_number, fields_data=bytes(buf))
    logger.info(f"DownloadTime1 → responding with Ping1 to keep session alive")
    return [ping]


@handler("Ping1")
def handle_ping(client_state, msg_name, msg_number, fields):
    """Respond to a ping."""
    client_state["msg_counter"] = client_state.get("msg_counter", 0) + 1
    resp_num = client_state["msg_counter"]

    # Ping1 response: clientTime, lastServerTime, sequenceNumber
    buf = bytearray()
    buf.extend(pack_field_long(int(time.time() * 1000)))  # clientTime (echo back as server time)
    buf.extend(pack_field_long(int(time.time() * 1000)))  # lastServerTime
    buf.extend(pack_field_int(fields.get("sequenceNumber", 0)))  # sequenceNumber
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


def handle_default(client_state, msg_name, msg_number, fields):
    """Handle unknown messages - log everything for debugging."""
    logger.info(f"=== UNHANDLED: {msg_name} #{msg_number} ({len(fields)} fields) ===")
    for key, val in sorted(fields.items()):
        logger.info(f"  {key} = {repr(val)}")
    logger.info(f"=== END {msg_name} ===")
    return []
