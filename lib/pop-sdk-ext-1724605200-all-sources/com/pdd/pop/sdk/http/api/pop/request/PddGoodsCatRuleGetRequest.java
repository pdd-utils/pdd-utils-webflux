package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsCatRuleGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsCatRuleGetRequest extends PopBaseHttpRequest<PddGoodsCatRuleGetResponse> {

    /**
     * 类目id
     */
    @JsonProperty("cat_id")
    private Long catId;

    /**
     * 商品id，编辑的时候需要传被编辑的商品id，发布商品时如果已有商品id也需要传
     */
    @JsonProperty("goods_id")
    private Long goodsId;

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
        return "pdd.goods.cat.rule.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsCatRuleGetResponse> getResponseClass() {
        return PddGoodsCatRuleGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cat_id", catId);
        setUserParam(params, "goods_id", goodsId);
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}