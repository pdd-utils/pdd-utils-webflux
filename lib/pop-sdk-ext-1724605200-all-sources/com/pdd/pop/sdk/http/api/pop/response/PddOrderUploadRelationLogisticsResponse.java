package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddOrderUploadRelationLogisticsResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("upload_extra_logistics_response")
    private UploadExtraLogisticsResponse uploadExtraLogisticsResponse;

    public UploadExtraLogisticsResponse getUploadExtraLogisticsResponse() {
        return uploadExtraLogisticsResponse;
    }

    public static class UploadExtraLogisticsResponse {

        /**
         * 是否成功，false-失败，true-成功
         */
        @JsonProperty("success")
        private Boolean success;

        public Boolean getSuccess() {
            return success;
        }
    }
}