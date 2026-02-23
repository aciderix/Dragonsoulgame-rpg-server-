package android.os;
public class Looper {
    private static Looper sMainLooper = new Looper();
    public static Looper getMainLooper() { return sMainLooper; }
    public static Looper myLooper() { return sMainLooper; }
    public static void prepare() {}
    public static void loop() {}
}
