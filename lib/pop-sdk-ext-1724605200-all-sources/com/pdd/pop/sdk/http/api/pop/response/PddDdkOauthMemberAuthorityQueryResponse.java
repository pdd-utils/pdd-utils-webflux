package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddDdkOauthMemberAuthorityQueryResponse extends PopBaseHttpResponse {

    /**
     * 查询结果
     */
    @JsonProperty("authority_query_response")
    private AuthorityQueryResponse authorityQueryResponse;

    public AuthorityQueryResponse getAuthorityQueryResponse() {
        return authorityQueryResponse;
    }

    public static class AuthorityQueryResponse {

        /**
         * 1-已绑定；0-未绑定
         */
        @JsonProperty("bind")
        private Integer bind;

        public Integer getBind() {
            return bind;
        }
    }
}