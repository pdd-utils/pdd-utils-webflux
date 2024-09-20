package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddServicemarketContractSearchResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("servicemarket_contract_search_response")
    private ServicemarketContractSearchResponse servicemarketContractSearchResponse;

    public ServicemarketContractSearchResponse getServicemarketContractSearchResponse() {
        return servicemarketContractSearchResponse;
    }

    public static class ServicemarketContractSearchResponse {

        /**
         * 授权结束时间
         */
        @JsonProperty("endAt")
        private Long endAt;

        /**
         * 订单号列表
         */
        @JsonProperty("orderSns")
        private List<String> orderSns;

        /**
         * 
         */
        @JsonProperty("specValue")
        private ServicemarketContractSearchResponseSpecValue specValue;

        /**
         * 授权开始时间
         */
        @JsonProperty("startAt")
        private Long startAt;

        public Long getEndAt() {
            return endAt;
        }

        public List<String> getOrderSns() {
            return orderSns;
        }

        public ServicemarketContractSearchResponseSpecValue getSpecValue() {
            return specValue;
        }

        public Long getStartAt() {
            return startAt;
        }
    }

    public static class ServicemarketContractSearchResponseSpecValue {

        /**
         * 
         */
        @JsonProperty("specValueList")
        private List<ServicemarketContractSearchResponseSpecValueSpecValueListItem> specValueList;

        public List<ServicemarketContractSearchResponseSpecValueSpecValueListItem> getSpecValueList() {
            return specValueList;
        }
    }

    public static class ServicemarketContractSearchResponseSpecValueSpecValueListItem {

        /**
         * 规格值id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 规格名称
         */
        @JsonProperty("specName")
        private String specName;

        /**
         * 规格值名称
         */
        @JsonProperty("specValue")
        private String specValue;

        /**
         * 规格时长参数
         */
        @JsonProperty("timeLengthValue")
        private Long timeLengthValue;

        public Long getId() {
            return id;
        }

        public String getSpecName() {
            return specName;
        }

        public String getSpecValue() {
            return specValue;
        }

        public Long getTimeLengthValue() {
            return timeLengthValue;
        }
    }
}