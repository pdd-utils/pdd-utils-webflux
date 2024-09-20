package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsGetRelationResponse extends PopBaseHttpResponse {

    /**
     * 映射关系查询返回对象列表
     */
    @JsonProperty("query_goods_relation_response")
    private List<QueryGoodsRelationResponseItem> queryGoodsRelationResponse;

    public List<QueryGoodsRelationResponseItem> getQueryGoodsRelationResponse() {
        return queryGoodsRelationResponse;
    }

    public static class QueryGoodsRelationResponseItem {

        /**
         * 外部平台商品id
         */
        @JsonProperty("out_goods_id")
        private String outGoodsId;

        /**
         * 拼多多商品id
         */
        @JsonProperty("pdd_goods_id")
        private Long pddGoodsId;

        public String getOutGoodsId() {
            return outGoodsId;
        }

        public Long getPddGoodsId() {
            return pddGoodsId;
        }
    }
}