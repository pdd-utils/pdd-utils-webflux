package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallInfoStoreCreatePostResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_info_store_create_post_response")
    private MallInfoStoreCreatePostResponse mallInfoStoreCreatePostResponse;

    public MallInfoStoreCreatePostResponse getMallInfoStoreCreatePostResponse() {
        return mallInfoStoreCreatePostResponse;
    }

    public static class MallInfoStoreCreatePostResponse {

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