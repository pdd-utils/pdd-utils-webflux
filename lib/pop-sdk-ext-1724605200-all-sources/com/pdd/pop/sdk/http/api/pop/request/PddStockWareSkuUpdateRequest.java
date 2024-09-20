package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddStockWareSkuUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddStockWareSkuUpdateRequest extends PopBaseHttpRequest<PddStockWareSkuUpdateResponse> {

    /**
     * 货品id
     */
    @JsonProperty("ware_id")
    private Long wareId;

    /**
     * 组合货品中子货品的关联关系
     */
    @JsonProperty("ware_skus")
    private List<WareSkusItem> wareSkus;

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
        return "pdd.stock.ware.sku.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockWareSkuUpdateResponse> getResponseClass() {
        return PddStockWareSkuUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ware_id", wareId);
        setUserParam(params, "ware_skus", wareSkus);
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public void setWareSkus(List<WareSkusItem> wareSkus) {
        this.wareSkus = wareSkus;
    }

    public static class WareSkusItem {

        /**
         * sku id
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}