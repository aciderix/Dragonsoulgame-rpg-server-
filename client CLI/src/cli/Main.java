package cli;

import java.io.*;
import java.util.*;

/**
 * DragonSoul Headless CLI - Main entry point
 * 
 * Usage:
 *   java -cp dragonsoul-cli.jar:game-bytecode.jar cli.Main
 *   java -cp dragonsoul-cli.jar:game-bytecode.jar cli.Main --seed 42
 *   java -cp dragonsoul-cli.jar:game-bytecode.jar cli.Main --batch commands.txt
 *   echo "boot" | java -cp dragonsoul-cli.jar:game-bytecode.jar cli.Main --pipe
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        long seed = System.currentTimeMillis();
        boolean pipeMode = false;
        boolean autoboot = false;
        String batchFile = null;
        
        // Parse arguments
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--seed":
                    if (i + 1 < args.length) seed = Long.parseLong(args[++i]);
                    break;
                case "--pipe":
                    pipeMode = true;
                    break;
                case "--batch":
                    if (i + 1 < args.length) batchFile = args[++i];
                    break;
                case "--autoboot":
                    autoboot = true;
                    break;
                case "--help":
                    printUsage();
                    return;
            }
        }
        
        GameEngine engine = new GameEngine(seed);
        
        // Auto-boot if requested
        if (autoboot) {
            System.out.println(engine.handleCommand("boot"));
            System.out.println(engine.handleCommand("connect"));
            System.out.println(engine.handleCommand("handshake"));
            System.out.println(engine.handleCommand("load_assets"));
        }
        
        // Batch mode
        if (batchFile != null) {
            try (BufferedReader br = new BufferedReader(new FileReader(batchFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    line = line.trim();
                    if (line.isEmpty() || line.startsWith("#")) continue;
                    if (!pipeMode) System.out.println("> " + line);
                    String result = engine.handleCommand(line);
                    System.out.println(result);
                    if (line.equalsIgnoreCase("quit")) return;
                }
            }
            return;
        }
        
        // Interactive/pipe mode
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        if (!pipeMode) {
            System.out.println("╔══════════════════════════════════════════╗");
            System.out.println("║     DragonSoul Headless CLI Engine      ║");
            System.out.println("║  Type 'help' for commands, 'quit' to    ║");
            System.out.println("║  exit. Start with 'boot' to initialize. ║");
            System.out.println("╚══════════════════════════════════════════╝");
            System.out.println();
        }
        
        while (true) {
            if (!pipeMode) System.out.print("ds> ");
            System.out.flush();
            
            String line = reader.readLine();
            if (line == null) break; // EOF
            
            line = line.trim();
            if (line.isEmpty()) continue;
            if (line.equalsIgnoreCase("quit") || line.equalsIgnoreCase("exit")) {
                if (!pipeMode) System.out.println("Goodbye!");
                break;
            }
            
            String result = engine.handleCommand(line);
            System.out.println(result);
            
            if (pipeMode) System.out.flush();
        }
    }
    
    private static void printUsage() {
        System.out.println("DragonSoul Headless CLI Engine");
        System.out.println();
        System.out.println("Usage:");
        System.out.println("  java -cp dragonsoul-cli.jar:game-bytecode.jar cli.Main [options]");
        System.out.println();
        System.out.println("Options:");
        System.out.println("  --seed <n>       Set RNG seed for deterministic behavior");
        System.out.println("  --pipe           Pipe mode (no prompt, flush after each output)");
        System.out.println("  --batch <file>   Execute commands from file");
        System.out.println("  --autoboot       Auto-run boot sequence on startup");
        System.out.println("  --help           Show this help");
        System.out.println();
        System.out.println("Example (AI-driven):");
        System.out.println("  echo -e 'boot\\nunits\\nquit' | java -cp ...:... cli.Main --pipe");
    }
}
