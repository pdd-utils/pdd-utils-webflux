package com.pdd.pop.sdk.http.api.file.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkReportVideoUploadPartResponse extends PopBaseHttpResponse {

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
         * 表示本次成功上传的part number
         */
        @JsonProperty("uploaded_part_num")
        private Integer uploadedPartNum;

        public Integer getUploadedPartNum() {
            return uploadedPartNum;
        }
    }
}