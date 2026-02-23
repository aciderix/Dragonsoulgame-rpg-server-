package cli;

import java.lang.reflect.*;
import java.util.*;
import java.io.*;

/**
 * DragonSoul Headless Game Engine
 * Uses reflection to interface with the original game bytecode
 * from dex2jar without needing to recompile the game source.
 */
public class GameEngine {
    
    // Game state
    private boolean booted = false;
    private boolean assetsLoaded = false;
    private Map<String, Object> gameState = new LinkedHashMap<>();
    private Random rng;
    private long seed;
    
    // Reflected game classes
    private Class<?> unitTypeClass;
    private Class<?> rarityClass;
    private Class<?> commandTypeClass;
    private Class<?> resourceTypeClass;
    private Class<?> itemTypeClass;
    private Class<?> buildTypeClass;
    private Class<?> serverTypeClass;
    private Class<?> actionExtraTypeClass;
    private Class<?> rpgClass;
    private Class<?> rpgMainClass;
    private Class<?> buildOptionsClass;
    
    // Data from game
    private Object[] unitTypes;
    private Object[] rarities;
    private Object[] commandTypes;
    private Object[] resourceTypes;
    private Object[] itemTypes;
    private Map<String, Map<String, String>> tabData = new LinkedHashMap<>();
    
    public GameEngine() {
        this(System.currentTimeMillis());
    }
    
    public GameEngine(long seed) {
        this.seed = seed;
        this.rng = new Random(seed);
        log("DragonSoul Headless Engine initialized (seed=" + seed + ")");
    }
    
    /**
     * Main command handler - the primary interface for AI control
     */
    public String handleCommand(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "ERROR: Empty command";
        }
        
        String[] parts = input.trim().split("\\s+", 2);
        String cmd = parts[0].toLowerCase();
        String args = parts.length > 1 ? parts[1] : "";
        
