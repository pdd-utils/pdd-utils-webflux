package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOpenKmsEncryptBatchResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("open_kms_encrypt_batch_response")
    private OpenKmsEncryptBatchResponse openKmsEncryptBatchResponse;

    public OpenKmsEncryptBatchResponse getOpenKmsEncryptBatchResponse() {
        return openKmsEncryptBatchResponse;
    }

    public static class OpenKmsEncryptBatchResponse {

        /**
         * list
         */
        @JsonProperty("data_encrypt_list")
        private List<OpenKmsEncryptBatchResponseDataEncryptListItem> dataEncryptList;

        public List<OpenKmsEncryptBatchResponseDataEncryptListItem> getDataEncryptList() {
            return dataEncryptList;
        }
    }

    public static class OpenKmsEncryptBatchResponseDataEncryptListItem {

        /**
         * 明文数据
         */
        @JsonProperty("data")
        private String data;

        /**
         * 加密结果
         */
        @JsonProperty("data_encrypt")
        private String dataEncrypt;

        /**
         * 是否支持搜索
         */
        @JsonProperty("search")
        private Boolean search;

        /**
         * 是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        /**
         * 敏感信息类型. id: 身份证号, phone: 手机号码, simple: 昵称, 地址等
         */
        @JsonProperty("type")
        private String type;

        public String getData() {
            return data;
        }

        public String getDataEncrypt() {
            return dataEncrypt;
        }

        public Boolean getSearch() {
            return search;
        }

        public Boolean getSuccess() {
            return success;
        }

        public String getType() {
            return type;
        }
    }
}