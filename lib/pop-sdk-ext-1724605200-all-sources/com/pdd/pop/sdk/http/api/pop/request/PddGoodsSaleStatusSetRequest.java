package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddGoodsSaleStatusSetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddGoodsSaleStatusSetRequest extends PopBaseHttpRequest<PddGoodsSaleStatusSetResponse> {

    /**
     * 拼多多商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 上下架状态：1:上架 0:下架
     */
    @JsonProperty("is_onsale")
    private Integer isOnsale;

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
        return "pdd.goods.sale.status.set";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddGoodsSaleStatusSetResponse> getResponseClass() {
        return PddGoodsSaleStatusSetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "is_onsale", isOnsale);
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setIsOnsale(Integer isOnsale) {
        this.isOnsale = isOnsale;
    }
}