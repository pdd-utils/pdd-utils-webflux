package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudprintCustomaresGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_cloudprint_customares_get_response")
    private InnerPddCloudprintCustomaresGetResponse pddCloudprintCustomaresGetResponse;

    public InnerPddCloudprintCustomaresGetResponse getPddCloudprintCustomaresGetResponse() {
        return pddCloudprintCustomaresGetResponse;
    }

    public static class InnerPddCloudprintCustomaresGetResponse {

        /**
         * result
         */
        @JsonProperty("result")
        private InnerPddCloudprintCustomaresGetResponseResult result;

        public InnerPddCloudprintCustomaresGetResponseResult getResult() {
            return result;
        }
    }

    public static class InnerPddCloudprintCustomaresGetResponseResult {

        /**
         * datas
         */
        @JsonProperty("datas")
        private List<InnerPddCloudprintCustomaresGetResponseResultDatasItem> datas;

        public List<InnerPddCloudprintCustomaresGetResponseResultDatasItem> getDatas() {
            return datas;
        }
    }

    public static class InnerPddCloudprintCustomaresGetResponseResultDatasItem {

        /**
         * custom_area_id
         */
        @JsonProperty("custom_area_id")
        private Long customAreaId;

        /**
         * custom_area_name
         */
        @JsonProperty("custom_area_name")
        private String customAreaName;

        /**
         * custom_area_url
         */
        @JsonProperty("custom_area_url")
        private String customAreaUrl;

        /**
         * keys
         */
        @JsonProperty("keys")
        private List<InnerPddCloudprintCustomaresGetResponseResultDatasItemKeysItem> keys;

        public Long getCustomAreaId() {
            return customAreaId;
        }

        public String getCustomAreaName() {
            return customAreaName;
        }

        public String getCustomAreaUrl() {
            return customAreaUrl;
        }

        public List<InnerPddCloudprintCustomaresGetResponseResultDatasItemKeysItem> getKeys() {
            return keys;
        }
    }

    public static class InnerPddCloudprintCustomaresGetResponseResultDatasItemKeysItem {
    }
}