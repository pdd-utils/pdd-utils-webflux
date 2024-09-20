package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddKttPurchaseGoodsCatInfoResponse extends PopBaseHttpResponse {

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
         * 商品类目列表
         */
        @JsonProperty("category_list")
        private List<ResponseResultCategoryListItem> categoryList;

        public List<ResponseResultCategoryListItem> getCategoryList() {
            return categoryList;
        }
    }

    public static class ResponseResultCategoryListItem {

        /**
         * 类目ID
         */
        @JsonProperty("category_id")
        private Integer categoryId;

        /**
         * 类目名称
         */
        @JsonProperty("category_name")
        private String categoryName;

        /**
         * 关联预设商品属性
         */
        @JsonProperty("goods_property_list")
        private List<ResponseResultCategoryListItemGoodsPropertyListItem> goodsPropertyList;

        /**
         * 商品属性备注
         */
        @JsonProperty("remark")
        private String remark;

        public Integer getCategoryId() {
            return categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public List<ResponseResultCategoryListItemGoodsPropertyListItem> getGoodsPropertyList() {
            return goodsPropertyList;
        }

        public String getRemark() {
            return remark;
        }
    }

    public static class ResponseResultCategoryListItemGoodsPropertyListItem {

        /**
         * 是否必填
         */
        @JsonProperty("is_required")
        private Boolean isRequired;

        /**
         * 属性名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 属性值
         */
        @JsonProperty("values")
        private List<String> values;

        public Boolean getIsRequired() {
            return isRequired;
        }

        public String getName() {
            return name;
        }

        public List<String> getValues() {
            return values;
        }
    }
}