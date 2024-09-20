package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallInfoGroupAddStorePostResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_info_group_add_store_post_response")
    private MallInfoGroupAddStorePostResponse mallInfoGroupAddStorePostResponse;

    public MallInfoGroupAddStorePostResponse getMallInfoGroupAddStorePostResponse() {
        return mallInfoGroupAddStorePostResponse;
    }

    public static class MallInfoGroupAddStorePostResponse {

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