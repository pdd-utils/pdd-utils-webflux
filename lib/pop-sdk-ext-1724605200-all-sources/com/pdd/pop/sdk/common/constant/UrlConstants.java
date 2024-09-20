package com.pdd.pop.sdk.common.constant;

/**
 * @author xuanli
 * @Description: UrlConstants
 * @date 2020/4/20 21:21
 */
public interface UrlConstants {
    
    /**
     * api网关服务地址
     */
    String openServerUrl = "https://gw-api.pinduoduo.com/api/router";
    
    String uploadServerUrl = "https://gw-upload.pinduoduo.com/api/upload";
    
    String arkServerUrl = "https://ark-api.pinduoduo.com/ark/router";
    
    String DEFAULT_WS_ADDRESS = "wss://message-api.pinduoduo.com";
    
    String OAUTH_SERVER_URL = "https://open-api.pinduoduo.com/oauth/token";
    
    String CLOUD_INNER_CHECK = "http://open-api.pinduoduo.com/pop/user/cloudinner/check";
}
