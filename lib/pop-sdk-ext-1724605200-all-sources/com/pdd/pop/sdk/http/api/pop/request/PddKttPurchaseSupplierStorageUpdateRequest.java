package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseSupplierStorageUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseSupplierStorageUpdateRequest extends PopBaseHttpRequest<PddKttPurchaseSupplierStorageUpdateResponse> {

    /**
     * 入参请求
     */
    @JsonProperty("request")
    private Request request;

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
        return "pdd.ktt.purchase.supplier.storage.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseSupplierStorageUpdateResponse> getResponseClass() {
        return PddKttPurchaseSupplierStorageUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * 单sku库存修改
         */
        @JsonProperty("single_sku_storage_modify_info")
        private RequestSingleSkuStorageModifyInfo singleSkuStorageModifyInfo;

        public void setSingleSkuStorageModifyInfo(RequestSingleSkuStorageModifyInfo singleSkuStorageModifyInfo) {
            this.singleSkuStorageModifyInfo = singleSkuStorageModifyInfo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }

    public static class RequestSingleSkuStorageModifyInfo {

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * skuId
         */
        @JsonProperty("sku_id")
        private Long skuId;

        /**
         * 总库存
         */
        @JsonProperty("total_quantity")
        private Long totalQuantity;

        public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public void setSkuId(Long skuId) {
            this.skuId = skuId;
        }

        public void setTotalQuantity(Long totalQuantity) {
            this.totalQuantity = totalQuantity;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}