package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudSecurityEventTrackingLoginResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudSecurityEventTrackingLoginRequest extends PopBaseHttpRequest<PddCloudSecurityEventTrackingLoginResponse> {

    /**
     * 如果登录成功，可以填"success", 否则可以填写登录失败的原因
     */
    @JsonProperty("loginMessage")
    private String loginMessage;

    /**
     * 登录结果
     */
    @JsonProperty("loginResult")
    private Boolean loginResult;

    /**
     * 店铺id列表
     */
    @JsonProperty("mallIdList")
    private List<Long> mallIdList;

    /**
     * cookie中的_pati值
     */
    @JsonProperty("pati")
    private String pati;

    /**
     * 事件时间（毫秒级别的时间戳）
     */
    @JsonProperty("timestamp")
    private Long timestamp;

    /**
     * 用户唯一标识
     */
    @JsonProperty("userId")
    private String userId;

    /**
     * 用户IP
     */
    @JsonProperty("userIp")
    private String userIp;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.cloud.security.event.tracking.login";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudSecurityEventTrackingLoginResponse> getResponseClass() {
        return PddCloudSecurityEventTrackingLoginResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "loginMessage", loginMessage);
        setUserParam(params, "loginResult", loginResult);
        setUserParam(params, "mallIdList", mallIdList);
        setUserParam(params, "pati", pati);
        setUserParam(params, "timestamp", timestamp);
        setUserParam(params, "userId", userId);
        setUserParam(params, "userIp", userIp);
    }

    public void setLoginMessage(String loginMessage) {
        this.loginMessage = loginMessage;
    }

    public void setLoginResult(Boolean loginResult) {
        this.loginResult = loginResult;
    }

    public void setMallIdList(List<Long> mallIdList) {
        this.mallIdList = mallIdList;
    }

    public void setPati(String pati) {
        this.pati = pati;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }
}