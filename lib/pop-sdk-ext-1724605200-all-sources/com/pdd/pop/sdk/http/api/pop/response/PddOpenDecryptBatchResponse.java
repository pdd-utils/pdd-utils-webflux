package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOpenDecryptBatchResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("open_decrypt_batch_response")
    private OpenDecryptBatchResponse openDecryptBatchResponse;

    public OpenDecryptBatchResponse getOpenDecryptBatchResponse() {
        return openDecryptBatchResponse;
    }

    public static class OpenDecryptBatchResponse {

        /**
         * list
         */
        @JsonProperty("data_decrypt_list")
        private List<OpenDecryptBatchResponseDataDecryptListItem> dataDecryptList;

        public List<OpenDecryptBatchResponseDataDecryptListItem> getDataDecryptList() {
            return dataDecryptList;
        }
    }

    public static class OpenDecryptBatchResponseDataDecryptListItem {

        /**
         * 解密tag，对于订单数据是订单号
         */
        @JsonProperty("data_tag")
        private String dataTag;

        /**
         * 1、虚拟卡密;2、虚拟卡号;3、支付申报订单号;4、支付单号;5、收件人;6、收件人手机号;7、收件人完整地址;8、收件人详细地址;9、快递单号;10、身份证号;11、身份证姓名
         */
        @JsonProperty("data_type")
        private Integer dataType;

        /**
         * 解密结果
         */
        @JsonProperty("decrypted_data")
        private String decryptedData;

        /**
         * 加密数据
         */
        @JsonProperty("encrypted_data")
        private String encryptedData;

        /**
         * 错误码, 0:成功
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 虚拟号分机号
         */
        @JsonProperty("virtual_identify_number")
        private String virtualIdentifyNumber;

        /**
         * 虚拟号类型：0-非虚拟号 1-虚拟号
         */
        @JsonProperty("virtual_number_type")
        private Integer virtualNumberType;

        public String getDataTag() {
            return dataTag;
        }

        public Integer getDataType() {
            return dataType;
        }

        public String getDecryptedData() {
            return decryptedData;
        }

        public String getEncryptedData() {
            return encryptedData;
        }

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public String getVirtualIdentifyNumber() {
            return virtualIdentifyNumber;
        }

        public Integer getVirtualNumberType() {
            return virtualNumberType;
        }
    }
}