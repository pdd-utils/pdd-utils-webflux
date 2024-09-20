package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsCommitStatusGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_commit_status_get_response")
    private GoodsCommitStatusGetResponse goodsCommitStatusGetResponse;

    public GoodsCommitStatusGetResponse getGoodsCommitStatusGetResponse() {
        return goodsCommitStatusGetResponse;
    }

    public static class GoodsCommitStatusGetResponse {

        /**
         * list
         */
        @JsonProperty("list")
        private List<GoodsCommitStatusGetResponseListItem> list;

        public List<GoodsCommitStatusGetResponseListItem> getList() {
            return list;
        }
    }

    public static class GoodsCommitStatusGetResponseListItem {

        /**
         * 状态
         */
        @JsonProperty("check_status")
        private Integer checkStatus;

        /**
         * 草稿id
         */
        @JsonProperty("goods_commit_id")
        private Long goodsCommitId;

        /**
         * 驳回原因
         */
        @JsonProperty("reject_comment")
        private String rejectComment;

        public Integer getCheckStatus() {
            return checkStatus;
        }

        public Long getGoodsCommitId() {
            return goodsCommitId;
        }

        public String getRejectComment() {
            return rejectComment;
        }
    }
}