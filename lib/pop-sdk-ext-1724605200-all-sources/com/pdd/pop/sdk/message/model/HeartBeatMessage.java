package com.pdd.pop.sdk.message.model;

/**
 * @author likun 2019/10/15
 */

public class HeartBeatMessage {

    /**
     * 消息ID
     */
    private Long id;

    /**
     * 消息类型
     */
    private CommandType commandType;
    /**
     * 时间戳
     */
    private Long time;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    private String version = "1.1.6";

    private TimeMetrics timeMetrics;

    public HeartBeatMessage(TimeMetrics metrics) {
        this.commandType = CommandType.HeartBeat;
        this.time = System.currentTimeMillis();
        this.id = System.currentTimeMillis();
        this.timeMetrics = metrics;
    }

    public HeartBeatMessage() {
        this.commandType = CommandType.HeartBeat;
        this.time = System.currentTimeMillis();
        this.id = System.currentTimeMillis();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandType commandType) {
        this.commandType = commandType;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public TimeMetrics getTimeMetrics() {
        return timeMetrics;
    }

    public void setTimeMetrics(TimeMetrics timeMetrics) {
        this.timeMetrics = timeMetrics;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("HeartBeatMessage{");
        sb.append("id=").append(id);
        sb.append(", commandType=").append(commandType);
        sb.append(", time=").append(time);
        sb.append(", version='").append(version).append('\'');
        sb.append(", timeMetrics=").append(timeMetrics);
        sb.append('}');
        return sb.toString();
    }
}
