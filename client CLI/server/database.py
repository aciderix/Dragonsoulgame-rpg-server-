"""
DragonSoul Server Emulator - SQLite Database Layer
Player persistence, hero storage, and chat messages.
"""

import sqlite3
import json
import time
import logging

from config import (
    DB_PATH, STARTING_GOLD, STARTING_STAMINA, STARTING_DIAMONDS,
    STARTING_XP, STARTING_TEAM_LEVEL,
)
from gamedata import get_starter_heroes, get_hero_stats

logger = logging.getLogger("database")


# ─── Schema ────────────────────────────────────────────────────────────────────

_SCHEMA = """
CREATE TABLE IF NOT EXISTS players (
    id              INTEGER PRIMARY KEY AUTOINCREMENT,
    device_id       TEXT    UNIQUE NOT NULL,
    user_id         INTEGER UNIQUE NOT NULL,
    name            TEXT    NOT NULL DEFAULT 'Hero',
    team_level      INTEGER NOT NULL DEFAULT 1,
    xp              INTEGER NOT NULL DEFAULT 0,
    gold            INTEGER NOT NULL DEFAULT 0,
    diamonds        INTEGER NOT NULL DEFAULT 0,
    stamina         INTEGER NOT NULL DEFAULT 120,
    raid_tickets    INTEGER NOT NULL DEFAULT 5,
    tutorial_step   INTEGER NOT NULL DEFAULT 0,
    campaign_progress TEXT NOT NULL DEFAULT '{}',
    lineups         TEXT    NOT NULL DEFAULT '{}',
    items           TEXT    NOT NULL DEFAULT '{}',
    created_at      REAL    NOT NULL,
    last_login      REAL    NOT NULL
);

CREATE TABLE IF NOT EXISTS heroes (
    id          INTEGER PRIMARY KEY AUTOINCREMENT,
    player_id   INTEGER NOT NULL,
    hero_num    INTEGER NOT NULL,
    hero_type   INTEGER NOT NULL,
    level       INTEGER NOT NULL DEFAULT 1,
    stars       INTEGER NOT NULL DEFAULT 1,
    rarity      INTEGER NOT NULL DEFAULT 0,
    xp          INTEGER NOT NULL DEFAULT 0,
    FOREIGN KEY (player_id) REFERENCES players(id),
    UNIQUE(player_id, hero_num)
);

CREATE TABLE IF NOT EXISTS chat_messages (
    id          INTEGER PRIMARY KEY AUTOINCREMENT,
    player_id   INTEGER NOT NULL,
    channel     INTEGER NOT NULL DEFAULT 0,
    message     TEXT    NOT NULL,
    timestamp   REAL    NOT NULL,
    FOREIGN KEY (player_id) REFERENCES players(id)
);

CREATE INDEX IF NOT EXISTS idx_heroes_player ON heroes(player_id);
CREATE INDEX IF NOT EXISTS idx_chat_channel   ON chat_messages(channel, timestamp);
"""

# ─── User ID Counter ───────────────────────────────────────────────────────────
# We use a simple auto-incrementing user_id starting from 10001

_COUNTER_TABLE = """
CREATE TABLE IF NOT EXISTS counters (
    name  TEXT PRIMARY KEY,
    value INTEGER NOT NULL DEFAULT 0
);
INSERT OR IGNORE INTO counters (name, value) VALUES ('next_user_id', 10001);
"""


def _get_next_user_id(conn):
    """Atomically get and increment the next user_id."""
    cur = conn.execute("UPDATE counters SET value = value + 1 WHERE name = 'next_user_id'")
    row = conn.execute("SELECT value FROM counters WHERE name = 'next_user_id'").fetchone()
    return row[0] - 1  # Return the value before increment


def _get_next_hero_num(conn, player_id):
    """Get the next hero_num for a player."""
    row = conn.execute(
        "SELECT COALESCE(MAX(hero_num), -1) + 1 FROM heroes WHERE player_id = ?",
        (player_id,)
    ).fetchone()
    return row[0]


# ─── Initialization ───────────────────────────────────────────────────────────

def init_db(db_path=None):
    """Create all tables. Returns a connection."""
    path = db_path or DB_PATH
    conn = sqlite3.connect(path)
    conn.row_factory = sqlite3.Row
    conn.execute("PRAGMA journal_mode=WAL")
    conn.executescript(_SCHEMA)
    conn.executescript(_COUNTER_TABLE)
    conn.commit()
    logger.info(f"Database initialized at {path}")
    return conn


# ─── Player Operations ────────────────────────────────────────────────────────

