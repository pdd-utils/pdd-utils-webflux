package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttHelpSellQueryCommissionResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 
         */
        @JsonProperty("result")
        private ResponseResult result;

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public ResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseResult {

        /**
         * 父单分佣列表
         */
        @JsonProperty("parent_order_commission_list")
        private List<ResponseResultParentOrderCommissionListItem> parentOrderCommissionList;

        public List<ResponseResultParentOrderCommissionListItem> getParentOrderCommissionList() {
            return parentOrderCommissionList;
        }
    }

    public static class ResponseResultParentOrderCommissionListItem {

        /**
         * 子单分佣列表
         */
        @JsonProperty("order_commission_list")
        private List<ResponseResultParentOrderCommissionListItemOrderCommissionListItem> orderCommissionList;

        /**
         * 父单号
         */
        @JsonProperty("parent_order_sn")
        private String parentOrderSn;

        public List<ResponseResultParentOrderCommissionListItemOrderCommissionListItem> getOrderCommissionList() {
            return orderCommissionList;
        }

        public String getParentOrderSn() {
            return parentOrderSn;
        }
    }

    public static class ResponseResultParentOrderCommissionListItemOrderCommissionListItem {

        /**
         * 商品佣金（分）
         */
        @JsonProperty("goods_commission")
        private Long goodsCommission;

        /**
         * 分佣状态 1-成功 2-失败 3-处理中
         */
        @JsonProperty("goods_commission_status")
        private Integer goodsCommissionStatus;

        /**
         * 子单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        public Long getGoodsCommission() {
            return goodsCommission;
        }

        public Integer getGoodsCommissionStatus() {
            return goodsCommissionStatus;
        }

        public String getOrderSn() {
            return orderSn;
        }
    }
}