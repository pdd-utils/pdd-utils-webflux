package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddTicketAreacodeGetResponse extends PopBaseHttpResponse {

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
        @JsonProperty("area_list")
        private List<ResponseAreaListItem> areaList;

        public List<ResponseAreaListItem> getAreaList() {
            return areaList;
        }
    }

    public static class ResponseAreaListItem {

        /**
         * 
         */
        @JsonProperty("code")
        private Integer code;

        /**
         * 
         */
        @JsonProperty("level")
        private Integer level;

        /**
         * 
         */
        @JsonProperty("name")
        private String name;

        /**
         * 
         */
        @JsonProperty("parent_code")
        private Integer parentCode;

        public Integer getCode() {
            return code;
        }

        public Integer getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

        public Integer getParentCode() {
            return parentCode;
        }
    }
}