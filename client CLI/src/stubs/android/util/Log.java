package android.util;
public class Log {
    public static int v(String tag, String msg) { return 0; }
    public static int d(String tag, String msg) { return 0; }
    public static int i(String tag, String msg) { System.out.println("[" + tag + "] " + msg); return 0; }
    public static int w(String tag, String msg) { System.out.println("[WARN][" + tag + "] " + msg); return 0; }
    public static int e(String tag, String msg) { System.out.println("[ERROR][" + tag + "] " + msg); return 0; }
    public static int v(String tag, String msg, Throwable t) { return 0; }
    public static int d(String tag, String msg, Throwable t) { return 0; }
    public static int i(String tag, String msg, Throwable t) { return i(tag, msg); }
    public static int w(String tag, String msg, Throwable t) { return w(tag, msg); }
    public static int e(String tag, String msg, Throwable t) { return e(tag, msg); }
}
