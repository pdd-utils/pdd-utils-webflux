package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddMallInfoGroupRemoveStoreGetResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_info_group_remove_store_get_response")
    private MallInfoGroupRemoveStoreGetResponse mallInfoGroupRemoveStoreGetResponse;

    public MallInfoGroupRemoveStoreGetResponse getMallInfoGroupRemoveStoreGetResponse() {
        return mallInfoGroupRemoveStoreGetResponse;
    }

    public static class MallInfoGroupRemoveStoreGetResponse {

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