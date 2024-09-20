package com.pdd.pop.sdk.http.api.file.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsVideoUploadResponse extends PopBaseHttpResponse {

    /**
     * 1
     */
    @JsonProperty("goods_video_upload_response")
    private GoodsVideoUploadResponse goodsVideoUploadResponse;

    public GoodsVideoUploadResponse getGoodsVideoUploadResponse() {
        return goodsVideoUploadResponse;
    }

    public static class GoodsVideoUploadResponse {

        /**
         * 文件id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 文件url
         */
        @JsonProperty("url")
        private String url;

        /**
         * 审核状态
         */
        @JsonProperty("status")
        private Integer status;

        public Long getId() {
            return id;
        }

        public String getUrl() {
            return url;
        }

        public Integer getStatus() {
            return status;
        }
    }
}