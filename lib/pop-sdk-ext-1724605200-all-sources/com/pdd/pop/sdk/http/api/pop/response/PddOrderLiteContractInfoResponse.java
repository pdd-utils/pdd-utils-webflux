package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOrderLiteContractInfoResponse extends PopBaseHttpResponse {

    /**
     * 响应结果
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 状态码 code=1000000代表请求成功
         */
        @JsonProperty("code")
        private Integer code;

        /**
         * 响应信息
         */
        @JsonProperty("msg")
        private String msg;

        /**
         * 轻合约信息
         */
        @JsonProperty("result")
        private ResponseResult result;

        public Integer getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }

        public ResponseResult getResult() {
            return result;
        }
    }

    public static class ResponseResult {

        /**
         * 合约手机号（密文）
         */
        @JsonProperty("contract_mobile")
        private String contractMobile;

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 合约套餐编码(小金币类型有值)
         */
        @JsonProperty("package_code")
        private String packageCode;

        /**
         * 1035：顺差；1191：小金币
         */
        @JsonProperty("source_type")
        private Integer sourceType;

        /**
         * 对应的验证码
         */
        @JsonProperty("verification_code")
        private String verificationCode;

        public String getContractMobile() {
            return contractMobile;
        }

        public String getOrderSn() {
            return orderSn;
        }

        public String getPackageCode() {
            return packageCode;
        }

        public Integer getSourceType() {
            return sourceType;
        }

        public String getVerificationCode() {
            return verificationCode;
        }
    }
}