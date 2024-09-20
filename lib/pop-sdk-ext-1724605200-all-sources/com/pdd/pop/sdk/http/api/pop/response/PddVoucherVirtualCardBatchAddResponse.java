package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddVoucherVirtualCardBatchAddResponse extends PopBaseHttpResponse {

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
         * 状态码
         */
        @JsonProperty("code")
        private Integer code;

        /**
         * 错误信息
         */
        @JsonProperty("message")
        private String message;

        /**
         * 响应信息
         */
        @JsonProperty("result")
        private ResponseResult result;

        public Integer getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

        public ResponseResult getResult() {
            return result;
        }
    }

    public static class ResponseResult {

        /**
         * 卡密批次Id
         */
        @JsonProperty("batchId")
        private Long batchId;

        /**
         * 充值地址
         */
        @JsonProperty("chargeAddress")
        private String chargeAddress;

        /**
         * 店铺Id
         */
        @JsonProperty("mallId")
        private Long mallId;

        /**
         * 批次添加的卡密数量
         */
        @JsonProperty("totalNum")
        private Integer totalNum;

        public Long getBatchId() {
            return batchId;
        }

        public String getChargeAddress() {
            return chargeAddress;
        }

        public Long getMallId() {
            return mallId;
        }

        public Integer getTotalNum() {
            return totalNum;
        }
    }
}