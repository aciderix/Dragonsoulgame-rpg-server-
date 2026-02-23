import java.io.*;
import java.lang.reflect.*;

/**
 * Traces exact byte reads during BootData1 parsing
 * by wrapping the byte array with a tracking InputStream.
 */
public class TraceClient {
    
    static int readCount = 0;
    static int lastPos = -1;
    static byte[] rawBytes;
    
    public static void main(String[] args) throws Exception {
        rawBytes = new FileInputStream(args[0]).readAllBytes();
        
        // Skip fullName string header
        int nameLen = (rawBytes[0] & 0xFF) | ((rawBytes[1] & 0xFF) << 8) | 
                      ((rawBytes[2] & 0xFF) << 16) | ((rawBytes[3] & 0xFF) << 24);
        int headerSize = 4 + nameLen;
        byte[] remaining = new byte[rawBytes.length - headerSize];
        System.arraycopy(rawBytes, headerSize, remaining, 0, remaining.length);
        
        System.out.println("Remaining: " + remaining.length + " bytes");
        
        // Create reader from remaining bytes
        Class<?> readerClass = Class.forName("com.perblue.a.a.a.a");
        Object reader = readerClass.getConstructor(byte[].class).newInstance(remaining);
        
        // Get the internal ByteArrayInputStream to track position
        // The reader extends FilterInputStream, so it has an 'in' field
        Field inField = FilterInputStream.class.getDeclaredField("in");
        inField.setAccessible(true);
        ByteArrayInputStream bais = (ByteArrayInputStream) inField.get(reader);
        
        // The 'a' field tracks bounded context
        Field aField = readerClass.getDeclaredField("a");
        aField.setAccessible(true);
        
        // We need to know position. Use available() to compute it
        int totalLen = remaining.length;
        
        System.out.println("=== Position tracking ===");
        System.out.println("Total: " + totalLen + " bytes");
        
        // Try parsing
        Class<?> bootDataClass = Class.forName("com.perblue.rpg.network.messages.BootData");
        try {
            Object bootData = bootDataClass.getConstructor(readerClass).newInstance(reader);
            System.out.println("✅ SUCCESS!");
            
            // Print some fields
            for (Field f : bootDataClass.getDeclaredFields()) {
                f.setAccessible(true);
                Object val = f.get(bootData);
                if (val != null && !(val instanceof java.util.Map) && !(val instanceof java.util.List)) {
                    System.out.println("  " + f.getName() + " = " + val);
                }
            }
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            System.out.println("❌ FAILED: " + cause.getMessage());
            
            // Print position info
            int avail = bais.available();
            int pos = totalLen - avail;
            System.out.println("Position in remaining: " + pos + " / " + totalLen);
            System.out.println("Byte at pos: 0x" + String.format("%02x", remaining[pos] & 0xFF));
            
            // Context around position
            int start = Math.max(0, pos - 16);
            int end = Math.min(totalLen, pos + 16);
            System.out.print("Context: ");
            for (int i = start; i < end; i++) {
                if (i == pos) System.out.print("[");
                System.out.printf("%02x", remaining[i] & 0xFF);
                if (i == pos) System.out.print("]");
                System.out.print(" ");
            }
            System.out.println();
            
            // Bounded context state
            int[] bounds = (int[]) aField.get(reader);
            System.out.print("Bounded stack: [");
            for (int i = 0; i < bounds.length; i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(bounds[i]);
            }
            System.out.println("]");
            
            // Print the stack trace with method names
            System.out.println("Stack trace:");
            for (StackTraceElement ste : cause.getStackTrace()) {
                if (ste.getClassName().contains("perblue")) {
                    System.out.println("  " + ste);
                }
            }
        }
    }
}
