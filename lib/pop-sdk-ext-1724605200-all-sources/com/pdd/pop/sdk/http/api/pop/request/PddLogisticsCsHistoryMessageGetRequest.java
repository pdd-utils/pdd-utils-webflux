package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsCsHistoryMessageGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsCsHistoryMessageGetRequest extends PopBaseHttpRequest<PddLogisticsCsHistoryMessageGetResponse> {

    /**
     * pdd会话id
     */
    @JsonProperty("session_id")
    private String sessionId;

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
        return "pdd.logistics.cs.history.message.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsCsHistoryMessageGetResponse> getResponseClass() {
        return PddLogisticsCsHistoryMessageGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "session_id", sessionId);
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}