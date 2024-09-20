package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddStockGoodsIdToSkuQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddStockGoodsIdToSkuQueryRequest extends PopBaseHttpRequest<PddStockGoodsIdToSkuQueryResponse> {

    /**
     * 商品id
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 是否需要查询下架商品和sku，默认不需要
     */
    @JsonProperty("need_offsale")
    private Boolean needOffsale;

    /**
     * 货品id
     */
    @JsonProperty("ware_id")
    private Long wareId;

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
        return "pdd.stock.goods.id.to.sku.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockGoodsIdToSkuQueryResponse> getResponseClass() {
        return PddStockGoodsIdToSkuQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "need_offsale", needOffsale);
        setUserParam(params, "ware_id", wareId);
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setNeedOffsale(Boolean needOffsale) {
        this.needOffsale = needOffsale;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }
}