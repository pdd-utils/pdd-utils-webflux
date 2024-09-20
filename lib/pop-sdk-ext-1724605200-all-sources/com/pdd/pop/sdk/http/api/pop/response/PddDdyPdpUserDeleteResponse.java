package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdyPdpUserDeleteResponse extends PopBaseHttpResponse {

    /**
     * 返回结果
     */
    @JsonProperty("ddy_pdp_users_delete_response")
    private DdyPdpUsersDeleteResponse ddyPdpUsersDeleteResponse;

    public DdyPdpUsersDeleteResponse getDdyPdpUsersDeleteResponse() {
        return ddyPdpUsersDeleteResponse;
    }

    public static class DdyPdpUsersDeleteResponse {

        /**
         * 是否删除成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}