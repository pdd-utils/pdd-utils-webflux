package com.pdd.pop.sdk.message.demo;

import com.pdd.pop.sdk.message.MessageHandler;
import com.pdd.pop.sdk.message.WsClient;
import com.pdd.pop.sdk.message.model.Message;

public class MessageDemo {

    static String clientId = "your app clientId";
    static String clientSecret = "your app clientSecret";

    public static void main(String[] args) {
        WsClient ws = new WsClient(clientId, clientSecret, new MessageHandler() {
            public void onMessage(Message message) throws InterruptedException {
                System.out.println("receive message: " + message);
            }
        });
        ws.connect();
    }
}