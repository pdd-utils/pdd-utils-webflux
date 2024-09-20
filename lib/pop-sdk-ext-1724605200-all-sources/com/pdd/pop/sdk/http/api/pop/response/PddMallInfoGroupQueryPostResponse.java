package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddMallInfoGroupQueryPostResponse extends PopBaseHttpResponse {

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
        @JsonProperty("mall_store_group_list")
        private List<ResponseMallStoreGroupListItem> mallStoreGroupList;

        /**
         * 总数
         */
        @JsonProperty("total")
        private Integer total;

        public List<ResponseMallStoreGroupListItem> getMallStoreGroupList() {
            return mallStoreGroupList;
        }

        public Integer getTotal() {
            return total;
        }
    }

    public static class ResponseMallStoreGroupListItem {

        /**
         * 
         */
        @JsonProperty("group_id")
        private Integer groupId;

        /**
         * 
         */
        @JsonProperty("group_name")
        private String groupName;

        /**
         * 
         */
        @JsonProperty("mall_id")
        private Long mallId;

        public Integer getGroupId() {
            return groupId;
        }

        public String getGroupName() {
            return groupName;
        }

        public Long getMallId() {
            return mallId;
        }
    }
}