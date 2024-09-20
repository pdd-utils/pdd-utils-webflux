package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsPriceCheckResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsPriceCheckRequest extends PopBaseHttpRequest<PddGoodsPriceCheckResponse> {

    /**
     * 商品id，long值，大于0
     */
    @JsonProperty("goodsId")
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
        return "pdd.goods.price.check";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsPriceCheckResponse> getResponseClass() {
        return PddGoodsPriceCheckResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goodsId", goodsId);
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}