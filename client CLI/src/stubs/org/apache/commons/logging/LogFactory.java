package org.apache.commons.logging;
public class LogFactory {
    public static Log getLog(Class<?> clazz) {
        return new SimpleLog(clazz.getSimpleName());
    }
    public static Log getLog(String name) {
        return new SimpleLog(name);
    }
}
