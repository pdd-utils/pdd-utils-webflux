package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFdsRoleGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_fds_role_get_response")
    private InnerPddFdsRoleGetResponse pddFdsRoleGetResponse;

    public InnerPddFdsRoleGetResponse getPddFdsRoleGetResponse() {
        return pddFdsRoleGetResponse;
    }

    public static class InnerPddFdsRoleGetResponse {

        /**
         * 店铺身份 0：未知身份 2：厂家
         */
        @JsonProperty("mall_role")
        private Integer mallRole;

        public Integer getMallRole() {
            return mallRole;
        }
    }
}