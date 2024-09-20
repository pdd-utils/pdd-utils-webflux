package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPmcUserGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPmcUserGetRequest extends PopBaseHttpRequest<PddPmcUserGetResponse> {

    /**
     * 用户唯一id
     */
    @JsonProperty("owner_id")
    private String ownerId;

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
        return "pdd.pmc.user.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPmcUserGetResponse> getResponseClass() {
        return PddPmcUserGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "owner_id", ownerId);
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}