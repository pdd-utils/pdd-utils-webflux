package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsCoBwTrackNotifyResponse extends PopBaseHttpResponse {

    /**
     * 结构体集合
     */
    @JsonProperty("response_items")
    private List<ResponseItemsItem> responseItems;

    /**
     * 合作伙伴身份标识，拼多多会给每个合作伙伴分配ship_id
     */
    @JsonProperty("ship_id")
    private String shipId;

    public List<ResponseItemsItem> getResponseItems() {
        return responseItems;
    }

    public String getShipId() {
        return shipId;
    }

    public static class ResponseItemsItem {

        /**
         * 数据ID
         */
        @JsonProperty("id")
        private String id;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 异常码
         */
        @JsonProperty("reason_code")
        private String reasonCode;

        /**
         * 执行结果
         */
        @JsonProperty("success")
        private Boolean success;

        public String getId() {
            return id;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public String getReasonCode() {
            return reasonCode;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}