package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudMallInfoGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudMallInfoGetRequest extends PopBaseHttpRequest<PddCloudMallInfoGetResponse> {

    /**
     * 店铺ID
     */
    @JsonProperty("mall_id")
    private Long mallId;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.cloud.mall.info.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudMallInfoGetResponse> getResponseClass() {
        return PddCloudMallInfoGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "mall_id", mallId);
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }
}