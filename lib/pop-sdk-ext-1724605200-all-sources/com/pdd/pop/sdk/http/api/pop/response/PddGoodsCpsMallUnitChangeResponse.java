package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsCpsMallUnitChangeResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_cps_mall_unit_change_response")
    private GoodsCpsMallUnitChangeResponse goodsCpsMallUnitChangeResponse;

    public GoodsCpsMallUnitChangeResponse getGoodsCpsMallUnitChangeResponse() {
        return goodsCpsMallUnitChangeResponse;
    }

    public static class GoodsCpsMallUnitChangeResponse {

        /**
         * 是否成功
         */
        @JsonProperty("result")
        private Boolean result;

        public Boolean getResult() {
            return result;
        }
    }
}