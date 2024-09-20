package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSpecGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsSpecGetRequest extends PopBaseHttpRequest<PddGoodsSpecGetResponse> {

    /**
     * 叶子类目ID，必须入参level=3时的cat_id,否则无法返回正确的参数
     */
    @JsonProperty("cat_id")
    private Long catId;

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
        return "pdd.goods.spec.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSpecGetResponse> getResponseClass() {
        return PddGoodsSpecGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cat_id", catId);
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }
}