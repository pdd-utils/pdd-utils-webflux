package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkOauthGoodsPidGenerateResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("p_id_generate_response")
    private PIdGenerateResponse pIdGenerateResponse;

    public PIdGenerateResponse getPIdGenerateResponse() {
        return pIdGenerateResponse;
    }

    public static class PIdGenerateResponse {

        /**
         * 多多进宝推广位对象列表
         */
        @JsonProperty("p_id_list")
        private List<PIdGenerateResponsePIdListItem> pIdList;

        /**
         * PID剩余数量
         */
        @JsonProperty("remain_pid_count")
        private Integer remainPidCount;

        public List<PIdGenerateResponsePIdListItem> getPIdList() {
            return pIdList;
        }

        public Integer getRemainPidCount() {
            return remainPidCount;
        }
    }

    public static class PIdGenerateResponsePIdListItem {

        /**
         * 推广位创建时间
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
         * 调用方推广位ID
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