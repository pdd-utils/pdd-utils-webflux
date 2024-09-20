package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallInfoStoreDeletePostResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_info_store_delete_post_response")
    private MallInfoStoreDeletePostResponse mallInfoStoreDeletePostResponse;

    public MallInfoStoreDeletePostResponse getMallInfoStoreDeletePostResponse() {
        return mallInfoStoreDeletePostResponse;
    }

    public static class MallInfoStoreDeletePostResponse {

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