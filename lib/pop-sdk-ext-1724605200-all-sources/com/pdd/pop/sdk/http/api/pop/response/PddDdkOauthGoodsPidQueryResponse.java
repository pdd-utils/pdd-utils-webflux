package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkOauthGoodsPidQueryResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("p_id_query_response")
    private PIdQueryResponse pIdQueryResponse;

    public PIdQueryResponse getPIdQueryResponse() {
        return pIdQueryResponse;
    }

    public static class PIdQueryResponse {

        /**
         * 多多进宝推广位对象列表
         */
        @JsonProperty("p_id_list")
        private List<PIdQueryResponsePIdListItem> pIdList;

        /**
         * 返回推广位总数
         */
        @JsonProperty("total_count")
        private Long totalCount;

        public List<PIdQueryResponsePIdListItem> getPIdList() {
            return pIdList;
        }

        public Long getTotalCount() {
            return totalCount;
        }
    }

    public static class PIdQueryResponsePIdListItem {

        /**
         * 推广位生成时间
         */
        @JsonProperty("create_time")
        private Long createTime;

        /**
         * 媒体id
         */
        @JsonProperty("media_id")
        private Long mediaId;

        /**
         * 推广位名称
         */
        @JsonProperty("pid_name")
        private String pidName;

        /**
         * 推广位ID
         */
        @JsonProperty("p_id")
        private String pId;

        public Long getCreateTime() {
            return createTime;
        }

        public Long getMediaId() {
            return mediaId;
        }

        public String getPidName() {
            return pidName;
        }

        public String getPId() {
            return pId;
        }
    }
}