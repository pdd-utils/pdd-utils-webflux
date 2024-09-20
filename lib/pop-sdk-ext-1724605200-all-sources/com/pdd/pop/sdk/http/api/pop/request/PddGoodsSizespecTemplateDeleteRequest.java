package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSizespecTemplateDeleteResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsSizespecTemplateDeleteRequest extends PopBaseHttpRequest<PddGoodsSizespecTemplateDeleteResponse> {

    /**
     * 尺码表模板id
     */
    @JsonProperty("id")
    private Long id;

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
        return "pdd.goods.sizespec.template.delete";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSizespecTemplateDeleteResponse> getResponseClass() {
        return PddGoodsSizespecTemplateDeleteResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "id", id);
    }

    public void setId(Long id) {
        this.id = id;
    }
}