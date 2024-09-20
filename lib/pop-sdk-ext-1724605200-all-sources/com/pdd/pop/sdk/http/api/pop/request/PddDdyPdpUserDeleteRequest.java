package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdyPdpUserDeleteResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdyPdpUserDeleteRequest extends PopBaseHttpRequest<PddDdyPdpUserDeleteResponse> {

    /**
     * 需要删除的用户编号
     */
    @JsonProperty("owner_id")
    private Long ownerId;

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
        return "pdd.ddy.pdp.user.delete";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdyPdpUserDeleteResponse> getResponseClass() {
        return PddDdyPdpUserDeleteResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "owner_id", ownerId);
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}