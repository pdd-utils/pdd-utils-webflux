package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPmcUserCancelResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPmcUserCancelRequest extends PopBaseHttpRequest<PddPmcUserCancelResponse> {

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
        return "pdd.pmc.user.cancel";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPmcUserCancelResponse> getResponseClass() {
        return PddPmcUserCancelResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "owner_id", ownerId);
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
}