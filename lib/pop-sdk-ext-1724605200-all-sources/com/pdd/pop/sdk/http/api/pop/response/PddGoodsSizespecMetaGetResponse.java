package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGoodsSizespecMetaGetResponse extends PopBaseHttpResponse {

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
         * 错误消息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 结果
         */
        @JsonProperty("result")
        private ResponseResult result;

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

        public ResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseResult {

        /**
         * 可批量的尺码元素id
         */
        @JsonProperty("batchable_element_ids")
        private List<Integer> batchableElementIds;

        /**
         * 尺码元素
         */
        @JsonProperty("elements")
        private List<ResponseResultElementsItem> elements;

        /**
         * 尺码组
         */
        @JsonProperty("groups")
        private List<ResponseResultGroupsItem> groups;

        public List<Integer> getBatchableElementIds() {
            return batchableElementIds;
        }

        public List<ResponseResultElementsItem> getElements() {
            return elements;
        }

        public List<ResponseResultGroupsItem> getGroups() {
            return groups;
        }
    }

    public static class ResponseResultElementsItem {

        /**
         * 尺码元数据id
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 尺码元数据名称
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

    public static class ResponseResultGroupsItem {

        /**
         * 尺码元数据id
         */
        @JsonProperty("id")
        private Integer id;

        /**
         * 尺码元数据名称
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