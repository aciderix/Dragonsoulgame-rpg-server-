import java.io.*;
import java.net.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * DragonSoul TCP Client - FULL Android APK replica.
 *
 * Reproduces the EXACT network flow of the real Android game client:
 *   1. HTTP GET /login  → gets requestID + TCP address
 *   2. TCP connect       → XOR-encrypted channel
 *   3. Send ClientInfo1  → 44 fields, 324 statVersions, real device data
 *   4. Recv BootData1    → full player bootstrap
 *   5. HTTP GET /live/index.txt → asset manifest
 *
 * Uses the REAL game classes from game-bytecode.jar via reflection.
 * Produces byte-identical output to the Android APK for the same input values.
 */
public class RealGameClient {

    // ══════════════════════════════════════════════════════════
    //  DEVICE CONFIG - matches the real Android capture
    // ══════════════════════════════════════════════════════════
    static final String LANGUAGE        = "fr";
    static final int    PLATFORM        = 1; // ANDROID
    static final String SYS_DESC        = "AP3A.240905.015.A2,obsidian_eea";
    static final String SYS_VERSION     = "15";
    static final int    SDK_VERSION     = 35;
    static final String PHONE_NAME      = "null";
    static final String SYS_NAME        = "";
    static final String UNIQUE_ID       = "24bbcd66662b3fcc";
    static final String CARRIER         = "Bouygues Telecom";
    static final String NET_TYPE        = "OTHER:13";
    static final String AP_MAC          = "02:00:00:00:00:00";
    static final String AP_SSID         = "<unknown ssid>";
    static final boolean CELL           = true;
    static final boolean WIFI           = false;
    static final String IMEI            = "null";
    static final int    VERSION         = 151;
    static final int    TIME_OFFSET     = 3600000;
    static final String REFERAL         = "null";
    static final String RAW_LANG        = "fr";
    static final int    SCREEN_W        = 2400;
    static final int    SCREEN_H        = 1080;
    static final float  SCREEN_DENSITY  = 3.0f;
    static final String PHONE_MODEL     = "24116RACCG";
    static final String REG_ID          = "eKenqbYtPkU:APA91bFbXJZCw8GGnUeSeAw71wbvrXAP1D4wpHgSpJMXFYKBQOZ5tTMD2WbXhTXM3eG_Rj04TIzNXPZR-J7ikGMYUV3AzQkWRWedJTnmTQC9jfBO5131dVo";
    static final String COUNTRY         = "";
    static final float  DPI_X           = 394.5799865722656f;
    static final float  DPI_Y           = 393.3909912109375f;
    static final int    FULL_VERSION    = 123151;
    static final String AD_ID           = "cc0e20fc-be1b-44e2-a7be-5309b63d521a";
    static final int    CONFIG_HASH     = 0;
    static final int    SCREEN_SIZE     = 2;
    static final String PACKAGE_NAME    = "com.perblue.dragonsoul";
    static final String NOTIF_TYPE      = "null";
    static final boolean IS_RECONNECT   = false;
    static final int    BUILD_SOURCE    = 1; // GOOGLE
    static final long   USER_ID         = 0L;
    static final String SIGNATURE       = "ODbqYL/LKnunpmMp2DczSjva0uI=\n";
    static final boolean DONT_LINK      = false;
    static final boolean LIMIT_AD       = false;
    static final int    SHARD_ID        = 0;
    static final String TIME_ZONE       = "Europe/Paris";

    static final String USER_AGENT = "Dalvik/2.1.0 (Linux; U; Android 15; 24116RACCG Build/AP3A.240905.015.A2)";

    // ══════════════════════════════════════════════════════════
    //  REFLECTED GAME CLASSES
    // ══════════════════════════════════════════════════════════
    private Object xorWrapper;
    private Method wrapOutMethod, wrapInMethod;
    private Class<?> writerClass, readerClass, utilsClass;
    private Method packIntMethod, unpackIntMethod, packStringMethod, unpackStringMethod;

