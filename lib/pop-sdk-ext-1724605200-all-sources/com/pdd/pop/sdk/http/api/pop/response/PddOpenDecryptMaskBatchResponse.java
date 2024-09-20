package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOpenDecryptMaskBatchResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("open_decrypt_mask_batch_response")
    private OpenDecryptMaskBatchResponse openDecryptMaskBatchResponse;

    public OpenDecryptMaskBatchResponse getOpenDecryptMaskBatchResponse() {
        return openDecryptMaskBatchResponse;
    }

    public static class OpenDecryptMaskBatchResponse {

        /**
         * list
         */
        @JsonProperty("data_decrypt_list")
        private List<OpenDecryptMaskBatchResponseDataDecryptListItem> dataDecryptList;

        public List<OpenDecryptMaskBatchResponseDataDecryptListItem> getDataDecryptList() {
            return dataDecryptList;
        }
    }

    public static class OpenDecryptMaskBatchResponseDataDecryptListItem {

        /**
         * 解密tag，对于订单数据是订单号
         */
        @JsonProperty("data_tag")
        private String dataTag;

        /**
         * 1、虚拟卡密;2、虚拟卡号;3、支付商品编码;4、支付单号;5、收件人;6、收件人手机号;7、收件人完整地址;8、收件人详细地址;9、快递单号;10、身份证号;11、身份证姓名
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
    }
}