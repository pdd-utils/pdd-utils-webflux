package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallInfoStoreUpdatePostResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_info_store_update_post_response")
    private MallInfoStoreUpdatePostResponse mallInfoStoreUpdatePostResponse;

    public MallInfoStoreUpdatePostResponse getMallInfoStoreUpdatePostResponse() {
        return mallInfoStoreUpdatePostResponse;
    }

    public static class MallInfoStoreUpdatePostResponse {

        /**
         * 
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}