package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddKttGroupCreateResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 团号，用于请求创建团结果
         */
        @JsonProperty("activity_no")
        private String activityNo;

        /**
         * 调用是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        public String getActivityNo() {
            return activityNo;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}