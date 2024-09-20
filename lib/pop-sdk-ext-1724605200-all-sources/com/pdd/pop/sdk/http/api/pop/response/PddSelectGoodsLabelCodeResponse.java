package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddSelectGoodsLabelCodeResponse extends PopBaseHttpResponse {

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
         * 跨境货品skcId
         */
        @JsonProperty("bg_prod_skc_id")
        private Long bgProdSkcId;

        /**
         * 跨境货品skuId
         */
        @JsonProperty("bg_prod_sku_id")
        private Long bgProdSkuId;

        /**
         * 服饰类商品主属性，非服饰类商品为空
         */
        @JsonProperty("clothes_spec")
        private String clothesSpec;

        /**
         * 是否服饰类商品
         */
        @JsonProperty("is_clothes")
        private Boolean isClothes;

        /**
         * 标签条码
         */
        @JsonProperty("label_code")
        private Long labelCode;

        /**
         * 产地
         */
        @JsonProperty("made_in")
        private String madeIn;

        /**
         * 销售属性
         */
        @JsonProperty("spec")
        private String spec;

        public Long getBgProdSkcId() {
            return bgProdSkcId;
        }

        public Long getBgProdSkuId() {
            return bgProdSkuId;
        }

        public String getClothesSpec() {
            return clothesSpec;
        }

        public Boolean getIsClothes() {
            return isClothes;
        }

        public Long getLabelCode() {
            return labelCode;
        }

        public String getMadeIn() {
            return madeIn;
        }

        public String getSpec() {
            return spec;
        }
    }
}