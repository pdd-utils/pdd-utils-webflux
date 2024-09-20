package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddGoodsCpsUnitDeleteResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("goods_cps_unit_delete_response")
    private GoodsCpsUnitDeleteResponse goodsCpsUnitDeleteResponse;

    public GoodsCpsUnitDeleteResponse getGoodsCpsUnitDeleteResponse() {
        return goodsCpsUnitDeleteResponse;
    }

    public static class GoodsCpsUnitDeleteResponse {

        /**
         * 是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        public Boolean getSuccess() {
            return success;
        }
    }
}