        try {
            switch (cmd) {
                case "boot": return cmdBoot();
                case "connect": return cmdConnect();
                case "handshake": return cmdHandshake();
                case "load_assets": return cmdLoadAssets();
                case "status": return cmdStatus();
                case "help": return cmdHelp();
                
                // Data inspection
                case "units": return cmdListUnits(args);
                case "unit": return cmdUnitInfo(args);
                case "rarities": return cmdListRarities();
                case "commands": return cmdListCommands();
                case "resources": return cmdListResources();
                case "items": return cmdListItems(args);
                case "enums": return cmdListEnums();
                case "enum": return cmdEnumValues(args);
                
                // Tab data
                case "load_tab": return cmdLoadTab(args);
                case "tab": return cmdQueryTab(args);
                case "tabs": return cmdListTabs();
                
                // Game state
                case "state": return cmdState(args);
                case "set_seed": return cmdSetSeed(args);
                case "random": return cmdRandom(args);
                
                // Reflection / exploration
                case "class": return cmdClassInfo(args);
                case "methods": return cmdMethods(args);
                case "fields": return cmdFields(args);
                case "call": return cmdCallStatic(args);
                case "packages": return cmdPackages();
                
                // Build info
                case "build": return cmdBuildInfo();
                case "version": return cmdVersion();
                
                default:
                    return "ERROR: Unknown command '" + cmd + "'. Type 'help' for available commands.";
            }
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            return "ERROR: " + e.getClass().getSimpleName() + ": " + e.getMessage() + "\n" + sw.toString();
        }
    }
    
    // ==================== BOOT SEQUENCE ====================
    
    private String cmdBoot() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== BOOT SEQUENCE ===\n");
        
        // Phase 1: Load game enums
        sb.append("[1/4] Loading game enums...\n");
        try {
            unitTypeClass = Class.forName("com.perblue.rpg.network.messages.UnitType");
            unitTypes = unitTypeClass.getEnumConstants();
            sb.append("  UnitType: ").append(unitTypes.length).append(" units\n");
        } catch (Exception e) {
            sb.append("  UnitType: FAILED - ").append(e.getMessage()).append("\n");
        }
        
        try {
            rarityClass = Class.forName("com.perblue.rpg.network.messages.Rarity");
            rarities = rarityClass.getEnumConstants();
            sb.append("  Rarity: ").append(rarities.length).append(" levels\n");
        } catch (Exception e) {
            sb.append("  Rarity: FAILED - ").append(e.getMessage()).append("\n");
        }
        
        try {
            commandTypeClass = Class.forName("com.perblue.rpg.network.messages.CommandType");
            Object[] vals = commandTypeClass.getEnumConstants();
            commandTypes = vals;
            sb.append("  CommandType: ").append(vals.length).append(" commands\n");
        } catch (Exception e) {
            sb.append("  CommandType: FAILED - ").append(e.getMessage()).append("\n");
        }
        
        try {
            resourceTypeClass = Class.forName("com.perblue.rpg.network.messages.ResourceType");
            resourceTypes = resourceTypeClass.getEnumConstants();
            sb.append("  ResourceType: ").append(resourceTypes.length).append(" types\n");
        } catch (Exception e) {
            sb.append("  ResourceType: FAILED - ").append(e.getMessage()).append("\n");
        }
        
        try {
            itemTypeClass = Class.forName("com.perblue.rpg.network.messages.ItemType");
            itemTypes = itemTypeClass.getEnumConstants();
            sb.append("  ItemType: ").append(itemTypes.length).append(" items\n");
        } catch (Exception e) {
            sb.append("  ItemType: FAILED - ").append(e.getMessage()).append("\n");
        }
        
        // Phase 2: Load build info
        sb.append("[2/4] Loading build configuration...\n");
        try {
            buildTypeClass = Class.forName("com.perblue.rpg.BuildType");
            Object[] buildTypes = buildTypeClass.getEnumConstants();
            sb.append("  BuildType: ").append(Arrays.toString(buildTypes)).append("\n");
        } catch (Exception e) {
            sb.append("  BuildType: FAILED - ").append(e.getMessage()).append("\n");
        }
        
        try {
            buildOptionsClass = Class.forName("com.perblue.rpg.BuildOptions");
            sb.append("  BuildOptions: loaded\n");
        } catch (Exception e) {
            sb.append("  BuildOptions: FAILED - ").append(e.getMessage()).append("\n");
        }
        
        try {
            serverTypeClass = Class.forName("com.perblue.rpg.ServerType");
            Object[] serverTypes = serverTypeClass.getEnumConstants();
            sb.append("  ServerType: ").append(Arrays.toString(serverTypes)).append("\n");
        } catch (Exception e) {
            sb.append("  ServerType: FAILED - ").append(e.getMessage()).append("\n");
        }
        
        // Phase 3: Scan additional game enums
        sb.append("[3/4] Scanning additional game systems...\n");
        String[] extraEnums = {
            "com.perblue.rpg.network.messages.ActionExtraType",
            "com.perblue.rpg.network.messages.StatType",
            "com.perblue.rpg.network.messages.SkillType",
            "com.perblue.rpg.network.messages.EquipSlot",
            "com.perblue.rpg.network.messages.DamageType",
            "com.perblue.rpg.network.messages.TargetType",
            "com.perblue.rpg.network.messages.EffectType",
            "com.perblue.rpg.network.messages.BattleResult",
            "com.perblue.rpg.AssetCategory",
            "com.perblue.rpg.AssetLoadType",
            "com.perblue.rpg.PerfStatNames"
        };
        
        int enumCount = 0;
        for (String enumName : extraEnums) {
            try {
                Class<?> c = Class.forName(enumName);
                Object[] vals = c.getEnumConstants();
                if (vals != null) {
                    String shortName = enumName.substring(enumName.lastIndexOf('.') + 1);
                    sb.append("  ").append(shortName).append(": ").append(vals.length).append(" values\n");
                    enumCount++;
                }
            } catch (Exception e) {
                // silently skip
            }
        }
        sb.append("  Loaded ").append(enumCount).append(" additional enums\n");
        
        // Phase 4: Initialize state
        sb.append("[4/4] Initializing game state...\n");
        gameState.put("seed", seed);
        gameState.put("unitCount", unitTypes != null ? unitTypes.length : 0);
        gameState.put("phase", "BOOTED");
        booted = true;
        
        sb.append("\n=== BOOT COMPLETE ===\n");
        sb.append("Game engine ready. Type 'help' for commands.\n");
        
        return sb.toString();
    }
    
    private String cmdConnect() {
        if (!booted) return "ERROR: Must 'boot' first";
        gameState.put("phase", "CONNECTED");
        
        StringBuilder sb = new StringBuilder();
        sb.append("=== CONNECTION SIMULATION ===\n");
        sb.append("NetworkProvider: EmptyNetworkProvider (offline mode)\n");
        sb.append("Server: local-headless\n");
        sb.append("Phase: CONNECTED\n");
        sb.append("Note: Real server connection requires network credentials.\n");
        sb.append("Engine operates in offline/simulation mode.\n");
        return sb.toString();
    }
    
    private String cmdHandshake() {
        if (!"CONNECTED".equals(gameState.get("phase")) && !"BOOTED".equals(gameState.get("phase")))
            return "ERROR: Must 'connect' first";
        gameState.put("phase", "HANDSHAKE_DONE");
        
        StringBuilder sb = new StringBuilder();
        sb.append("=== HANDSHAKE SIMULATION ===\n");
        sb.append("Protocol: DragonSoul v1\n");
        sb.append("Client: headless-cli\n");
        sb.append("Phase: HANDSHAKE_DONE\n");
        return sb.toString();
    }
    
    private String cmdLoadAssets() {
        if (!booted) return "ERROR: Must 'boot' first";
        
        StringBuilder sb = new StringBuilder();
        sb.append("=== ASSET LOADING ===\n");
        
        // Scan assets directory
        File assetsDir = new File("assets");
        if (!assetsDir.exists()) {
            assetsDir = new File("../assets");
        }
        
        if (assetsDir.exists()) {
            int tabCount = 0;
            int totalFiles = 0;
            for (File f : listFilesRecursive(assetsDir)) {
                totalFiles++;
                if (f.getName().endsWith(".tab")) tabCount++;
            }
            sb.append("Assets directory: ").append(assetsDir.getAbsolutePath()).append("\n");
            sb.append("Total files: ").append(totalFiles).append("\n");
            sb.append(".tab data files: ").append(tabCount).append("\n");
        } else {
            sb.append("Assets directory: NOT FOUND (place assets/ next to the JAR)\n");
        }
        
        assetsLoaded = true;
        gameState.put("phase", "ASSETS_LOADED");
        sb.append("\nPhase: ASSETS_LOADED\n");
        return sb.toString();
    }
    
    // ==================== DATA COMMANDS ====================
    
    private String cmdListUnits(String filter) {
        if (unitTypes == null) return "ERROR: Must 'boot' first";
        StringBuilder sb = new StringBuilder();
        sb.append("=== UNIT TYPES (").append(unitTypes.length).append(") ===\n");
        int i = 0;
        for (Object u : unitTypes) {
            String name = u.toString();
            if (filter.isEmpty() || name.toLowerCase().contains(filter.toLowerCase())) {
                sb.append(String.format("%3d. %s%n", i, name));
            }
            i++;
        }
        return sb.toString();
    }
    
    private String cmdUnitInfo(String name) {
        if (unitTypes == null) return "ERROR: Must 'boot' first";
        if (name.isEmpty()) return "Usage: unit <NAME>";
        
        for (Object u : unitTypes) {
            if (u.toString().equalsIgnoreCase(name)) {
                StringBuilder sb = new StringBuilder();
                sb.append("=== UNIT: ").append(u.toString()).append(" ===\n");
                // Use reflection to get ordinal and any fields
                try {
                    Method ordinal = u.getClass().getMethod("ordinal");
                    sb.append("Ordinal: ").append(ordinal.invoke(u)).append("\n");
                } catch (Exception e) { /* skip */ }
                
                // Try to get declared methods on the enum
                for (Method m : unitTypeClass.getDeclaredMethods()) {
                    if (m.getParameterCount() == 0 && !m.getName().equals("values") 
                        && !m.getName().equals("valueOf") && !m.getName().equals("ordinal")
                        && !m.getName().equals("name") && !m.getName().equals("toString")) {
                        try {
                            m.setAccessible(true);
                            Object result = m.invoke(u);
                            sb.append(m.getName()).append(": ").append(result).append("\n");
                        } catch (Exception e) { /* skip */ }
                    }
                }
                return sb.toString();
            }
        }
        return "Unit not found: " + name;
    }
    
    private String cmdListRarities() {
        if (rarities == null) return "ERROR: Must 'boot' first";
        StringBuilder sb = new StringBuilder();
        sb.append("=== RARITIES (").append(rarities.length).append(") ===\n");
        int i = 0;
        for (Object r : rarities) {
            sb.append(String.format("%3d. %s%n", i++, r.toString()));
        }
        return sb.toString();
    }
    
    private String cmdListCommands() {
        if (commandTypes == null) return "ERROR: Must 'boot' first";
        StringBuilder sb = new StringBuilder();
        sb.append("=== COMMAND TYPES (").append(commandTypes.length).append(") ===\n");
        int i = 0;
        for (Object c : commandTypes) {
            sb.append(String.format("%3d. %s%n", i++, c.toString()));
        }
        return sb.toString();
    }
    
    private String cmdListResources() {
        if (resourceTypes == null) return "ERROR: Must 'boot' first";
        StringBuilder sb = new StringBuilder();
        sb.append("=== RESOURCE TYPES (").append(resourceTypes.length).append(") ===\n");
        for (Object r : resourceTypes) {
            sb.append("  ").append(r.toString()).append("\n");
        }
        return sb.toString();
    }
    
    private String cmdListItems(String filter) {
        if (itemTypes == null) return "ERROR: Must 'boot' first";
        StringBuilder sb = new StringBuilder();
        sb.append("=== ITEM TYPES (").append(itemTypes.length).append(") ===\n");
        int i = 0;
        for (Object item : itemTypes) {
            String name = item.toString();
            if (filter.isEmpty() || name.toLowerCase().contains(filter.toLowerCase())) {
                sb.append(String.format("%3d. %s%n", i, name));
            }
            i++;
        }
        return sb.toString();
    }
    
    // ==================== TAB DATA ====================
    
    private String cmdLoadTab(String filename) {
        if (filename.isEmpty()) return "Usage: load_tab <filename.tab>";
        
        File tabFile = findFile("assets", filename);
        if (tabFile == null) tabFile = findFile("../assets", filename);
        if (tabFile == null) return "ERROR: File not found: " + filename;
        
        try {
            Map<String, String> data = parseTabFile(tabFile);
            tabData.put(filename, data);
            return "Loaded " + filename + ": " + data.size() + " entries";
        } catch (Exception e) {
            return "ERROR loading " + filename + ": " + e.getMessage();
        }
    }
    
    private String cmdQueryTab(String args) {
        if (args.isEmpty()) return "Usage: tab <filename> [key]";
        String[] parts = args.split("\\s+", 2);
        String filename = parts[0];
        String key = parts.length > 1 ? parts[1] : null;
        
        Map<String, String> data = tabData.get(filename);
        if (data == null) return "ERROR: Tab '" + filename + "' not loaded. Use 'load_tab " + filename + "' first.";
        
        if (key == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("=== ").append(filename).append(" (").append(data.size()).append(" entries) ===\n");
            int count = 0;
            for (Map.Entry<String, String> e : data.entrySet()) {
                if (count++ > 50) {
                    sb.append("... and ").append(data.size() - 50).append(" more\n");
                    break;
                }
                String val = e.getValue();
                if (val.length() > 80) val = val.substring(0, 80) + "...";
                sb.append(e.getKey()).append(" = ").append(val).append("\n");
            }
            return sb.toString();
        } else {
            String val = data.get(key);
            return val != null ? key + " = " + val : "Key not found: " + key;
        }
    }
    
    private String cmdListTabs() {
        if (tabData.isEmpty()) return "No tabs loaded. Use 'load_tab <file>' to load one.";
        StringBuilder sb = new StringBuilder();
        sb.append("=== LOADED TABS ===\n");
        for (Map.Entry<String, Map<String, String>> e : tabData.entrySet()) {
            sb.append(e.getKey()).append(": ").append(e.getValue().size()).append(" entries\n");
        }
        return sb.toString();
    }
    
    // ==================== REFLECTION COMMANDS ====================
    
    private String cmdClassInfo(String className) {
        if (className.isEmpty()) return "Usage: class <full.class.name>";
        try {
            Class<?> c = Class.forName(className);
            StringBuilder sb = new StringBuilder();
            sb.append("=== CLASS: ").append(c.getName()).append(" ===\n");
            sb.append("Simple name: ").append(c.getSimpleName()).append("\n");
            sb.append("Superclass: ").append(c.getSuperclass() != null ? c.getSuperclass().getName() : "none").append("\n");
            sb.append("Interfaces: ").append(Arrays.toString(c.getInterfaces())).append("\n");
            sb.append("Is enum: ").append(c.isEnum()).append("\n");
            sb.append("Is interface: ").append(c.isInterface()).append("\n");
            sb.append("Fields: ").append(c.getDeclaredFields().length).append("\n");
            sb.append("Methods: ").append(c.getDeclaredMethods().length).append("\n");
            sb.append("Constructors: ").append(c.getDeclaredConstructors().length).append("\n");
            
            if (c.isEnum()) {
                Object[] vals = c.getEnumConstants();
                sb.append("Enum values (").append(vals.length).append("): ");
                for (int i = 0; i < Math.min(vals.length, 20); i++) {
                    if (i > 0) sb.append(", ");
                    sb.append(vals[i].toString());
                }
                if (vals.length > 20) sb.append(", ... (").append(vals.length - 20).append(" more)");
                sb.append("\n");
            }
            
            return sb.toString();
        } catch (ClassNotFoundException e) {
            return "Class not found: " + className;
        }
    }
    
    private String cmdMethods(String className) {
        if (className.isEmpty()) return "Usage: methods <full.class.name>";
        try {
            Class<?> c = Class.forName(className);
            StringBuilder sb = new StringBuilder();
            sb.append("=== METHODS of ").append(c.getSimpleName()).append(" ===\n");
            for (Method m : c.getDeclaredMethods()) {
                sb.append("  ");
                sb.append(Modifier.toString(m.getModifiers())).append(" ");
                sb.append(m.getReturnType().getSimpleName()).append(" ");
                sb.append(m.getName()).append("(");
                Class<?>[] params = m.getParameterTypes();
                for (int i = 0; i < params.length; i++) {
                    if (i > 0) sb.append(", ");
                    sb.append(params[i].getSimpleName());
                }
                sb.append(")\n");
            }
            return sb.toString();
        } catch (ClassNotFoundException e) {
            return "Class not found: " + className;
        }
    }
    
    private String cmdFields(String className) {
        if (className.isEmpty()) return "Usage: fields <full.class.name>";
        try {
            Class<?> c = Class.forName(className);
            StringBuilder sb = new StringBuilder();
            sb.append("=== FIELDS of ").append(c.getSimpleName()).append(" ===\n");
            for (Field f : c.getDeclaredFields()) {
                sb.append("  ");
                sb.append(Modifier.toString(f.getModifiers())).append(" ");
                sb.append(f.getType().getSimpleName()).append(" ");
                sb.append(f.getName());
                
                // Show value for static fields
                if (Modifier.isStatic(f.getModifiers())) {
                    try {
                        f.setAccessible(true);
                        Object val = f.get(null);
                        if (val != null && !(val instanceof Object[])) {
                            String s = val.toString();
                            if (s.length() > 60) s = s.substring(0, 60) + "...";
                            sb.append(" = ").append(s);
                        }
                    } catch (Exception e) { /* skip */ }
                }
                sb.append("\n");
            }
            return sb.toString();
        } catch (ClassNotFoundException e) {
            return "Class not found: " + className;
        }
    }
    
    private String cmdCallStatic(String args) {
        if (args.isEmpty()) return "Usage: call <full.class.name>.<methodName>";
        int lastDot = args.lastIndexOf('.');
        if (lastDot < 0) return "Usage: call <full.class.name>.<methodName>";
        
        String className = args.substring(0, lastDot);
        String methodName = args.substring(lastDot + 1);
        
        try {
            Class<?> c = Class.forName(className);
            // Find a no-arg static method
            for (Method m : c.getDeclaredMethods()) {
                if (m.getName().equals(methodName) && m.getParameterCount() == 0 
                    && Modifier.isStatic(m.getModifiers())) {
                    m.setAccessible(true);
                    Object result = m.invoke(null);
                    return "Result: " + (result != null ? result.toString() : "null");
                }
            }
            return "Static no-arg method not found: " + methodName;
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
    }
    
    private String cmdPackages() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== GAME PACKAGES ===\n");
        String[] packages = {
            "com.perblue.rpg", "com.perblue.rpg.game", "com.perblue.rpg.game.buff",
            "com.perblue.rpg.game.event", "com.perblue.rpg.game.objects",
            "com.perblue.rpg.network", "com.perblue.rpg.network.messages",
            "com.perblue.rpg.simulation", "com.perblue.rpg.simulation.combat",
            "com.perblue.rpg.simulation.effects", "com.perblue.rpg.tools",
            "com.perblue.rpg.ui", "com.perblue.rpg.util", "com.perblue.rpg.assets",
            "com.perblue.rpg.purchasing", "com.perblue.rpg.social",
            "com.perblue.rpg.replay", "com.perblue.rpg.g2d"
        };
        
        for (String pkg : packages) {
            sb.append("  ").append(pkg).append("\n");
        }
        sb.append("\nUse 'class <package.ClassName>' to inspect a class.\n");
        return sb.toString();
    }
    
    private String cmdListEnums() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== KNOWN GAME ENUMS ===\n");
        String[] enumNames = {
            "com.perblue.rpg.network.messages.UnitType",
            "com.perblue.rpg.network.messages.Rarity",
            "com.perblue.rpg.network.messages.CommandType",
            "com.perblue.rpg.network.messages.ResourceType",
            "com.perblue.rpg.network.messages.ItemType",
            "com.perblue.rpg.network.messages.ActionExtraType",
            "com.perblue.rpg.network.messages.StatType",
            "com.perblue.rpg.network.messages.SkillType",
            "com.perblue.rpg.network.messages.EquipSlot",
            "com.perblue.rpg.network.messages.DamageType",
            "com.perblue.rpg.network.messages.TargetType",
            "com.perblue.rpg.network.messages.EffectType",
            "com.perblue.rpg.network.messages.BattleResult",
            "com.perblue.rpg.BuildType",
            "com.perblue.rpg.ServerType",
            "com.perblue.rpg.AssetCategory",
            "com.perblue.rpg.AssetLoadType",
            "com.perblue.rpg.PerfStatNames"
        };
        
        for (String name : enumNames) {
            try {
                Class<?> c = Class.forName(name);
                Object[] vals = c.getEnumConstants();
                String shortName = name.substring(name.lastIndexOf('.') + 1);
                sb.append(String.format("  %-25s %d values\n", shortName, vals != null ? vals.length : 0));
            } catch (Exception e) {
                String shortName = name.substring(name.lastIndexOf('.') + 1);
                sb.append(String.format("  %-25s NOT FOUND\n", shortName));
            }
        }
        sb.append("\nUse 'enum <EnumName>' for values.\n");
        return sb.toString();
    }
    
    private String cmdEnumValues(String name) {
        if (name.isEmpty()) return "Usage: enum <EnumName or full.class.name>";
        
        // Try full class name first
        String fullName = name;
        if (!name.contains(".")) {
            // Try common packages
            String[] prefixes = {
                "com.perblue.rpg.network.messages.",
                "com.perblue.rpg.",
                "com.perblue.rpg.game.",
                "com.perblue.rpg.simulation."
            };
            for (String prefix : prefixes) {
                try {
                    Class<?> c = Class.forName(prefix + name);
                    if (c.isEnum()) {
                        fullName = prefix + name;
                        break;
                    }
                } catch (Exception e) { /* try next */ }
            }
        }
        
        try {
            Class<?> c = Class.forName(fullName);
            if (!c.isEnum()) return fullName + " is not an enum";
            Object[] vals = c.getEnumConstants();
            StringBuilder sb = new StringBuilder();
            sb.append("=== ").append(c.getSimpleName()).append(" (").append(vals.length).append(" values) ===\n");
            for (int i = 0; i < vals.length; i++) {
                sb.append(String.format("%3d. %s%n", i, vals[i].toString()));
            }
            return sb.toString();
        } catch (ClassNotFoundException e) {
            return "Enum not found: " + name;
        }
    }
    
    // ==================== STATE COMMANDS ====================
    
    private String cmdState(String args) {
        if (args.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("=== GAME STATE ===\n");
            for (Map.Entry<String, Object> e : gameState.entrySet()) {
                sb.append(e.getKey()).append(" = ").append(e.getValue()).append("\n");
            }
            return sb.toString();
        }
        
        String[] kv = args.split("\\s*=\\s*", 2);
        if (kv.length == 2) {
            gameState.put(kv[0], kv[1]);
            return "Set " + kv[0] + " = " + kv[1];
        }
        
        Object val = gameState.get(args);
        return val != null ? args + " = " + val : "Key not found: " + args;
    }
    
    private String cmdSetSeed(String args) {
        try {
            seed = Long.parseLong(args.trim());
            rng = new Random(seed);
            return "RNG seed set to " + seed;
        } catch (NumberFormatException e) {
            return "Usage: set_seed <number>";
        }
    }
    
    private String cmdRandom(String args) {
        if (args.isEmpty()) return "Random: " + rng.nextInt();
        try {
            int max = Integer.parseInt(args.trim());
            return "Random(0-" + max + "): " + rng.nextInt(max);
        } catch (NumberFormatException e) {
            return "Usage: random [max]";
        }
    }
    
    // ==================== INFO COMMANDS ====================
    
    private String cmdStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== ENGINE STATUS ===\n");
        sb.append("Booted: ").append(booted).append("\n");
        sb.append("Assets loaded: ").append(assetsLoaded).append("\n");
        sb.append("Phase: ").append(gameState.getOrDefault("phase", "IDLE")).append("\n");
        sb.append("Seed: ").append(seed).append("\n");
        sb.append("Units: ").append(unitTypes != null ? unitTypes.length : 0).append("\n");
        sb.append("Tab files loaded: ").append(tabData.size()).append("\n");
        sb.append("State vars: ").append(gameState.size()).append("\n");
        return sb.toString();
    }
    
    private String cmdBuildInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== BUILD INFO ===\n");
        try {
            Class<?> bc = Class.forName("com.perblue.rpg.BuildConfig");
            for (Field f : bc.getDeclaredFields()) {
                f.setAccessible(true);
                if (Modifier.isStatic(f.getModifiers())) {
                    sb.append(f.getName()).append(": ").append(f.get(null)).append("\n");
                }
            }
        } catch (Exception e) {
            sb.append("BuildConfig: ").append(e.getMessage()).append("\n");
        }
        
        try {
            Class<?> bo = Class.forName("com.perblue.rpg.BuildOptions");
            for (Field f : bo.getDeclaredFields()) {
                f.setAccessible(true);
                if (Modifier.isStatic(f.getModifiers())) {
                    Object val = f.get(null);
                    if (val != null) {
                        sb.append(f.getName()).append(": ").append(val).append("\n");
                    }
                }
            }
        } catch (Exception e) {
            sb.append("BuildOptions: ").append(e.getMessage()).append("\n");
        }
        
        return sb.toString();
    }
    
    private String cmdVersion() {
        return "DragonSoul Headless Engine v1.0\n" +
               "Based on: DragonSoul APK (decompiled)\n" +
               "Runtime: " + System.getProperty("java.version") + "\n" +
               "Bytecode: 15,444 game classes from dex2jar\n" +
               "Mode: Headless CLI (offline simulation)";
    }
    
    private String cmdHelp() {
        return "=== DRAGONSOUL HEADLESS CLI ===\n\n" +
            "--- Boot Sequence ---\n" +
            "  boot              Initialize game engine + load enums\n" +
            "  connect           Simulate server connection\n" +
            "  handshake         Simulate protocol handshake\n" +
            "  load_assets       Scan and load game assets\n\n" +
            "--- Data Inspection ---\n" +
            "  units [filter]    List unit types (optional filter)\n" +
            "  unit <name>       Unit details\n" +
            "  rarities          List rarity levels\n" +
            "  commands          List command types\n" +
            "  resources         List resource types\n" +
            "  items [filter]    List item types\n" +
            "  enums             List all known enums\n" +
            "  enum <name>       Show enum values\n\n" +
            "--- Tab Data ---\n" +
            "  load_tab <file>   Load a .tab data file\n" +
            "  tab <file> [key]  Query loaded tab data\n" +
            "  tabs              List loaded tabs\n\n" +
            "--- Game State ---\n" +
            "  state [key=val]   View/set state\n" +
            "  status            Engine status\n" +
            "  set_seed <n>      Set RNG seed\n" +
            "  random [max]      Generate random number\n\n" +
            "--- Reflection / Explore ---\n" +
            "  class <name>      Inspect class\n" +
            "  methods <name>    List class methods\n" +
            "  fields <name>     List class fields\n" +
            "  call <class.method>  Call static method\n" +
            "  packages          List game packages\n\n" +
            "--- Info ---\n" +
            "  build             Build configuration\n" +
            "  version           Engine version\n" +
            "  help              This help\n" +
            "  quit              Exit\n";
    }
    
    // ==================== UTILITIES ====================
    
    private Map<String, String> parseTabFile(File file) throws IOException {
        Map<String, String> result = new LinkedHashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String header = br.readLine();
            if (header == null) return result;
            
            String[] keys = header.split("\t");
            String line;
            int row = 0;
            while ((line = br.readLine()) != null) {
                String[] vals = line.split("\t", -1);
                String rowKey = vals.length > 0 ? vals[0] : "row_" + row;
                for (int i = 0; i < Math.min(keys.length, vals.length); i++) {
                    result.put(rowKey + "." + keys[i], vals[i]);
                }
                row++;
            }
            result.put("_rows", String.valueOf(row));
            result.put("_columns", String.valueOf(keys.length));
            result.put("_headers", String.join(",", keys));
        }
        return result;
    }
    
    private File findFile(String baseDir, String name) {
        File base = new File(baseDir);
        if (!base.exists()) return null;
        for (File f : listFilesRecursive(base)) {
            if (f.getName().equals(name)) return f;
        }
        return null;
    }
    
    private List<File> listFilesRecursive(File dir) {
        List<File> result = new ArrayList<>();
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) result.addAll(listFilesRecursive(f));
                else result.add(f);
            }
        }
        return result;
    }
    
    private void log(String msg) {
        System.out.println("[ENGINE] " + msg);
    }
}
