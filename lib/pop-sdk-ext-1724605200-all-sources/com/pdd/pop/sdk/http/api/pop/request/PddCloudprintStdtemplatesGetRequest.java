package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudprintStdtemplatesGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudprintStdtemplatesGetRequest extends PopBaseHttpRequest<PddCloudprintStdtemplatesGetResponse> {

    /**
     * 快递公司code
     */
    @JsonProperty("wp_code")
    private String wpCode;

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
        return "pdd.cloudprint.stdtemplates.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudprintStdtemplatesGetResponse> getResponseClass() {
        return PddCloudprintStdtemplatesGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "wp_code", wpCode);
    }

    public void setWpCode(String wpCode) {
        this.wpCode = wpCode;
    }
}