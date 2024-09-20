package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddEinvoiceQueryMallRegisterOrderResponse extends PopBaseHttpResponse {

    /**
     * 响应体
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 错误码
         */
        @JsonProperty("code")
        private Integer code;

        /**
         * 错误信息
         */
        @JsonProperty("message")
        private String message;

        /**
         * 结果
         */
        @JsonProperty("result")
        private ResponseResult result;

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getCode() {
            return code;
        }

        public String getMessage() {
            return message;
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
         * 订单列表
         */
        @JsonProperty("data")
        private List<ResponseResultDataItem> data;

        /**
         * 
         */
        @JsonProperty("totalCount")
        private Integer totalCount;

        public List<ResponseResultDataItem> getData() {
            return data;
        }

        public Integer getTotalCount() {
            return totalCount;
        }
    }

    public static class ResponseResultDataItem {

        /**
         * 联系邮箱
         */
        @JsonProperty("contactEmail")
        private String contactEmail;

        /**
         * 联系人
         */
        @JsonProperty("contacter")
        private String contacter;

        /**
         * 联系电话
         */
        @JsonProperty("contactMobile")
        private String contactMobile;

        /**
         * 创建时间戳 秒
         */
        @JsonProperty("createTime")
        private Long createTime;

        /**
         * 税盘数量
         */
        @JsonProperty("diskCount")
        private Integer diskCount;

        /**
         * 税盘类型
         */
        @JsonProperty("diskType")
        private Integer diskType;

        /**
         * 事件流水号
         */
        @JsonProperty("eventSerialNo")
        private String eventSerialNo;

        /**
         * 订单有效期结束时间戳 毫秒
         */
        @JsonProperty("expirationEndTime")
        private Long expirationEndTime;

        /**
         * 订单有效期开始时间戳 毫秒
         */
        @JsonProperty("expirationStartTime")
        private Long expirationStartTime;

        /**
         * 商家Id
         */
        @JsonProperty("mallId")
        private String mallId;

        /**
         * 订单Id
         */
        @JsonProperty("orderId")
        private String orderId;

        /**
         * 
         */
        @JsonProperty("registerId")
        private String registerId;

        /**
         * 订单状态
         */
        @JsonProperty("registerStatus")
        private Integer registerStatus;

        /**
         * 税局名称
         */
        @JsonProperty("taxOffice")
        private String taxOffice;

        /**
         * 税号
         */
        @JsonProperty("taxpayerCode")
        private String taxpayerCode;

        /**
         * 纳税人名称
         */
        @JsonProperty("taxpayerName")
        private String taxpayerName;

        /**
         * 税盘管理类型
         */
        @JsonProperty("depositoryType")
        private Integer depositoryType;

        /**
         * 商户订单类型
         */
        @JsonProperty("orderType")
        private Integer orderType;

        /**
         * 税局编码
         */
        @JsonProperty("taxOfficeCode")
        private Integer taxOfficeCode;

        public String getContactEmail() {
            return contactEmail;
        }

        public String getContacter() {
            return contacter;
        }

        public String getContactMobile() {
            return contactMobile;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public Integer getDiskCount() {
            return diskCount;
        }

        public Integer getDiskType() {
            return diskType;
        }

        public String getEventSerialNo() {
            return eventSerialNo;
        }

        public Long getExpirationEndTime() {
            return expirationEndTime;
        }

        public Long getExpirationStartTime() {
            return expirationStartTime;
        }

        public String getMallId() {
            return mallId;
        }

        public String getOrderId() {
            return orderId;
        }

        public String getRegisterId() {
            return registerId;
        }

        public Integer getRegisterStatus() {
            return registerStatus;
        }

        public String getTaxOffice() {
            return taxOffice;
        }

        public String getTaxpayerCode() {
            return taxpayerCode;
        }

        public String getTaxpayerName() {
            return taxpayerName;
        }

        public Integer getDepositoryType() {
            return depositoryType;
        }

        public Integer getOrderType() {
            return orderType;
        }

        public Integer getTaxOfficeCode() {
            return taxOfficeCode;
        }
    }
}