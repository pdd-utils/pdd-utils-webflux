package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPopAuthTokenCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddPopAuthTokenCreateRequest extends PopBaseHttpRequest<PddPopAuthTokenCreateResponse> {

    /**
     * 授权code，grantType==authorization_code 时需要
     */
    @JsonProperty("code")
    private String code;

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
        return "pdd.pop.auth.token.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPopAuthTokenCreateResponse> getResponseClass() {
        return PddPopAuthTokenCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "code", code);
    }

    public void setCode(String code) {
        this.code = code;
    }
}