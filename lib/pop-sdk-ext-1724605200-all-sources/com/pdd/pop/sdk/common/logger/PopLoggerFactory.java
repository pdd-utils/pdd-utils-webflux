package com.pdd.pop.sdk.common.logger;

import java.util.Iterator;
import java.util.ServiceLoader;

public class PopLoggerFactory {
    
    /**
     * 获取 PopLogger
     *
     * @param clazz
     * @return
     */
    public static PopLogger getLogger(Class clazz) {
        ServiceLoader<PopLogger> popLoggers = ServiceLoader.load(PopLogger.class);
        Iterator<PopLogger> it = popLoggers.iterator();
        while (null != it && it.hasNext()) {
            PopLogger logger = it.next();
            if (null != logger) {
                return logger;
            }
        }
        String loggerClazz = System.getProperty("logger.class");
        if (loggerClazz != null) {
            try {
                Class<?> Clazz = Class.forName(loggerClazz);
                return (PopLogger) Clazz.getConstructor().newInstance();
            } catch (Exception e) {
                System.err.println("自定义日志实现类加载失败 : " + loggerClazz);
                e.printStackTrace(System.err);
                return new ConsolePopLogger();
            }
        }
        return new ConsolePopLogger();
    }
}
