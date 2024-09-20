package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddPngMallStaffPageQueryResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("mall_staff_page_query_response")
    private MallStaffPageQueryResponse mallStaffPageQueryResponse;

    public MallStaffPageQueryResponse getMallStaffPageQueryResponse() {
        return mallStaffPageQueryResponse;
    }

    public static class MallStaffPageQueryResponse {

        /**
         * 
         */
        @JsonProperty("data")
        private List<MallStaffPageQueryResponseDataItem> data;

        /**
         * 
         */
        @JsonProperty("has_more")
        private Boolean hasMore;

        /**
         * 
         */
        @JsonProperty("last_id")
        private Long lastId;

        public List<MallStaffPageQueryResponseDataItem> getData() {
            return data;
        }

        public Boolean getHasMore() {
            return hasMore;
        }

        public Long getLastId() {
            return lastId;
        }
    }

    public static class MallStaffPageQueryResponseDataItem {

        /**
         * 
         */
        @JsonProperty("phone")
        private String phone;

        /**
         * 
         */
        @JsonProperty("staff_id")
        private Long staffId;

        public String getPhone() {
            return phone;
        }

        public Long getStaffId() {
            return staffId;
        }
    }
}