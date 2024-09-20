package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddTicketScenicGetResponse extends PopBaseHttpResponse {

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
         * 纬度
         */
        @JsonProperty("latitude")
        private Double latitude;

        /**
         * 定位类型 1.百度 2.google
         */
        @JsonProperty("location_type")
        private Integer locationType;

        /**
         * 经度
         */
        @JsonProperty("longitude")
        private Double longitude;

        /**
         * 拼多多景区编码
         */
        @JsonProperty("scenic_id")
        private Long scenicId;

        /**
         * 拼多多景区名称
         */
        @JsonProperty("scenic_name")
        private String scenicName;

        public Double getLatitude() {
            return latitude;
        }

        public Integer getLocationType() {
            return locationType;
        }

        public Double getLongitude() {
            return longitude;
        }

        public Long getScenicId() {
            return scenicId;
        }

        public String getScenicName() {
            return scenicName;
        }
    }
}