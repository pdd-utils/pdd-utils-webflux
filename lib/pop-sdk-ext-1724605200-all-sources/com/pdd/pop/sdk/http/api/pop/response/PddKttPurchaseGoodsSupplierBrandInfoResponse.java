package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttPurchaseGoodsSupplierBrandInfoResponse extends PopBaseHttpResponse {

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
         * 
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 
         */
        @JsonProperty("result")
        private ResponseResult result;

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public ResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseResult {

        /**
         * 品牌列表
         */
        @JsonProperty("brand_list")
        private List<ResponseResultBrandListItem> brandList;

        public List<ResponseResultBrandListItem> getBrandList() {
            return brandList;
        }
    }

    public static class ResponseResultBrandListItem {

        /**
         * 品牌Logo
         */
        @JsonProperty("brand_logo")
        private String brandLogo;

        /**
         * 品牌名
         */
        @JsonProperty("brand_name")
        private String brandName;

        /**
         * 品牌唯一ID
         */
        @JsonProperty("brand_sn")
        private String brandSn;

        public String getBrandLogo() {
            return brandLogo;
        }

        public String getBrandName() {
            return brandName;
        }

        public String getBrandSn() {
            return brandSn;
        }
    }
}