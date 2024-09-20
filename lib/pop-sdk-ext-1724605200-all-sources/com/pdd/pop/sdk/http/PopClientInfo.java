package com.pdd.pop.sdk.http;

/**
 * 客户端信息
 **/
public class PopClientInfo {

    private String pddClientPlatform;

    private String pddClientIp;

    private String pddClientUserAgent;

    private String pddId;

    public String getPddClientPlatform() {
        return pddClientPlatform;
    }

    public void setPddClientPlatform(String pddClientPlatform) {
        this.pddClientPlatform = pddClientPlatform;
    }

    public String getPddClientIp() {
        return pddClientIp;
    }

    public void setPddClientIp(String pddClientIp) {
        this.pddClientIp = pddClientIp;
    }

    public String getPddClientUserAgent() {
        return pddClientUserAgent;
    }

    public void setPddClientUserAgent(String pddClientUserAgent) {
        this.pddClientUserAgent = pddClientUserAgent;
    }

    public String getPddId() {
        return pddId;
    }

    public void setPddId(String pddId) {
        this.pddId = pddId;
    }
}
