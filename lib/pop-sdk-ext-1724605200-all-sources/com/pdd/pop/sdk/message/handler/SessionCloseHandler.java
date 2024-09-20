package com.pdd.pop.sdk.message.handler;

import com.pdd.pop.sdk.message.WsClient;
import com.pdd.pop.sdk.message.model.Message;

import javax.websocket.CloseReason;

/**
 * @author likun
 * 2019/10/13
 */
public interface SessionCloseHandler {

    void onClose(WsClient client, CloseReason closeReason);

}