    private Socket socket;
    private OutputStream out;
    private BufferedInputStream in;
    private int messageCounter = 1;

    // ══════════════════════════════════════════════════════════
    //  INITIALIZATION
    // ══════════════════════════════════════════════════════════

    public RealGameClient() throws Exception {
        loadGameClasses();
    }

    private void loadGameClasses() throws Exception {
        // XOR wrapper (same key as server: BC 4F 7C 02 84 02 2C 97)
        // MUST use ClientXORConnectionWrapper (not ClientXORConnectionWrapper)!
        // NetworkProvider$3 uses ClientXORConnectionWrapper.class at offset 102.
        // Key: 02 A6 EE D5 D0 BC 6A 98 (different from old ClientXORConnectionWrapper: BC 4F 7C 02 84 02 2C 97)
        Class<?> xorClass = Class.forName("com.perblue.rpg.network.ClientXORConnectionWrapper");
        xorWrapper = xorClass.getConstructor().newInstance();

        Class<?> baseXorClass = xorClass.getSuperclass(); // com.perblue.common.i.a
        wrapOutMethod = baseXorClass.getDeclaredMethod("wrapOut", byte[].class);
        wrapOutMethod.setAccessible(true);
        for (Method m : baseXorClass.getDeclaredMethods()) {
            if (m.getName().equals("wrapIn") && m.getParameterCount() == 1) {
                wrapInMethod = m;
                wrapInMethod.setAccessible(true);
                break;
            }
        }

        writerClass = Class.forName("com.perblue.a.a.a.b");
        readerClass = Class.forName("com.perblue.a.a.a.a");
        utilsClass  = Class.forName("com.perblue.common.a.b");

        packIntMethod    = utilsClass.getMethod("packInt", OutputStream.class, int.class);
        unpackIntMethod  = utilsClass.getMethod("unpackInt", InputStream.class);
        packStringMethod = utilsClass.getMethod("packString", OutputStream.class, String.class);

        for (Method m : utilsClass.getMethods()) {
            if (m.getName().equals("unpackString") && m.getParameterCount() == 1
                && m.getParameterTypes()[0] == readerClass) {
                unpackStringMethod = m;
                break;
            }
        }

        log("✓ Game classes loaded (XOR, serialization, messages)");
    }

    // ══════════════════════════════════════════════════════════
    //  STEP 1: HTTP LOGIN
    // ══════════════════════════════════════════════════════════

    public String httpLogin(String host, int httpPort) throws Exception {
        log("━━━ STEP 1: HTTP LOGIN ━━━");

        String params = String.format(
            "country=FR&aPMacAddress=%s&imei=%s&shardID=%d&language=%s" +
            "&buildSource=GOOGLE&userID=%d&version=%d&email=&platform=ANDROID" +
            "&uniqueIdentifier=%s&advertisingIdentifier=%s",
            URLEncoder.encode(AP_MAC, "UTF-8"),
            URLEncoder.encode(IMEI, "UTF-8"),
            SHARD_ID, LANGUAGE, USER_ID, VERSION, UNIQUE_ID, AD_ID
        );

        String urlStr = "http://" + host + ":" + httpPort + "/login?" + params;
        log("GET " + urlStr);

        HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent", USER_AGENT);
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(10000);

        int code = conn.getResponseCode();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) sb.append(line);
        reader.close();
        String body = sb.toString();

        log("HTTP " + code + " → " + body);

        // Parse JSON response: {"status":"good","data":"127.0.0.1:9500","requestID":"..."}
        String requestID = extractJsonValue(body, "requestID");
        String serverAddr = extractJsonValue(body, "data");
        String status = extractJsonValue(body, "status");

        if (!"good".equals(status)) {
            throw new RuntimeException("Login failed: " + body);
        }

