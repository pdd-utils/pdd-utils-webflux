package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsLatestCommitStatusGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_latest_commit_status_get_response")
    private GoodsLatestCommitStatusGetResponse goodsLatestCommitStatusGetResponse;

    public GoodsLatestCommitStatusGetResponse getGoodsLatestCommitStatusGetResponse() {
        return goodsLatestCommitStatusGetResponse;
    }

    public static class GoodsLatestCommitStatusGetResponse {

        /**
         * list
         */
        @JsonProperty("list")
        private List<GoodsLatestCommitStatusGetResponseListItem> list;

        public List<GoodsLatestCommitStatusGetResponseListItem> getList() {
            return list;
        }
    }

    public static class GoodsLatestCommitStatusGetResponseListItem {

        /**
         * 草稿状态
         */
        @JsonProperty("check_status")
        private Integer checkStatus;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 驳回原因
         */
        @JsonProperty("reject_comment")
        private String rejectComment;

        public Integer getCheckStatus() {
            return checkStatus;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getRejectComment() {
            return rejectComment;
        }
    }
}