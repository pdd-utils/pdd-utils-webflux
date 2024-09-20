package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseSupplierGoodsInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttPurchaseSupplierGoodsInfoRequest extends PopBaseHttpRequest<PddKttPurchaseSupplierGoodsInfoResponse> {

    /**
     * 列表请求信息
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
        return "pdd.ktt.purchase.supplier.goods.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseSupplierGoodsInfoResponse> getResponseClass() {
        return PddKttPurchaseSupplierGoodsInfoResponse.class;
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
         * 商品前台状态 1：在售中 2：已下架 3：发布中 4：已驳回 5：未发布
         */
        @JsonProperty("goods_front_status")
        private Integer goodsFrontStatus;

        /**
         * 商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 页码
         */
        @JsonProperty("page_no")
        private Integer pageNo;

        /**
         * 分页大小
         */
        @JsonProperty("page_size")
        private Integer pageSize;

        public void setGoodsFrontStatus(Integer goodsFrontStatus) {
            this.goodsFrontStatus = goodsFrontStatus;
        }

        public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public void setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}