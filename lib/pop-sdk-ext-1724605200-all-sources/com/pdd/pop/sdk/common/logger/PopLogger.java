package com.pdd.pop.sdk.common.logger;

/**
 * Isv可通过ISP的方式接入个性化的SDK日志实现类
 * 或者通过设置启动参数 -Dlogger.class 指定日志实现类的全路径
 * 注意：日志实现类必须实现com.pdd.pop.sdk.common.logger.PopLogger接口，并提供默认的无参构造器
 */
public interface PopLogger {

    void info(String msg);
    
    void info(String msg,Throwable t);
    
    void debug(String msg);
    
    void debug(String msg,Throwable t);
    
    void error(String msg);
    
    void error(String msg,Throwable t);
}
