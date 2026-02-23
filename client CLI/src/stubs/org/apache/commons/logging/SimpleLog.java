package org.apache.commons.logging;
public class SimpleLog implements Log {
    private String name;
    public SimpleLog(String name) { this.name = name; }
    public boolean isDebugEnabled() { return false; }
    public boolean isErrorEnabled() { return true; }
    public boolean isFatalEnabled() { return true; }
    public boolean isInfoEnabled() { return true; }
    public boolean isTraceEnabled() { return false; }
    public boolean isWarnEnabled() { return true; }
    public void trace(Object m) { }
    public void trace(Object m, Throwable t) { }
    public void debug(Object m) { }
    public void debug(Object m, Throwable t) { }
    public void info(Object m) { System.out.println("[INFO][" + name + "] " + m); }
    public void info(Object m, Throwable t) { System.out.println("[INFO][" + name + "] " + m); }
    public void warn(Object m) { System.out.println("[WARN][" + name + "] " + m); }
    public void warn(Object m, Throwable t) { System.out.println("[WARN][" + name + "] " + m); }
    public void error(Object m) { System.out.println("[ERROR][" + name + "] " + m); }
    public void error(Object m, Throwable t) { System.out.println("[ERROR][" + name + "] " + m); }
    public void fatal(Object m) { System.out.println("[FATAL][" + name + "] " + m); }
    public void fatal(Object m, Throwable t) { System.out.println("[FATAL][" + name + "] " + m); }
}
