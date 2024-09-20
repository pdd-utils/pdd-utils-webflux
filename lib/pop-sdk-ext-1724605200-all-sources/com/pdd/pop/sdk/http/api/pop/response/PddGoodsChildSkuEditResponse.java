package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsChildSkuEditResponse extends PopBaseHttpResponse {

    /**
     * 子sku新增或提交结果
     */
    @JsonProperty("child_sku_edit_response")
    private ChildSkuEditResponse childSkuEditResponse;

    public ChildSkuEditResponse getChildSkuEditResponse() {
        return childSkuEditResponse;
    }

    public static class ChildSkuEditResponse {

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