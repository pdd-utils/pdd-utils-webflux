package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSizespecMetaGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsSizespecMetaGetRequest extends PopBaseHttpRequest<PddGoodsSizespecMetaGetResponse> {

    /**
     * 尺码分类id
     */
    @JsonProperty("class_id")
    private Integer classId;

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
        return "pdd.goods.sizespec.meta.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSizespecMetaGetResponse> getResponseClass() {
        return PddGoodsSizespecMetaGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "class_id", classId);
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}