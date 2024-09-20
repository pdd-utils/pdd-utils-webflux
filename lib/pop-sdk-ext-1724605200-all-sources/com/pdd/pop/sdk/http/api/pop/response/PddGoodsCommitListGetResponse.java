package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsCommitListGetResponse extends PopBaseHttpResponse {

    /**
     * res
     */
    @JsonProperty("goods_commit_list_get_response")
    private GoodsCommitListGetResponse goodsCommitListGetResponse;

    public GoodsCommitListGetResponse getGoodsCommitListGetResponse() {
        return goodsCommitListGetResponse;
    }

    public static class GoodsCommitListGetResponse {

        /**
         * list
         */
        @JsonProperty("list")
        private List<GoodsCommitListGetResponseListItem> list;

        /**
         * total
         */
        @JsonProperty("total")
        private Long total;

        public List<GoodsCommitListGetResponseListItem> getList() {
            return list;
        }

        public Long getTotal() {
            return total;
        }
    }

    public static class GoodsCommitListGetResponseListItem {

        /**
         * 审核时间
         */
        @JsonProperty("checked_time")
        private Integer checkedTime;

        /**
         * 草稿状态 0:编辑中,1:审核中,2:审核通过,3:审核驳回
         */
        @JsonProperty("check_status")
        private Integer checkStatus;

        /**
         * 草稿id
         */
        @JsonProperty("commit_id")
        private Long commitId;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 商品标题
         */
        @JsonProperty("goods_name")
        private String goodsName;

        /**
         * 是否新增 0:新增，1：修改
         */
        @JsonProperty("is_shop")
        private Integer isShop;

        /**
         * 商家编码
         */
        @JsonProperty("outer_goods_id")
        private String outerGoodsId;

        /**
         * 驳回原因
         */
        @JsonProperty("reject_comment")
        private String rejectComment;

        /**
         * 提交时间
         */
        @JsonProperty("submit_time")
        private Integer submitTime;

        public Integer getCheckedTime() {
            return checkedTime;
        }

        public Integer getCheckStatus() {
            return checkStatus;
        }

        public Long getCommitId() {
            return commitId;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public Integer getIsShop() {
            return isShop;
        }

        public String getOuterGoodsId() {
            return outerGoodsId;
        }

        public String getRejectComment() {
            return rejectComment;
        }

        public Integer getSubmitTime() {
            return submitTime;
        }
    }
}