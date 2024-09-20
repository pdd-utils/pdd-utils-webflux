package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttGoodsIncrQuantityResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttGoodsIncrQuantityRequest extends PopBaseHttpRequest<PddKttGoodsIncrQuantityResponse> {

    /**
     * goods ID
     */
    @JsonProperty("goods_id")
    private Long goodsId;

    /**
     * 修改库存的类型，不传或1代表增量修改，2代表全量修改
     */
    @JsonProperty("modify_quantity_type")
    private Integer modifyQuantityType;

    /**
     * 库存增减值
     */
    @JsonProperty("quantity_delta")
    private Integer quantityDelta;

    /**
     * sku ID
     */
    @JsonProperty("sku_id")
    private Long skuId;

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
        return "pdd.ktt.goods.incr.quantity";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttGoodsIncrQuantityResponse> getResponseClass() {
        return PddKttGoodsIncrQuantityResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "goods_id", goodsId);
        setUserParam(params, "modify_quantity_type", modifyQuantityType);
        setUserParam(params, "quantity_delta", quantityDelta);
        setUserParam(params, "sku_id", skuId);
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public void setModifyQuantityType(Integer modifyQuantityType) {
        this.modifyQuantityType = modifyQuantityType;
    }

    public void setQuantityDelta(Integer quantityDelta) {
        this.quantityDelta = quantityDelta;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}