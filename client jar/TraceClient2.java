import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class TraceClient2 {
    public static void main(String[] args) throws Exception {
        byte[] raw = new FileInputStream(args[0]).readAllBytes();
        
        int nameLen = (raw[0] & 0xFF) | ((raw[1] & 0xFF) << 8) | 
                      ((raw[2] & 0xFF) << 16) | ((raw[3] & 0xFF) << 24);
        int headerSize = 4 + nameLen;
        byte[] remaining = new byte[raw.length - headerSize];
        System.arraycopy(raw, headerSize, remaining, 0, remaining.length);
        System.out.println("Remaining: " + remaining.length + " bytes");
        
        Class<?> readerClass = Class.forName("com.perblue.a.a.a.a");
        Object reader = readerClass.getConstructor(byte[].class).newInstance(remaining);
        
        // Access pos field from ByteArrayInputStream
        Field posField = ByteArrayInputStream.class.getDeclaredField("pos");
        posField.setAccessible(true);
        
        // Access bounded stack
        Field aField = readerClass.getDeclaredField("a");
        aField.setAccessible(true);
        
        Class<?> bootDataClass = Class.forName("com.perblue.rpg.network.messages.BootData");
        try {
            Object bootData = bootDataClass.getConstructor(readerClass).newInstance(reader);
            System.out.println("✅ SUCCESS!");
            
            // Print some key fields
            Field ueField = bootDataClass.getDeclaredField("userExtra");
            ueField.setAccessible(true);
            Object ue = ueField.get(bootData);
            if (ue != null) {
                Class<?> ueClass = ue.getClass();
                for (String fname : new String[]{"heroes", "heroLineups", "settings"}) {
                    try {
                        Field f = ueClass.getDeclaredField(fname);
                        f.setAccessible(true);
                        Object val = f.get(ue);
                        if (val instanceof Map) {
                            System.out.println("  " + fname + " size=" + ((Map)val).size());
                        } else {
                            System.out.println("  " + fname + " = " + val);
                        }
                    } catch (NoSuchFieldException e) {}
                }
            }
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            System.out.println("❌ FAILED: " + cause.getMessage());
            
            int pos = posField.getInt(reader);
            System.out.println("Stream pos: " + pos + " / " + remaining.length);
            
            // Show bytes around error
            System.out.println("Bytes at error position:");
            int start = Math.max(0, pos - 20);
            int end = Math.min(remaining.length, pos + 10);
            for (int i = start; i < end; i++) {
                String marker = (i == pos) ? " <<<ERROR" : "";
                System.out.printf("  [%4d] 0x%02x = %d%s%n", i, remaining[i] & 0xFF, remaining[i] & 0xFF, marker);
            }
            
            // Bounded stack
            List<?> bounds = (List<?>) aField.get(reader);
            System.out.println("Bounded stack: " + bounds);
            
            // Full stack
            cause.printStackTrace(System.out);
        }
    }
}
