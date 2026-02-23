package android.content;
public class Context {
    public Object getSystemService(String name) { return null; }
    public SharedPreferences getSharedPreferences(String name, int mode) { return new SharedPreferences(); }
    public String getPackageName() { return "com.perblue.dragonsoul"; }
    public android.content.res.Resources getResources() { return null; }
    public java.io.File getFilesDir() { return new java.io.File("."); }
    public java.io.File getCacheDir() { return new java.io.File("/tmp"); }
    public Context getApplicationContext() { return this; }
}