def get_or_create_player(device_id, conn=None):
    """
    Get existing player by device_id or create a new one with starter heroes.
    Returns a dict with all player data.
    """
    own_conn = conn is None
    if own_conn:
        conn = sqlite3.connect(DB_PATH)
        conn.row_factory = sqlite3.Row

    try:
        # Try to find existing player
        row = conn.execute(
            "SELECT * FROM players WHERE device_id = ?", (device_id,)
        ).fetchone()

        if row:
            # Update last login
            conn.execute(
                "UPDATE players SET last_login = ? WHERE id = ?",
                (time.time(), row["id"])
            )
            conn.commit()
            player = _row_to_player(row)
            player["heroes"] = get_player_heroes(player["id"], conn)
            return player

        # Create new player
        now = time.time()
        user_id = _get_next_user_id(conn)

        # Default lineups: mode 0 (campaign) with hero_nums 0-4
        default_lineups = {0: [0, 1, 2, 3, 4]}

        conn.execute(
            """INSERT INTO players
               (device_id, user_id, name, team_level, xp, gold, diamonds,
                stamina, raid_tickets, tutorial_step, campaign_progress,
                lineups, items, created_at, last_login)
               VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)""",
            (
                device_id, user_id, "Hero", STARTING_TEAM_LEVEL, STARTING_XP,
                STARTING_GOLD, STARTING_DIAMONDS, STARTING_STAMINA,
                5, 999, "{}", json.dumps(default_lineups), "{}", now, now,
            ),
        )

        player_id = conn.execute("SELECT last_insert_rowid()").fetchone()[0]

        # Insert starter heroes
        starters = get_starter_heroes()
        for i, hero_cfg in enumerate(starters):
            conn.execute(
                """INSERT INTO heroes (player_id, hero_num, hero_type, level, stars, rarity, xp)
                   VALUES (?, ?, ?, ?, ?, ?, ?)""",
                (player_id, i, hero_cfg["hero_type"], hero_cfg["level"],
                 hero_cfg["stars"], hero_cfg["rarity"], 0),
            )

        conn.commit()

        player = {
            "id": player_id,
            "device_id": device_id,
            "user_id": user_id,
            "name": "Hero",
            "team_level": STARTING_TEAM_LEVEL,
            "xp": STARTING_XP,
            "gold": STARTING_GOLD,
            "diamonds": STARTING_DIAMONDS,
            "stamina": STARTING_STAMINA,
            "raid_tickets": 5,
            "tutorial_step": 999,
            "campaign_progress": {},
            "lineups": default_lineups,
            "items": {},
            "created_at": now,
            "last_login": now,
        }
        player["heroes"] = get_player_heroes(player_id, conn)

        logger.info(f"Created new player: user_id={user_id}, device={device_id}")
        return player

    finally:
        if own_conn:
            conn.close()


def get_player_by_user_id(user_id, conn=None):
    """Get player by user_id. Returns dict or None."""
    own_conn = conn is None
    if own_conn:
        conn = sqlite3.connect(DB_PATH)
        conn.row_factory = sqlite3.Row

    try:
        row = conn.execute(
            "SELECT * FROM players WHERE user_id = ?", (user_id,)
        ).fetchone()

        if row:
            player = _row_to_player(row)
            player["heroes"] = get_player_heroes(player["id"], conn)
            return player
        return None
    finally:
        if own_conn:
            conn.close()


def get_player_heroes(player_id, conn=None):
    """
    Get all heroes for a player.
    Returns dict of hero_num -> hero_data.
    """
    own_conn = conn is None
    if own_conn:
        conn = sqlite3.connect(DB_PATH)
        conn.row_factory = sqlite3.Row

    try:
        rows = conn.execute(
            "SELECT * FROM heroes WHERE player_id = ? ORDER BY hero_num",
            (player_id,)
        ).fetchall()

        heroes = {}
        for row in rows:
            hero_num = row["hero_num"]
            stats = get_hero_stats(row["hero_type"], row["level"])
            heroes[hero_num] = {
                "id": row["id"],
                "player_id": row["player_id"],
                "hero_num": hero_num,
                "hero_type": row["hero_type"],
                "level": row["level"],
                "stars": row["stars"],
                "rarity": row["rarity"],
                "xp": row["xp"],
                "health": stats["health"] if stats else 1000,
            }
        return heroes
    finally:
        if own_conn:
            conn.close()


