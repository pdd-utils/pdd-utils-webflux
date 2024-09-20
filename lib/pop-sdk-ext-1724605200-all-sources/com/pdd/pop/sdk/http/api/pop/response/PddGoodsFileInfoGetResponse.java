package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsFileInfoGetResponse extends PopBaseHttpResponse {

    /**
     * goods_file_info_response
     */
    @JsonProperty("goods_file_info_response")
    private GoodsFileInfoResponse goodsFileInfoResponse;

    public GoodsFileInfoResponse getGoodsFileInfoResponse() {
        return goodsFileInfoResponse;
    }

    public static class GoodsFileInfoResponse {

        /**
         * 
         */
        @JsonProperty("list")
        private List<GoodsFileInfoResponseListItem> list;

        public List<GoodsFileInfoResponseListItem> getList() {
            return list;
        }
    }

    public static class GoodsFileInfoResponseListItem {

        /**
         * 文件id
         */
        @JsonProperty("file_id")
        private Long fileId;

        /**
         * 文件状态(-2:上传失败,-1:转码失败,0:转码中,1:审核中,2:审核通过,3:审核驳回)
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 文件链接
         */
        @JsonProperty("url")
        private String url;

        public Long getFileId() {
            return fileId;
        }

        public Integer getStatus() {
            return status;
        }

        public String getUrl() {
            return url;
        }
    }
}