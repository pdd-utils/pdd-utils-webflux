package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderCustomSuborderResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOrderCustomSuborderRequest extends PopBaseHttpRequest<PddOrderCustomSuborderResponse> {

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 拆单具体信息List
     */
    @JsonProperty("sub_orderInfo_list")
    private List<SubOrderInfoListItem> subOrderInfoList;

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
        return "pdd.order.custom.suborder";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderCustomSuborderResponse> getResponseClass() {
        return PddOrderCustomSuborderResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "sub_orderInfo_list", subOrderInfoList);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setSubOrderInfoList(List<SubOrderInfoListItem> subOrderInfoList) {
        this.subOrderInfoList = subOrderInfoList;
    }

    public static class SubOrderInfoListItem {

        /**
         * 海关
         */
        @JsonProperty("customs")
        private String customs;

        /**
         * 应付金额（分）
         */
        @JsonProperty("order_fee")
        private Long orderFee;

        /**
         * 商品价格（分）
         */
        @JsonProperty("product_fee")
        private Long productFee;

        /**
         * 子订单号（32位）
         */
        @JsonProperty("sub_order_no")
        private String subOrderNo;

        /**
         * 物流费（分）
         */
        @JsonProperty("transport_fee")
        private Long transportFee;

        public void setCustoms(String customs) {
            this.customs = customs;
        }

        public void setOrderFee(Long orderFee) {
            this.orderFee = orderFee;
        }

        public void setProductFee(Long productFee) {
            this.productFee = productFee;
        }

        public void setSubOrderNo(String subOrderNo) {
            this.subOrderNo = subOrderNo;
        }

        public void setTransportFee(Long transportFee) {
            this.transportFee = transportFee;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}