def update_player(player_id, conn=None, **kwargs):
    """Update player fields. Handles JSON serialization for dict fields."""
    own_conn = conn is None
    if own_conn:
        conn = sqlite3.connect(DB_PATH)
        conn.row_factory = sqlite3.Row

    try:
        if not kwargs:
            return

        sets = []
        vals = []
        for key, value in kwargs.items():
            if key in ("campaign_progress", "lineups", "items"):
                value = json.dumps(value) if isinstance(value, dict) else value
            sets.append(f"{key} = ?")
            vals.append(value)
        vals.append(player_id)

        sql = f"UPDATE players SET {', '.join(sets)} WHERE id = ?"
        conn.execute(sql, vals)
        conn.commit()
    finally:
        if own_conn:
            conn.close()


def update_hero(hero_id, conn=None, **kwargs):
    """Update hero fields."""
    own_conn = conn is None
    if own_conn:
        conn = sqlite3.connect(DB_PATH)
        conn.row_factory = sqlite3.Row

    try:
        if not kwargs:
            return

        sets = []
        vals = []
        for key, value in kwargs.items():
            sets.append(f"{key} = ?")
            vals.append(value)
        vals.append(hero_id)

        sql = f"UPDATE heroes SET {', '.join(sets)} WHERE id = ?"
        conn.execute(sql, vals)
        conn.commit()
    finally:
        if own_conn:
            conn.close()


def save_campaign_progress(player_id, chapter, level, stars, conn=None):
    """Save campaign level completion. Merges into existing progress."""
    own_conn = conn is None
    if own_conn:
        conn = sqlite3.connect(DB_PATH)
        conn.row_factory = sqlite3.Row

    try:
        row = conn.execute(
            "SELECT campaign_progress FROM players WHERE id = ?", (player_id,)
        ).fetchone()

        progress = json.loads(row["campaign_progress"]) if row else {}

        # Use chapter*100+level to support chapters with >10 levels
        # (e.g., chapter 0 has 19 levels: 0-0 through 0-18)
        key = str(chapter * 100 + level)
        existing = progress.get(key, {})
        # Only update if new stars are higher
        if stars > existing.get("stars", 0):
            progress[key] = {"stars": stars, "completed": True}

        conn.execute(
            "UPDATE players SET campaign_progress = ? WHERE id = ?",
            (json.dumps(progress), player_id)
        )
        conn.commit()
        return progress
    finally:
        if own_conn:
            conn.close()


# ─── Chat ──────────────────────────────────────────────────────────────────────

def add_chat_message(player_id, channel, message, conn=None):
    """Store a chat message."""
    own_conn = conn is None
    if own_conn:
        conn = sqlite3.connect(DB_PATH)
        conn.row_factory = sqlite3.Row

    try:
        now = time.time()
        conn.execute(
            "INSERT INTO chat_messages (player_id, channel, message, timestamp) VALUES (?, ?, ?, ?)",
            (player_id, channel, message, now),
        )
        conn.commit()
        return now
    finally:
        if own_conn:
            conn.close()


def get_recent_chat(channel, limit=50, conn=None):
    """Get recent chat messages for a channel."""
    own_conn = conn is None
    if own_conn:
        conn = sqlite3.connect(DB_PATH)
        conn.row_factory = sqlite3.Row

    try:
        rows = conn.execute(
            """SELECT cm.*, p.name AS player_name, p.user_id
               FROM chat_messages cm
               JOIN players p ON cm.player_id = p.id
               WHERE cm.channel = ?
               ORDER BY cm.timestamp DESC
               LIMIT ?""",
            (channel, limit),
        ).fetchall()

        return [
            {
                "id": row["id"],
                "player_id": row["player_id"],
                "player_name": row["player_name"],
                "user_id": row["user_id"],
                "channel": row["channel"],
                "message": row["message"],
                "timestamp": row["timestamp"],
            }
            for row in reversed(rows)  # Return in chronological order
        ]
    finally:
        if own_conn:
            conn.close()


# ─── Helpers ───────────────────────────────────────────────────────────────────

def _row_to_player(row):
    """Convert a sqlite3.Row to a player dict."""
    return {
        "id": row["id"],
        "device_id": row["device_id"],
        "user_id": row["user_id"],
        "name": row["name"],
        "team_level": row["team_level"],
        "xp": row["xp"],
        "gold": row["gold"],
        "diamonds": row["diamonds"],
        "stamina": row["stamina"],
        "raid_tickets": row["raid_tickets"],
        "tutorial_step": row["tutorial_step"],
        "campaign_progress": json.loads(row["campaign_progress"]),
        "lineups": json.loads(row["lineups"]),
        "items": json.loads(row["items"]),
        "created_at": row["created_at"],
        "last_login": row["last_login"],
    }
