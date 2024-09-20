package com.pdd.pop.sdk.http.api.file.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsImgUploadResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("goods_img_upload_response")
    private GoodsImgUploadResponse goodsImgUploadResponse;

    public GoodsImgUploadResponse getGoodsImgUploadResponse() {
        return goodsImgUploadResponse;
    }

    public static class GoodsImgUploadResponse {

        /**
         * 
         */
        @JsonProperty("url")
        private String url;

        public String getUrl() {
            return url;
        }
    }
}