package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOverseaUploadGoodsIdListResponse extends PopBaseHttpResponse {

    /**
     * 返回结果
     */
    @JsonProperty("upload_goods_id_response")
    private UploadGoodsIdResponse uploadGoodsIdResponse;

    public UploadGoodsIdResponse getUploadGoodsIdResponse() {
        return uploadGoodsIdResponse;
    }

    public static class UploadGoodsIdResponse {

        /**
         * 处理异常的商品ID数量
         */
        @JsonProperty("abnormal_count")
        private Integer abnormalCount;

        /**
         * 异常结果列表, 存在异常的情况会返回非空，否则返回空列表
         */
        @JsonProperty("abnormal_result_list")
        private List<UploadGoodsIdResponseAbnormalResultListItem> abnormalResultList;

        /**
         * 处理成功的商品ID数量
         */
        @JsonProperty("success_count")
        private Integer successCount;

        public Integer getAbnormalCount() {
            return abnormalCount;
        }

        public List<UploadGoodsIdResponseAbnormalResultListItem> getAbnormalResultList() {
            return abnormalResultList;
        }

        public Integer getSuccessCount() {
            return successCount;
        }
    }

    public static class UploadGoodsIdResponseAbnormalResultListItem {

        /**
         * 异常原因
         */
        @JsonProperty("abnormal_reason")
        private String abnormalReason;

        /**
         * 异常的商品ID
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        public String getAbnormalReason() {
            return abnormalReason;
        }

        public Long getGoodsId() {
            return goodsId;
        }
    }
}