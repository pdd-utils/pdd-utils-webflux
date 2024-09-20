package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsGetRelationResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddGoodsGetRelationRequest extends PopBaseHttpRequest<PddGoodsGetRelationResponse> {

    /**
     * 拼多多商品id
     */
    @JsonProperty("pdd_goods_id")
    private List<Long> pddGoodsId;

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
        return "pdd.goods.get.relation";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsGetRelationResponse> getResponseClass() {
        return PddGoodsGetRelationResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "pdd_goods_id", pddGoodsId);
    }

    public void setPddGoodsId(List<Long> pddGoodsId) {
        this.pddGoodsId = pddGoodsId;
    }
}