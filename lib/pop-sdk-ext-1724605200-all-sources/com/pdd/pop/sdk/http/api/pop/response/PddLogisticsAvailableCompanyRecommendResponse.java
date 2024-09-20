package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsAvailableCompanyRecommendResponse extends PopBaseHttpResponse {

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
        @JsonProperty("result")
        private List<ResponseResultItem> result;

        public List<ResponseResultItem> getResult() {
            return result;
        }
    }

    public static class ResponseResultItem {

        /**
         * 收件人市id
         */
        @JsonProperty("city_id")
        private Long cityId;

        /**
         * 快递公司id
         */
        @JsonProperty("company_id")
        private List<Long> companyId;

        public Long getCityId() {
            return cityId;
        }

        public List<Long> getCompanyId() {
            return companyId;
        }
    }
}