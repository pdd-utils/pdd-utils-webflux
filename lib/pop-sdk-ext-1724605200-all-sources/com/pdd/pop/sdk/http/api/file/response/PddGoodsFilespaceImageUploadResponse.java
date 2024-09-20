package com.pdd.pop.sdk.http.api.file.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsFilespaceImageUploadResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_filespace_image_upload_response")
    private GoodsFilespaceImageUploadResponse goodsFilespaceImageUploadResponse;

    public GoodsFilespaceImageUploadResponse getGoodsFilespaceImageUploadResponse() {
        return goodsFilespaceImageUploadResponse;
    }

    public static class GoodsFilespaceImageUploadResponse {

        /**
         * 文件id
         */
        @JsonProperty("file_id")
        private Long fileId;

        /**
         * url
         */
        @JsonProperty("url")
        private String url;

        public Long getFileId() {
            return fileId;
        }

        public String getUrl() {
            return url;
        }
    }
}