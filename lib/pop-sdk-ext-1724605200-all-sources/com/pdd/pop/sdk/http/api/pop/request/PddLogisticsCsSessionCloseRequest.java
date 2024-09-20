package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsCsSessionCloseResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsCsSessionCloseRequest extends PopBaseHttpRequest<PddLogisticsCsSessionCloseResponse> {

    /**
     * pdd会话id
     */
    @JsonProperty("session_id")
    private String sessionId;

    /**
     * 物流公司会话id
     */
    @JsonProperty("wp_session_id")
    private String wpSessionId;

    /**
     * 样式YYYY-MM-DD HH:MM:SS
     */
    @JsonProperty("action_time")
    private String actionTime;

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
        return "pdd.logistics.cs.session.close";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsCsSessionCloseResponse> getResponseClass() {
        return PddLogisticsCsSessionCloseResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "session_id", sessionId);
        setUserParam(params, "wp_session_id", wpSessionId);
        setUserParam(params, "action_time", actionTime);
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setWpSessionId(String wpSessionId) {
        this.wpSessionId = wpSessionId;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }
}