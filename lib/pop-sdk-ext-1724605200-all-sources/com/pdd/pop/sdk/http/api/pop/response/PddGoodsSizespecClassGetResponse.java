package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsSizespecClassGetResponse extends PopBaseHttpResponse {

    /**
     * 响应
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误描述
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 结果
         */
        @JsonProperty("result")
        private List<ResponseResultItem> result;

        /**
         * 请求成功
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public List<ResponseResultItem> getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseResultItem {

        /**
         * 尺码表叶分类（二级分类）
         */
        @JsonProperty("children")
        private List<ResponseResultItemChildrenItem> children;

        /**
         * 尺码表分类id
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 尺码表分类名称
         */
        @JsonProperty("name")
        private String name;

        public List<ResponseResultItemChildrenItem> getChildren() {
            return children;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    public static class ResponseResultItemChildrenItem {

        /**
         * 尺码表分类id
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 尺码表分类名称
         */
        @JsonProperty("name")
        private String name;

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}