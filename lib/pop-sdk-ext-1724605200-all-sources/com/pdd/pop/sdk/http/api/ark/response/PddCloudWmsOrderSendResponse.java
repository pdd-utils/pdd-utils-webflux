package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCloudWmsOrderSendResponse extends PopBaseHttpResponse {

    /**
     * 响应
     */
    @JsonProperty("send_response")
    private SendResponse sendResponse;

    public SendResponse getSendResponse() {
        return sendResponse;
    }

    public static class SendResponse {

        /**
         * 响应数据
         */
        @JsonProperty("data")
        private SendResponseData data;

        /**
         * 是否成功，false-失败，true-成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 子错误信息
         */
        @JsonProperty("sub_msg")
        private String subMsg;

        /**
         * 子错误码
         */
        @JsonProperty("sub_code")
        private Integer subCode;

        /**
         * 错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        public SendResponseData getData() {
            return data;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public String getSubMsg() {
            return subMsg;
        }

        public Integer getSubCode() {
            return subCode;
        }

        public Integer getErrorCode() {
            return errorCode;
        }
    }

    public static class SendResponseData {

        /**
         * 出库单仓储系统编码
         */
        @JsonProperty("delivery_order_id")
        private String deliveryOrderId;

        /**
         * 物流公司编码
         */
        @JsonProperty("logistics_code")
        private String logisticsCode;

        /**
         * 仓库编码
         */
        @JsonProperty("warehouse_code")
        private String warehouseCode;

        /**
         * 仓库类型
         */
        @JsonProperty("warehouse_type")
        private String warehouseType;

        /**
         * 订单创建时间(YYYY-MM-DD HH:MM:SS)
         */
        @JsonProperty("create_time")
        private String createTime;

        public String getDeliveryOrderId() {
            return deliveryOrderId;
        }

        public String getLogisticsCode() {
            return logisticsCode;
        }

        public String getWarehouseCode() {
            return warehouseCode;
        }

        public String getWarehouseType() {
            return warehouseType;
        }

        public String getCreateTime() {
            return createTime;
        }
    }
}