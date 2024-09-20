package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsCpsMallUnitQueryResponse extends PopBaseHttpResponse {

    /**
     * respone
     */
    @JsonProperty("goods_cps_mall_unit_query_response")
    private GoodsCpsMallUnitQueryResponse goodsCpsMallUnitQueryResponse;

    public GoodsCpsMallUnitQueryResponse getGoodsCpsMallUnitQueryResponse() {
        return goodsCpsMallUnitQueryResponse;
    }

    public static class GoodsCpsMallUnitQueryResponse {

        /**
         * 全店推广计划佣金比（千分比）
         */
        @JsonProperty("rate")
        private Integer rate;

        /**
         * 修改后生效的佣金费率（千分比）
         */
        @JsonProperty("rate_to_be")
        private Integer rateToBe;

        /**
         * 全店推广计划佣金生效时间
         */
        @JsonProperty("rate_to_be_day")
        private String rateToBeDay;

        /**
         * 全店推广计划状态：1-推广中，2-暂停推广
         */
        @JsonProperty("status")
        private Integer status;

        /**
         * 修改后生效的状态，1-推广中，2-暂停，3-删除
         */
        @JsonProperty("status_to_be")
        private Integer statusToBe;

        /**
         * 全店推广计划状态生效时间
         */
        @JsonProperty("status_to_be_day")
        private String statusToBeDay;

        public Integer getRate() {
            return rate;
        }

        public Integer getRateToBe() {
            return rateToBe;
        }

        public String getRateToBeDay() {
            return rateToBeDay;
        }

        public Integer getStatus() {
            return status;
        }

        public Integer getStatusToBe() {
            return statusToBe;
        }

        public String getStatusToBeDay() {
            return statusToBeDay;
        }
    }
}