package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttGroupQueryListResponse extends PopBaseHttpResponse {

    /**
     * 结果
     */
    @JsonProperty("ktt_group_query_list_response")
    private KttGroupQueryListResponse kttGroupQueryListResponse;

    public KttGroupQueryListResponse getKttGroupQueryListResponse() {
        return kttGroupQueryListResponse;
    }

    public static class KttGroupQueryListResponse {

        /**
         * 团列表
         */
        @JsonProperty("activity_list")
        private List<KttGroupQueryListResponseActivityListItem> activityList;

        /**
         * 总团数量
         */
        @JsonProperty("total")
        private Long total;

        public List<KttGroupQueryListResponseActivityListItem> getActivityList() {
            return activityList;
        }

        public Long getTotal() {
            return total;
        }
    }

    public static class KttGroupQueryListResponseActivityListItem {

        /**
         * 团号
         */
        @JsonProperty("activity_no")
        private String activityNo;

        /**
         * 创建时间（毫秒时间戳）
         */
        @JsonProperty("create_time")
        private Long createTime;

        /**
         * 团结束时间（毫秒时间戳）
         */
        @JsonProperty("end_time")
        private Long endTime;

        /**
         * 是否帮卖（0:我发布的，1:我帮卖的）
         */
        @JsonProperty("is_help_sell")
        private Integer isHelpSell;

        /**
         * 团开始时间（毫秒时间戳）
         */
        @JsonProperty("start_time")
        private Long startTime;

        /**
         * 团状态（-10:待发布，-5:未开始，1:跟团中，20:已结束，30:已删除）
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 团标题
         */
        @JsonProperty("title")
        private String title;

        /**
         * 更新时间（毫秒时间戳）
         */
        @JsonProperty("update_time")
        private Long updateTime;

        public String getActivityNo() {
            return activityNo;
        }

        public Long getCreateTime() {
            return createTime;
        }

        public Long getEndTime() {
            return endTime;
        }

        public Integer getIsHelpSell() {
            return isHelpSell;
        }

        public Long getStartTime() {
            return startTime;
        }

        public Integer getStatus() {
            return status;
        }

        public String getTitle() {
            return title;
        }

        public Long getUpdateTime() {
            return updateTime;
        }
    }
}