package com.pdd.pop.sdk.message.handler;

import com.pdd.pop.sdk.message.model.Message;

public interface SendAckResultHandler {

    void onAck(Message message, boolean ackResult, String failReason);
}
