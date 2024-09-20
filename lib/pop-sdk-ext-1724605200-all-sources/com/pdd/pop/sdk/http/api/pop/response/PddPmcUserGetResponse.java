package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddPmcUserGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pmc_user_get_response")
    private PmcUserGetResponse pmcUserGetResponse;

    public PmcUserGetResponse getPmcUserGetResponse() {
        return pmcUserGetResponse;
    }

    public static class PmcUserGetResponse {

        /**
         * 开通的用户数据
         */
        @JsonProperty("pmc_user")
        private PmcUserGetResponsePmcUser pmcUser;

        public PmcUserGetResponsePmcUser getPmcUser() {
            return pmcUser;
        }
    }

    public static class PmcUserGetResponsePmcUser {

        /**
         * 用户首次开通时间
         */
        @JsonProperty("created")
        private String created;

        /**
         * 用户授权是否有效，0表示授权有效，1表示授权过期
         */
        @JsonProperty("is_expire")
        private Integer isExpire;

        /**
         * 用户最后开通时间
         */
        @JsonProperty("modified")
        private String modified;

        /**
         * 用户ID
         */
        @JsonProperty("owner_id")
        private String ownerId;

        /**
         * 用户开通的消息类型列表。如果为空表示应用开通的所有类型
         */
        @JsonProperty("topics")
        private List<String> topics;

        public String getCreated() {
            return created;
        }

        public Integer getIsExpire() {
            return isExpire;
        }

        public String getModified() {
            return modified;
        }

        public String getOwnerId() {
            return ownerId;
        }

        public List<String> getTopics() {
            return topics;
        }
    }
}