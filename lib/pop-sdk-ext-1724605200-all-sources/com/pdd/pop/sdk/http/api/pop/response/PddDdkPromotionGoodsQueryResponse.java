package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddDdkPromotionGoodsQueryResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 报备记录列表
         */
        @JsonProperty("application_list")
        private List<ResponseApplicationListItem> applicationList;

        /**
         * 报备记录总数
         */
        @JsonProperty("total")
        private Integer total;

        public List<ResponseApplicationListItem> getApplicationList() {
            return applicationList;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class ResponseApplicationListItem {

        /**
         * 审核信息
         */
        @JsonProperty("comment")
        private String comment;

        /**
         * 报备提交时间
         */
        @JsonProperty("commit_time")
        private Long commitTime;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 店铺id
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 推广结束时间
         */
        @JsonProperty("promotion_end_time")
        private Long promotionEndTime;

        /**
         * 推广开始时间
         */
        @JsonProperty("promotion_start_time")
        private Long promotionStartTime;

        /**
         * 报备状态。0-已创建，1-已提交，2-已通过，3-已驳回
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 最后更新时间
         */
        @JsonProperty("updated_at")
        private Long updatedAt;

        public String getComment() {
            return comment;
        }

        public Long getCommitTime() {
            return commitTime;
        }

        public Long getGoodsId() {
            return goodsId;
        }

        public Long getMallId() {
            return mallId;
        }

        public Long getPromotionEndTime() {
            return promotionEndTime;
        }

        public Long getPromotionStartTime() {
            return promotionStartTime;
        }

        public Integer getStatus() {
            return status;
        }

        public Long getUpdatedAt() {
            return updatedAt;
        }
    }
}