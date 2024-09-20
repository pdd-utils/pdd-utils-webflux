package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddPromotionLimitedActivityCreateResponse extends PopBaseHttpResponse {

    /**
     * 结果列表
     */
    @JsonProperty("result_list")
    private List<ResultListItem> resultList;

    public List<ResultListItem> getResultList() {
        return resultList;
    }

    public static class ResultListItem {

        /**
         * 创建失败时的失败原因
         */
        @JsonProperty("fail_reason")
        private String failReason;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private String goodsId;

        /**
         * 商品是否创建成功。0代表成功，非0代表失败
         */
        @JsonProperty("status")
        private Integer status;

        public String getFailReason() {
            return failReason;
        }

        public String getGoodsId() {
            return goodsId;
        }

        public Integer getStatus() {
            return status;
        }
    }
}