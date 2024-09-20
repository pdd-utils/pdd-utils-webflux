package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddGooodsSkuMeasurementListResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("gooods_sku_measurement_list_response")
    private GooodsSkuMeasurementListResponse gooodsSkuMeasurementListResponse;

    public GooodsSkuMeasurementListResponse getGooodsSkuMeasurementListResponse() {
        return gooodsSkuMeasurementListResponse;
    }

    public static class GooodsSkuMeasurementListResponse {

        /**
         * 列表
         */
        @JsonProperty("measurement_list")
        private List<GooodsSkuMeasurementListResponseMeasurementListItem> measurementList;

        public List<GooodsSkuMeasurementListResponseMeasurementListItem> getMeasurementList() {
            return measurementList;
        }
    }

    public static class GooodsSkuMeasurementListResponseMeasurementListItem {

        /**
         * 编码
         */
        @JsonProperty("code")
        private String code;

        /**
         * 说明
         */
        @JsonProperty("desc")
        private String desc;

        public String getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }
    }
}