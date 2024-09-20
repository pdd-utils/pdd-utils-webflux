package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVasOrderUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddVasOrderUpdateRequest extends PopBaseHttpRequest<PddVasOrderUpdateResponse> {

    /**
     * 幂等id
     */
    @JsonProperty("out_id")
    private String outId;

    /**
     * 订购时长，单位秒
     */
    @JsonProperty("time_length")
    private Long timeLength;

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
        return "pdd.vas.order.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVasOrderUpdateResponse> getResponseClass() {
        return PddVasOrderUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "out_id", outId);
        setUserParam(params, "time_length", timeLength);
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public void setTimeLength(Long timeLength) {
        this.timeLength = timeLength;
    }
}