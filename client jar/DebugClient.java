import java.io.*;
import java.lang.reflect.*;

/**
 * Minimal debug client that parses BootData1 raw bytes saved from file.
 * Uses a counting wrapper to track exactly where parsing fails.
 */
public class DebugClient {
    
    static class CountingInputStream extends InputStream {
        private final InputStream wrapped;
        public int pos = 0;
        
        CountingInputStream(InputStream is) { this.wrapped = is; }
        
        @Override public int read() throws IOException {
            int b = wrapped.read();
            if (b >= 0) pos++;
            return b;
        }
        @Override public int read(byte[] buf, int off, int len) throws IOException {
            int n = wrapped.read(buf, off, len);
            if (n > 0) pos += n;
            return n;
        }
        @Override public int available() throws IOException {
            return wrapped.available();
        }
    }
    
    public static void main(String[] args) throws Exception {
        // Read raw decrypted BootData1 bytes from stdin or file
        byte[] raw;
        if (args.length > 0) {
            raw = new FileInputStream(args[0]).readAllBytes();
        } else {
            raw = System.in.readAllBytes();
        }
        System.out.println("Raw bytes: " + raw.length);
        
        // Skip fullName string header
        int nameLen = (raw[0] & 0xFF) | ((raw[1] & 0xFF) << 8) | ((raw[2] & 0xFF) << 16) | ((raw[3] & 0xFF) << 24);
        int headerSize = 4 + nameLen;
        String fullName = new String(raw, 4, nameLen, "UTF-8");
        System.out.println("Message: " + fullName + " (header=" + headerSize + " bytes)");
        
        // Create remaining bytes for BootData constructor
        byte[] remaining = new byte[raw.length - headerSize];
        System.arraycopy(raw, headerSize, remaining, 0, remaining.length);
        System.out.println("Remaining: " + remaining.length + " bytes");
        
        // Wrap in counting stream
        CountingInputStream cis = new CountingInputStream(new ByteArrayInputStream(remaining));
        
        // Create reader (com.perblue.a.a.a.a) using the counting stream
        Class<?> readerClass = Class.forName("com.perblue.a.a.a.a");
        // The reader class wraps byte[] - but we need to use the InputStream version
        // Actually, com.perblue.a.a.a.a extends InputStream/FilterInputStream
        // Let's check constructors
        System.out.println("Reader constructors:");
        for (Constructor<?> c : readerClass.getConstructors()) {
            System.out.println("  " + c);
        }
        
        // Try byte[] constructor first (most common)
        Object reader = readerClass.getConstructor(byte[].class).newInstance(remaining);
        
        // Try to access the reader's internal position
        System.out.println("Reader fields:");
        for (Field f : readerClass.getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println("  " + f.getName() + " = " + f.get(reader));
        }
        
        // Create BootData using reader
        Class<?> bootDataClass = Class.forName("com.perblue.rpg.network.messages.BootData");
        try {
            Object bootData = bootDataClass.getConstructor(readerClass).newInstance(reader);
            System.out.println("✅ SUCCESS!");
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            System.out.println("❌ FAILED: " + cause.getClass().getSimpleName() + ": " + cause.getMessage());
            
            // Check reader position
            System.out.println("Reader state after error:");
            for (Field f : readerClass.getDeclaredFields()) {
                f.setAccessible(true);
                System.out.println("  " + f.getName() + " = " + f.get(reader));
            }
            // Also check superclass fields
            for (Class<?> c = readerClass.getSuperclass(); c != null; c = c.getSuperclass()) {
                for (Field f : c.getDeclaredFields()) {
                    f.setAccessible(true);
                    try {
                        System.out.println("  " + c.getSimpleName() + "." + f.getName() + " = " + f.get(reader));
                    } catch (Exception ex) {}
                }
            }
        }
    }
}
