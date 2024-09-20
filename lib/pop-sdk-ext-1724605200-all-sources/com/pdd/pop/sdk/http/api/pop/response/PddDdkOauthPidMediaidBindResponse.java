package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkOauthPidMediaidBindResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("p_id_bind_response")
    private PIdBindResponse pIdBindResponse;

    public PIdBindResponse getPIdBindResponse() {
        return pIdBindResponse;
    }

    public static class PIdBindResponse {

        /**
         * 绑定结果
         */
        @JsonProperty("result")
        private PIdBindResponseResult result;

        public PIdBindResponseResult getResult() {
            return result;
        }
    }

    public static class PIdBindResponseResult {

        /**
         * 绑定结果信息提示
         */
        @JsonProperty("msg")
        private String msg;

        /**
         * 绑定结果
         */
        @JsonProperty("result")
        private Boolean result;

        public String getMsg() {
            return msg;
        }

        public Boolean getResult() {
            return result;
        }
    }
}