        log("✓ Login OK → server=" + serverAddr + ", requestID=" + requestID);
        return requestID;
    }

    // ══════════════════════════════════════════════════════════
    //  STEP 2: TCP CONNECT
    // ══════════════════════════════════════════════════════════

    public void connect(String host, int port) throws Exception {
        log("━━━ STEP 2: TCP CONNECT ━━━");
        socket = new Socket();
        socket.connect(new InetSocketAddress(host, port), 10000);
        socket.setSoTimeout(30000);
        out = socket.getOutputStream();
        in  = new BufferedInputStream(socket.getInputStream());
        log("✓ Connected to " + host + ":" + port);
    }

    // ══════════════════════════════════════════════════════════
    //  STEP 3: SEND ClientInfo1 (44 fields)
    // ══════════════════════════════════════════════════════════

    public void sendClientInfo(String loginRequestID, Map<String, Long> statVersions) throws Exception {
        log("━━━ STEP 3: SEND ClientInfo1 ━━━");

        // Create ClientInfo using the REAL game class
        Class<?> ciClass = Class.forName("com.perblue.rpg.network.messages.ClientInfo");
        Object ci = ciClass.getConstructor().newInstance();

        // Set platform enum
        Class<?> platformClass = Class.forName("com.perblue.rpg.network.messages.Platform");
        Object[] platforms = platformClass.getEnumConstants();
        Object androidPlatform = platforms[PLATFORM]; // index 1 = ANDROID

        // Set buildSource enum
        Class<?> bsClass = Class.forName("com.perblue.rpg.network.messages.BuildSource");
        Object[] buildSources = bsClass.getEnumConstants();
        Object googleSource = buildSources[BUILD_SOURCE]; // index 1 = GOOGLE

        // Fill ALL 44 fields - exact same values as real APK
        setField(ci, "language",                LANGUAGE);
        setField(ci, "platform",                androidPlatform);
        setField(ci, "systemDescription",       SYS_DESC);
        setField(ci, "systemVersion",           SYS_VERSION);
        setField(ci, "sDKVersion",              SDK_VERSION);
        setField(ci, "phoneName",               PHONE_NAME);
        setField(ci, "systemName",              SYS_NAME);
        setField(ci, "uniqueIdentifier",        UNIQUE_ID);
        setField(ci, "carrierName",             CARRIER);
        setField(ci, "networkType",             NET_TYPE);
        setField(ci, "aPMacAddress",            AP_MAC);
        setField(ci, "aPSSID",                  AP_SSID);
        setField(ci, "isConnectedToCell",       CELL);
        setField(ci, "isConnectedToWiFi",       WIFI);
        setField(ci, "imei",                    IMEI);
        setField(ci, "version",                 VERSION);
        setField(ci, "timeOffset",              TIME_OFFSET);
        setField(ci, "referalData",             REFERAL);
        setField(ci, "rawLanguage",             RAW_LANG);
        setField(ci, "screenWidth",             SCREEN_W);
        setField(ci, "screenHeight",            SCREEN_H);
        setField(ci, "screenDensity",           Float.valueOf(SCREEN_DENSITY));
        setField(ci, "phoneModel",              PHONE_MODEL);
        setField(ci, "registrationID",          REG_ID);
        setField(ci, "country",                 COUNTRY);
        setField(ci, "dPIX",                    Float.valueOf(DPI_X));
        setField(ci, "dPIY",                    Float.valueOf(DPI_Y));
        setField(ci, "fullVersion",             FULL_VERSION);
        setField(ci, "advertisingIdentifier",   AD_ID);
        setField(ci, "clientConfigsHash",       CONFIG_HASH);
        setField(ci, "screenSize",              SCREEN_SIZE);
        setField(ci, "packageName",             PACKAGE_NAME);
        setField(ci, "notifType",               NOTIF_TYPE);
        setField(ci, "isReconnect",             IS_RECONNECT);
        setField(ci, "buildSource",             googleSource);

        // privateLoginInfo - already initialized with empty values by constructor

        setField(ci, "userID",                  USER_ID);
        setField(ci, "signature",               SIGNATURE);
        setField(ci, "dontLinkUser",            DONT_LINK);
        setField(ci, "limitAdTracking",         LIMIT_AD);
        setField(ci, "shardID",                 SHARD_ID);
        setField(ci, "statVersions",            statVersions);
        setField(ci, "timeZone",                TIME_ZONE);
        setField(ci, "loginRequestID",          loginRequestID);

        log("  44 fields set (including " + statVersions.size() + " statVersions)");

        // Set message number
        Class<?> msgBase = ci.getClass();
        while (msgBase != null && !msgBase.getName().equals("com.perblue.a.a.i")) {
            msgBase = msgBase.getSuperclass();
        }
        Method setMsgNum = msgBase.getDeclaredMethod("setMessageNumber", int.class);
        setMsgNum.setAccessible(true);
        setMsgNum.invoke(ci, messageCounter++);

        // Serialize using the REAL game's writeAll()
        Object writer = writerClass.getConstructor().newInstance();
        Method writeAll = msgBase.getDeclaredMethod("writeAll", writerClass);
        writeAll.setAccessible(true);
        writeAll.invoke(ci, writer);
        byte[] raw = (byte[]) ByteArrayOutputStream.class.getMethod("toByteArray").invoke(writer);
        log("  Serialized: " + raw.length + " bytes");

        // Compress + XOR encrypt
        byte[] encrypted = (byte[]) wrapOutMethod.invoke(xorWrapper, raw);
        log("  Encrypted:  " + encrypted.length + " bytes");

        // Send frame: 4-byte LE length + encrypted payload
        packIntMethod.invoke(null, out, encrypted.length);
        out.write(encrypted);
        out.flush();
        log("✓ ClientInfo1 sent: " + (4 + encrypted.length) + " bytes on wire");

        // Debug: hex dump header
        logHex("  Raw", raw, 120);
    }

    // ══════════════════════════════════════════════════════════
    //  STEP 4: RECEIVE BootData1
    // ══════════════════════════════════════════════════════════

    public byte[] receiveBootData() throws Exception {
        log("━━━ STEP 4: RECEIVE BootData1 ━━━");

        // Read 4-byte LE frame length
        int frameLen = (int) unpackIntMethod.invoke(null, in);
        log("  Frame length: " + frameLen + " bytes");

        if (frameLen <= 0 || frameLen > 10_000_000) {
            throw new IOException("Invalid frame length: " + frameLen);
        }

        // Read encrypted payload
        byte[] encrypted = readExactly(in, frameLen);

        // Decrypt + decompress
        byte[] raw = (byte[]) wrapInMethod.invoke(xorWrapper, encrypted);
        log("  Decrypted: " + raw.length + " bytes");

        // Parse message header
        Object reader = readerClass.getConstructor(byte[].class).newInstance(raw);
        String fullName  = (String) unpackStringMethod.invoke(null, reader);
        int msgNum       = (int)    unpackIntMethod.invoke(null, reader);
        int respMsgNum   = (int)    unpackIntMethod.invoke(null, reader);

        log("✓ Received: " + fullName + " #" + msgNum + " (reply_to=" + respMsgNum + ")");
        log("  Total: " + raw.length + " bytes decrypted");

        logHex("  Raw", raw, 120);

        return raw;
    }

    // ══════════════════════════════════════════════════════════
    //  STEP 6: PARSE BootData1 with REAL game classes
    // ══════════════════════════════════════════════════════════

    public void parseBootData(byte[] raw) throws Exception {
        log("━━━ STEP 6: PARSE BootData1 with real game classes ━━━");

        // Create a reader from raw bytes (positioned at start)
        // The raw data starts with packed fullName string, then msgNumber, respMsgNumber, version, fields
        // The BootData(reader) constructor:
        //   1. Hardcodes fullName="BootData1"
        //   2. super reads messageNumber + responseMessageNumber from reader
        //   3. Reads version byte, then innerRead() parses fields
        // But the FIRST bytes in raw are the fullName string - we need to skip past it

        // The raw data starts with packString(fullName), then messageNumber, responseMessageNumber, version, fields
        // The BootData(reader) constructor expects reader positioned at messageNumber (after fullName).
        // packString format: 4-byte LE length + UTF-8 bytes
        // "BootData1" = 9 bytes, so skip 4+9=13 bytes
        int nameLen = ((raw[0] & 0xFF)) | ((raw[1] & 0xFF) << 8) | ((raw[2] & 0xFF) << 16) | ((raw[3] & 0xFF) << 24);
        int headerSize = 4 + nameLen;  // 4 bytes for length + string bytes
        String fullName = new String(raw, 4, nameLen, StandardCharsets.UTF_8);
        log("  Parsed fullName: " + fullName + " (skip " + headerSize + " bytes)");

        // Create reader starting at messageNumber position
        byte[] remaining = new byte[raw.length - headerSize];
        System.arraycopy(raw, headerSize, remaining, 0, remaining.length);
        Object reader = readerClass.getConstructor(byte[].class).newInstance(remaining);

        // Now create BootData using the constructor that takes a reader
        Class<?> bootDataClass = Class.forName("com.perblue.rpg.network.messages.BootData");
        Object bootData;
        try {
            bootData = bootDataClass.getConstructor(readerClass).newInstance(reader);
            log("✅ BootData1 parsed successfully!");
        } catch (java.lang.reflect.InvocationTargetException ite) {
            Throwable cause = ite.getCause();
            log("❌ BootData1 parsing FAILED: " + cause.getClass().getSimpleName() + ": " + cause.getMessage());
            cause.printStackTrace();
            return;
        }

        // Inspect parsed fields
        log("  ── Parsed Fields ──");
        for (Field f : bootDataClass.getDeclaredFields()) {
            if (java.lang.reflect.Modifier.isStatic(f.getModifiers())) continue;
            f.setAccessible(true);
            Object val = f.get(bootData);
            String valStr;
            if (val == null) {
                valStr = "null";
            } else if (val instanceof String) {
                valStr = "\"" + val + "\"";
            } else if (val instanceof java.util.Collection) {
                valStr = val.getClass().getSimpleName() + "[" + ((java.util.Collection<?>) val).size() + "]";
            } else if (val instanceof java.util.Map) {
                valStr = val.getClass().getSimpleName() + "{" + ((java.util.Map<?,?>) val).size() + "}";
            } else {
                valStr = val.toString();
            }
            log("    " + f.getName() + " = " + valStr);
        }

        // Check critical fields that handleBootData needs
        log("  ── Critical Checks ──");

        // Check currentServer
        Field serverField = bootDataClass.getDeclaredField("currentServer");
        serverField.setAccessible(true);
        Object server = serverField.get(bootData);
        if (server != null) {
            Class<?> serverClass = server.getClass();
            for (Field sf : serverClass.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(sf.getModifiers())) continue;
                sf.setAccessible(true);
                Object sval = sf.get(server);
                log("    server." + sf.getName() + " = " + sval);
            }
        } else {
            log("    ⚠ currentServer is NULL!");
        }

        // Check userInfo
        Field userInfoField = bootDataClass.getDeclaredField("userInfo");
        userInfoField.setAccessible(true);
        Object userInfo = userInfoField.get(bootData);
        if (userInfo != null) {
            Class<?> uiClass = userInfo.getClass();
            for (Field uf : uiClass.getDeclaredFields()) {
                if (java.lang.reflect.Modifier.isStatic(uf.getModifiers())) continue;
                uf.setAccessible(true);
                Object uval = uf.get(userInfo);
                if (uval instanceof byte[]) {
                    log("    userInfo." + uf.getName() + " = byte[" + ((byte[]) uval).length + "]");
                } else {
                    log("    userInfo." + uf.getName() + " = " + uval);
                }
            }
        }

        // ── Deep inspect userExtra + levelStatuses ──
        log("  ── UserExtra Deep Inspect ──");
        try {
            Field userExtraField = bootDataClass.getDeclaredField("userExtra");
            userExtraField.setAccessible(true);
            Object userExtra = userExtraField.get(bootData);
            if (userExtra != null) {
                Class<?> ueClass = userExtra.getClass();
                for (Field uef : ueClass.getDeclaredFields()) {
                    if (java.lang.reflect.Modifier.isStatic(uef.getModifiers())) continue;
                    uef.setAccessible(true);
                    Object ueval = uef.get(userExtra);
                    if (ueval instanceof java.util.Collection) {
                        java.util.Collection<?> coll = (java.util.Collection<?>) ueval;
                        log("    userExtra." + uef.getName() + " = " + ueval.getClass().getSimpleName() + "[" + coll.size() + "]");
                        // Deep dump for levelStatuses
                        if (uef.getName().contains("levelStatus") || uef.getName().contains("LevelStatus") || uef.getName().contains("campaign")) {
                            int idx = 0;
                            for (Object item : coll) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("      [").append(idx).append("] ");
                                for (Field itemf : item.getClass().getDeclaredFields()) {
                                    if (java.lang.reflect.Modifier.isStatic(itemf.getModifiers())) continue;
                                    itemf.setAccessible(true);
                                    sb2.append(itemf.getName()).append("=").append(itemf.get(item)).append(" ");
                                }
                                log(sb2.toString());
                                idx++;
                                if (idx > 20) { log("      ... (truncated)"); break; }
                            }
                        }
                    } else if (ueval instanceof java.util.Map) {
                        log("    userExtra." + uef.getName() + " = Map{" + ((java.util.Map<?,?>) ueval).size() + "}");
                    } else if (ueval instanceof byte[]) {
                        log("    userExtra." + uef.getName() + " = byte[" + ((byte[]) ueval).length + "]");
                    } else {
                        log("    userExtra." + uef.getName() + " = " + ueval);
                    }
                }
            } else {
                log("    ⚠ userExtra is NULL!");
            }
        } catch (NoSuchFieldException e) {
            log("    ⚠ No 'userExtra' field found in BootData. Fields available:");
            for (Field f2 : bootDataClass.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(f2.getModifiers()))
                    log("      - " + f2.getName() + " (" + f2.getType().getSimpleName() + ")");
            }
        }
    }

    // ══════════════════════════════════════════════════════════
    //  STEP 5: GET /live/index.txt
    // ══════════════════════════════════════════════════════════

    public void getIndexTxt(String host, int httpPort) throws Exception {
        log("━━━ STEP 5: GET /live/index.txt ━━━");

        String urlStr = "http://" + host + ":" + httpPort + "/live/index.txt";
        HttpURLConnection conn = (HttpURLConnection) new URL(urlStr).openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent", USER_AGENT);

        int code = conn.getResponseCode();
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) sb.append(line).append("\n");
        reader.close();

        log("HTTP " + code + " → " + sb.length() + " bytes");
        log("✓ index.txt retrieved");
    }

    // ══════════════════════════════════════════════════════════
    //  DISCONNECT
    // ══════════════════════════════════════════════════════════

    public void disconnect() {
        try { if (socket != null) socket.close(); } catch (Exception e) {}
        log("✓ Disconnected");
    }

    // ══════════════════════════════════════════════════════════
    //  UTILITIES
    // ══════════════════════════════════════════════════════════

    private void setField(Object obj, String fieldName, Object value) throws Exception {
        Field f = findField(obj.getClass(), fieldName);
        f.setAccessible(true);
        f.set(obj, value);
    }

    private Field findField(Class<?> clazz, String name) throws NoSuchFieldException {
        while (clazz != null) {
            try { return clazz.getDeclaredField(name); }
            catch (NoSuchFieldException e) { clazz = clazz.getSuperclass(); }
        }
        throw new NoSuchFieldException(name);
    }

    private static byte[] readExactly(InputStream is, int n) throws IOException {
        byte[] buf = new byte[n];
        int read = 0;
        while (read < n) {
            int r = is.read(buf, read, n - read);
            if (r == -1) throw new EOFException("EOF after " + read + "/" + n);
            read += r;
        }
        return buf;
    }

    /** Load statVersions from a text file (format: filename.tab=CRC_VALUE per line) */
    private static Map<String, Long> loadStatVersions(String path) throws IOException {
        Map<String, Long> map = new LinkedHashMap<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue;
            int eq = line.indexOf('=');
            if (eq < 0) continue;
            String key = line.substring(0, eq).trim();
            // Parse as unsigned 32-bit → Java long
            long val = Long.parseUnsignedLong(line.substring(eq + 1).trim());
            map.put(key, val);
        }
        br.close();
        return map;
    }

    private String extractJsonValue(String json, String key) {
        String search = "\"" + key + "\"";
        int idx = json.indexOf(search);
        if (idx < 0) return "";
        idx = json.indexOf(":", idx);
        if (idx < 0) return "";
        idx = json.indexOf("\"", idx);
        if (idx < 0) return "";
        int end = json.indexOf("\"", idx + 1);
        if (end < 0) return "";
        return json.substring(idx + 1, end);
    }

    private void log(String msg) {
        System.out.println("[DragonSoul] " + msg);
    }

    private void logHex(String prefix, byte[] data, int limit) {
        StringBuilder sb = new StringBuilder(prefix + " [" + Math.min(limit, data.length) + "/" + data.length + " bytes]: ");
        for (int i = 0; i < Math.min(limit, data.length); i++) {
            sb.append(String.format("%02x ", data[i] & 0xFF));
            if ((i + 1) % 32 == 0) sb.append("\n         ");
        }
        if (data.length > limit) sb.append("...");
        log(sb.toString());
    }

    // ══════════════════════════════════════════════════════════
    //  MAIN - full Android APK flow
    // ══════════════════════════════════════════════════════════

    public static void main(String[] args) throws Exception {
        String host     = args.length > 0 ? args[0] : "127.0.0.1";
        int httpPort    = args.length > 1 ? Integer.parseInt(args[1]) : 8080;
        int tcpPort     = args.length > 2 ? Integer.parseInt(args[2]) : 9500;
        String statsFile= args.length > 3 ? args[3] : "stat_versions.txt";

        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║  DragonSoul Client (APK-identical)   ║");
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║  Server: " + host + ":" + httpPort + " (HTTP) / " + tcpPort + " (TCP)");
        System.out.println("║  Device: " + PHONE_MODEL + " / Android " + SYS_VERSION);
        System.out.println("║  Game:   v" + VERSION + " (full: " + FULL_VERSION + ")");
        System.out.println("╚══════════════════════════════════════╝");
        System.out.println();

        // Load stat versions from file
        Map<String, Long> statVersions = loadStatVersions(statsFile);
        System.out.println("[DragonSoul] Loaded " + statVersions.size() + " stat versions from " + statsFile);

        RealGameClient client = new RealGameClient();

        try {
            // Step 1: HTTP Login
            String requestID = client.httpLogin(host, httpPort);
            System.out.println();

            // Step 2: TCP Connect
            client.connect(host, tcpPort);
            System.out.println();

            // Step 3: Send ClientInfo1
            client.sendClientInfo(requestID, statVersions);
            System.out.println();

            // Step 4: Receive BootData1
            byte[] bootData = client.receiveBootData();
            System.out.println();

            // Step 5: GET /live/index.txt
            client.getIndexTxt(host, httpPort);
            System.out.println();

            // Step 6: Parse BootData1 using REAL game classes
            client.parseBootData(bootData);
            System.out.println();

            System.out.println("═══════════════════════════════════════");
            System.out.println("  ✅ FULL HANDSHAKE COMPLETE");
            System.out.println("  ClientInfo1 sent: " + statVersions.size() + " statVersions");
            System.out.println("  BootData1 received: " + bootData.length + " bytes");
            System.out.println("═══════════════════════════════════════");

        } catch (Exception e) {
            System.err.println("[DragonSoul] ❌ ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            client.disconnect();
        }
    }
}
