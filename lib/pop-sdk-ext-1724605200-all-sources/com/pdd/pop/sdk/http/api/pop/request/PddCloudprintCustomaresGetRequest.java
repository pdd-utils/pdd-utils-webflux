package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudprintCustomaresGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudprintCustomaresGetRequest extends PopBaseHttpRequest<PddCloudprintCustomaresGetResponse> {

    /**
     * 即pdd.cloudprint.stdtemplates.get接口返回的standard_template_id
     */
    @JsonProperty("template_id")
    private Integer templateId;

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
        return "pdd.cloudprint.customares.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudprintCustomaresGetResponse> getResponseClass() {
        return PddCloudprintCustomaresGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "template_id", templateId);
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }
}