package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttGroupQueryStatusResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttGroupQueryStatusRequest extends PopBaseHttpRequest<PddKttGroupQueryStatusResponse> {

    /**
     * 团号，创建团购接口获得
     */
    @JsonProperty("activity_no")
    private String activityNo;

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
        return "pdd.ktt.group.query.status";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttGroupQueryStatusResponse> getResponseClass() {
        return PddKttGroupQueryStatusResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "activity_no", activityNo);
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }
}