package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdyPdpUsersGetResponse extends PopBaseHttpResponse {

    /**
     * 接口返回结果
     */
    @JsonProperty("ddy_pdp_users_get_response")
    private DdyPdpUsersGetResponse ddyPdpUsersGetResponse;

    public DdyPdpUsersGetResponse getDdyPdpUsersGetResponse() {
        return ddyPdpUsersGetResponse;
    }

    public static class DdyPdpUsersGetResponse {

        /**
         * 总记录数
         */
        @JsonProperty("total_results")
        private Long totalResults;

        /**
         * 用户列表
         */
        @JsonProperty("users")
        private List<DdyPdpUsersGetResponseUsersItem> users;

        public Long getTotalResults() {
            return totalResults;
        }

        public List<DdyPdpUsersGetResponseUsersItem> getUsers() {
            return users;
        }
    }

    public static class DdyPdpUsersGetResponseUsersItem {

        /**
         * 用户id
         */
        @JsonProperty("owner_id")
        private Long ownerId;

        /**
         * rds数据库的实例id
         */
        @JsonProperty("rds_id")
        private String rdsId;

        /**
         * 状态，0: 暂停，1: 正常，2: 商家授权已过期
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 推送历史数据天数
         */
        @JsonProperty("history_days")
        private Integer historyDays;

        public Long getOwnerId() {
            return ownerId;
        }

        public String getRdsId() {
            return rdsId;
        }

        public Integer getStatus() {
            return status;
        }

        public Integer getHistoryDays() {
            return historyDays;
        }
    }
}