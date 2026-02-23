package android.content;
import java.util.*;
public class SharedPreferences {
    private Map<String, Object> data = new HashMap<>();
    public String getString(String key, String def) { return def; }
    public int getInt(String key, int def) { return def; }
    public long getLong(String key, long def) { return def; }
    public boolean getBoolean(String key, boolean def) { return def; }
    public float getFloat(String key, float def) { return def; }
    public Editor edit() { return new Editor(); }
    public static class Editor {
        public Editor putString(String k, String v) { return this; }
        public Editor putInt(String k, int v) { return this; }
        public Editor putLong(String k, long v) { return this; }
        public Editor putBoolean(String k, boolean v) { return this; }
        public Editor putFloat(String k, float v) { return this; }
        public Editor remove(String k) { return this; }
        public void apply() {}
        public boolean commit() { return true; }
    }
}
