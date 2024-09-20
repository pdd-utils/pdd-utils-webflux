package com.pdd.pop.sdk.message.model;

import java.io.Serializable;

public class ServerMessage implements Serializable{

    private static final long serialVersionUID = -1L;

    /**
     * 消息ID
     */
    private Long id;


    /**
     * 消息ID
     */
    private Long appId;
    /**
     * 消息类型
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
     * 消息体内容
     */
    private Message message;

    public ServerMessage() {
    }

    public ServerMessage(CommandType type) {
        this.commandType = type;
        this.time = System.currentTimeMillis();
        this.id = System.currentTimeMillis();
    }

    public ServerMessage(Long id, CommandType ack) {
        this.id = id;
        this.commandType = ack;
        this.time = System.currentTimeMillis();
    }

    public ServerMessage(Long id, CommandType ack, Long sendTime) {
        this.id = id;
        this.commandType = ack;
        this.time = System.currentTimeMillis();
        this.sendTime = sendTime;
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public void setCommandType(CommandType commandType) {
        this.commandType = commandType;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return "ServerMessage{" +
                "id=" + id +
                ", commandType=" + commandType +
                ", time=" + time +
                ", message=" + message +
                '}';
    }

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }
}
