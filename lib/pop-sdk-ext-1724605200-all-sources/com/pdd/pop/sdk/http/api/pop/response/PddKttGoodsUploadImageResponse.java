package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddKttGoodsUploadImageResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 上传图片结果
         */
        @JsonProperty("result")
        private String result;

        /**
         * 接口调用是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        public String getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}