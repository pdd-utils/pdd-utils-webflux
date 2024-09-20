package com.pdd.pop.sdk.message.model;

/**
 * @author likun
 * 2019/10/16
 */
public class AckMessage {

    /**
     * 消息ID
     */
    private Long id;

    /**
     * 命令类型
     */
    private CommandType commandType;
    /**
     * 时间戳
     */
    private Long time;

    /**
     * 发送时间戳，用于区分日期
     */
    private Long sendTime;
    /**
     * 消息类型
     */
    private String type;
    /**
     * 商户ID
     */
    private Long mallID;

    public AckMessage(){

    }

    public AckMessage(Long id, CommandType commandType, Long sendTime, String type, Long mallID, String failReason) {
        this.id = id;
        this.commandType = commandType;
        this.time = System.currentTimeMillis();
        this.sendTime = sendTime;
        this.mallID = mallID;
        this.type=type;
        this.failReason = failReason;
    }

    private String failReason;

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
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

    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getMallID() {
        return mallID;
    }

    public void setMallID(Long mallID) {
        this.mallID = mallID;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AckMessage{");
        sb.append("id=").append(id);
        sb.append(", commandType=").append(commandType);
        sb.append(", time=").append(time);
        sb.append(", failReason='").append(failReason).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", mallID=").append(mallID);
        sb.append('}');
        return sb.toString();
    }
}
