package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddTicketGoodsUploadResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("goods_upload_response")
    private GoodsUploadResponse goodsUploadResponse;

    public GoodsUploadResponse getGoodsUploadResponse() {
        return goodsUploadResponse;
    }

    public static class GoodsUploadResponse {

        /**
         * 草稿id
         */
        @JsonProperty("goods_commit_id")
        private Long goodsCommitId;

        /**
         * 商品id
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        public Long getGoodsCommitId() {
            return goodsCommitId;
        }

        public Long getGoodsId() {
            return goodsId;
        }
    }
}