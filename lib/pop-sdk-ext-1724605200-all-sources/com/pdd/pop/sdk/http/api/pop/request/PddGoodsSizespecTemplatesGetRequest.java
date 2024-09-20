package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSizespecTemplatesGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsSizespecTemplatesGetRequest extends PopBaseHttpRequest<PddGoodsSizespecTemplatesGetResponse> {

    /**
     * 尺码表分类id，pdd.goods.sizespec.class.get得到
     */
    @JsonProperty("class_id")
    private Long classId;

    /**
     * 限制数量
     */
    @JsonProperty("limit")
    private Long limit;

    /**
     * 偏移量
     */
    @JsonProperty("offset")
    private Long offset;

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
        return "pdd.goods.sizespec.templates.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSizespecTemplatesGetResponse> getResponseClass() {
        return PddGoodsSizespecTemplatesGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "class_id", classId);
        setUserParam(params, "limit", limit);
        setUserParam(params, "offset", offset);
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }
}