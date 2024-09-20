package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkTmcActivityListResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("tmc_aty_list_response")
    private TmcAtyListResponse tmcAtyListResponse;

    public TmcAtyListResponse getTmcAtyListResponse() {
        return tmcAtyListResponse;
    }

    public static class TmcAtyListResponse {

        /**
         * 实际查询的结束时间
         */
        @JsonProperty("query_end_time")
        private String queryEndTime;

        /**
         * 实际查询的开始时间
         */
        @JsonProperty("query_start_time")
        private String queryStartTime;

        /**
         * 千万神券活动列表
         */
        @JsonProperty("tmc_aty_vo_list")
        private List<TmcAtyListResponseTmcAtyVoListItem> tmcAtyVoList;

        /**
         * 活动总数
         */
        @JsonProperty("total")
        private Integer total;

        public String getQueryEndTime() {
            return queryEndTime;
        }

        public String getQueryStartTime() {
            return queryStartTime;
        }

        public List<TmcAtyListResponseTmcAtyVoListItem> getTmcAtyVoList() {
            return tmcAtyVoList;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class TmcAtyListResponseTmcAtyVoListItem {

        /**
         * 活动结束时间
         */
        @JsonProperty("end_time")
        private String endTime;

        /**
         * 神券活动编号 用于生链是传递
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 活动名称
         */
        @JsonProperty("name")
        private String name;

        /**
         * 活动开始时间
         */
        @JsonProperty("start_time")
        private String startTime;

        /**
         * 活动类型 1日常活动日 2品牌日
         */
        @JsonProperty("type")
        private Integer type;

        public String getEndTime() {
            return endTime;
        }

        public Long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getStartTime() {
            return startTime;
        }

        public Integer getType() {
            return type;
        }
    }
}