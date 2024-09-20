package com.pdd.pop.sdk.message;

import com.pdd.pop.sdk.message.model.Message;

/**
 * 消息处理逻辑
 */
public interface MessageHandler {

    void onMessage(Message message) throws Exception;

}