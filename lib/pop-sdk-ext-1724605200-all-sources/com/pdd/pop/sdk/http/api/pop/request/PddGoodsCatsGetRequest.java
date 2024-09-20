package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCatsGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsCatsGetRequest extends PopBaseHttpRequest<PddGoodsCatsGetResponse> {

    /**
     * 值=0时为顶点cat_id,通过树顶级节点获取cat树
     */
    @JsonProperty("parent_cat_id")
    private Long parentCatId;

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
        return "pdd.goods.cats.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCatsGetResponse> getResponseClass() {
        return PddGoodsCatsGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "parent_cat_id", parentCatId);
    }

    public void setParentCatId(Long parentCatId) {
        this.parentCatId = parentCatId;
    }
}