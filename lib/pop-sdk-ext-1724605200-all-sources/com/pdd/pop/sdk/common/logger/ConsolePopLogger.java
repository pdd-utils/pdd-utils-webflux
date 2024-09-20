package com.pdd.pop.sdk.common.logger;

public class ConsolePopLogger implements PopLogger {
    
    /**
     * OFF --> 0
     * ERROR -->2
     * INFO  --->4
     * DEBUG --->8
     *
     */
    private static final int OFF_LEVEL = 0;
    private static final int ERROR_LEVEL = 2;
    private static final int INFO_LEVEL = 4;
    private static final int DEBUG_LEVEL = 8;
    
    /**
     * 默认是 INFO
     */
    private static int openLevel = 4;
    
    public ConsolePopLogger(){
        String level = System.getProperty("pdd.sdk.log.level","INFO");
        if("OFF".equals(level.toUpperCase())){
            openLevel = OFF_LEVEL;
        }
        if("ERROR".equals(level.toUpperCase())){
            openLevel = ERROR_LEVEL;
        }
        if("INFO".equals(level.toUpperCase())){
            openLevel = INFO_LEVEL;
        }
        if("DEBUG".equals(level.toUpperCase())){
            openLevel = DEBUG_LEVEL;
        }
    }
    
    public void info(String msg) {
        if(openLevel >=INFO_LEVEL ){
            System.out.println(msg);
        }
    }
    
    public void info(String msg, Throwable t) {
        if(openLevel >=INFO_LEVEL ){
            System.out.println(msg);
            t.printStackTrace(System.out);
        }
    }
    
    public void debug(String msg) {
        if(openLevel >=DEBUG_LEVEL ){
            System.out.println(msg);
        }
       
    }
    
    public void debug(String msg, Throwable t) {
        if(openLevel >=DEBUG_LEVEL ){
            System.out.println(msg);
            t.printStackTrace(System.out);
        }
    }
    
    public void error(String msg) {
        if(openLevel >=ERROR_LEVEL ){
            System.err.println(msg);
        }
        
    }
    
    public void error(String msg, Throwable t) {
        if(openLevel >=ERROR_LEVEL ){
            System.err.println(msg);
            t.printStackTrace(System.err);
        }
    }
}
