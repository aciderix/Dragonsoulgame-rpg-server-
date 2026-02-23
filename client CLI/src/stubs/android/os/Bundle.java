package android.os;
import java.util.*;
public class Bundle {
    private Map<String, Object> data = new HashMap<>();
    public Bundle() {}
    public void putString(String k, String v) { data.put(k, v); }
    public String getString(String k) { return (String) data.get(k); }
    public String getString(String k, String def) { return data.containsKey(k) ? (String)data.get(k) : def; }
    public void putInt(String k, int v) { data.put(k, v); }
    public int getInt(String k) { return data.containsKey(k) ? (int)data.get(k) : 0; }
    public int getInt(String k, int def) { return data.containsKey(k) ? (int)data.get(k) : def; }
    public void putBoolean(String k, boolean v) { data.put(k, v); }
    public boolean getBoolean(String k) { return data.containsKey(k) ? (boolean)data.get(k) : false; }
    public boolean getBoolean(String k, boolean def) { return data.containsKey(k) ? (boolean)data.get(k) : def; }
    public boolean containsKey(String k) { return data.containsKey(k); }
    public Set<String> keySet() { return data.keySet(); }
}
