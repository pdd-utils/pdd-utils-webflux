package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderPromiseInfoGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOrderPromiseInfoGetRequest extends PopBaseHttpRequest<PddOrderPromiseInfoGetResponse> {

    /**
     * 承诺id
     */
    @JsonProperty("promise_id")
    private Long promiseId;

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
        return "pdd.order.promise.info.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderPromiseInfoGetResponse> getResponseClass() {
        return PddOrderPromiseInfoGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "promise_id", promiseId);
    }

    public void setPromiseId(Long promiseId) {
        this.promiseId = promiseId;
    }
}