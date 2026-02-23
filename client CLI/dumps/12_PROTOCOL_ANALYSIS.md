# DragonSoul - Protocol Analysis: Game Client vs Python Server

## Connection Flow (from game bytecode)

### 1. TCP Connection
- `NetworkProvider.setAddress(String host, int port)`
- `NetworkProvider.connectToServer(Runnable onSuccess, Runnable onFailure)`
- TCP socket with XOR encryption layer (`XORConnectionWrapper`)

### 2. XOR Encryption Layer
Class: `com.perblue.common.i.a`
- Key-based XOR cipher with rolling position counters
- `wrapOut(byte[])` → encrypt + compress (Deflater) outgoing
- `wrapIn(byte[])` → decrypt + decompress (Inflater) incoming
- Uses `keyIn[]`, `keyOut[]` byte arrays
- Rolling `posIn`, `posOut` counters

### 3. Message Serialization
Base class: `com.perblue.a.a.i`
- Each message has `FULL_NAME` (e.g., "ClientInfo1", "BootData1")
- Has `messageNumber` and `responseMessageNumber` for request-response matching
- Has `version` field for protocol versioning
- `writeAll(b writer)` → serialize to binary
- Reader interface `a` → deserialize from binary
- `MessageFactory.getInstance().readMessage(reader)` → deserialize any message

### 4. Login Sequence
1. Client connects via TCP
2. Client sends `ClientInfo1` with:
   - `userID` (Long), `uniqueIdentifier` (String)
   - `version` (Integer), `fullVersion` (Integer)
   - `platform` (Platform enum), `shardID` (Integer)
   - `language`, `country`, `timeZone`, `timeOffset`
   - Device info: `phoneModel`, `screenWidth/Height`, etc.
   - `isReconnect` (Boolean), `loginRequestID` (String)
   - `statVersions` (Map), `privateLoginInfo` (PrivateUserInfo)
3. Server responds with `BootData1`:
   - `serverTime` (Long), `firstBoot` (Boolean)
   - `userInfo` (UserInfo), `privateUserInfo` (PrivateUserInfo)
   - `userExtra` (UserExtra) 
   - `guildInfo` (GuildInfo)
   - `mailMessages` (List)
   - `statData` (Map), `specialEvents`, `allContests`
   - `iAPProducts`, `possibleChestDrops`
   - `titanTemples`, `warRedDotInfo`
   - `loginEvent` (String), `updateAvailable` (Boolean)
   - `currentServer` (Server)

### 5. Python Server Comparison
The Python server (`protocol.py`, `server.py`, `handlers.py`) implements:
- TCP on port 9001 (configurable)
- XOR key: `b'\x5a\xa5\x3c\xc3\x69\x96\x55\xaa'`
- Message format: `[4 bytes length BE][XOR-encrypted payload]`
- Payload: `[message_name\0][field_name\0][type_byte][value...]`
- Type bytes: 0=end, 1=int32, 2=string, 3=bool, 4=int64, 5=float, 6=list, 7=map, 8=submessage

### 6. Key Message Types (from 04_MESSAGE_REGISTRY.md)
~300 message types total. Key ones for server implementation:
- `ClientInfo1` (45 fields) - login request
- `BootData1` (19 fields) - login response  
- `Ping1` (5 fields) - keepalive
- `Action1` (6 fields) - game action
- `ActionGroup1` (3 fields) - batched actions
- `GetUserSaveData1` (2 fields) - save data request
- `UserInfo1` - user profile
- `UserExtra1` - extended user data
- `CampaignAttack1` - campaign battle
- `ArenaAttack1` - PvP arena
- `Chat1` - chat message
- `CreateGuild1` - guild creation
