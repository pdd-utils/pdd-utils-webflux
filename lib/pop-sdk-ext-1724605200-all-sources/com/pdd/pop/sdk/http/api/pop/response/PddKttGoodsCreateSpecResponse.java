package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;

import java.util.Map;


public class PddKttGoodsCreateSpecResponse extends PopBaseHttpResponse {

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
         * 规格map
         */
        @JsonProperty("spec_map")
        private Map<String, List<ResponseSpecMapValueItem>> specMap;

        /**
         * 请求结果
         */
        @JsonProperty("success")
        private Boolean success;

        public Map<String, List<ResponseSpecMapValueItem>> getSpecMap() {
            return specMap;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseSpecMapValueItem {

        /**
         * 子规格名
         */
        @JsonProperty("name")
        private String name;

        /**
         * 父规格名
         */
        @JsonProperty("parent_name")
        private String parentName;

        /**
         * 规格id，创建商品用
         */
        @JsonProperty("spec_id")
        private Long specId;

        public String getName() {
            return name;
        }

        public String getParentName() {
            return parentName;
        }

        public Long getSpecId() {
            return specId;
        }
    }
}