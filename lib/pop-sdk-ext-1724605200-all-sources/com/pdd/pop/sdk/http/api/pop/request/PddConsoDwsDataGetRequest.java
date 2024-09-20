package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddConsoDwsDataGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddConsoDwsDataGetRequest extends PopBaseHttpRequest<PddConsoDwsDataGetResponse> {

    /**
     * 获取DWS数据请求参数
     */
    @JsonProperty("request")
    private Request request;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.conso.dws.data.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddConsoDwsDataGetResponse> getResponseClass() {
        return PddConsoDwsDataGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * 设备id
         */
        @JsonProperty("equipmentId")
        private String equipmentId;

        /**
         * 设备供应商
         */
        @JsonProperty("equipmentSupplier")
        private String equipmentSupplier;

        /**
         * 体积-高(单位：cm)
         */
        @JsonProperty("height")
        private String height;

        /**
         * 体积-长(单位：cm)
         */
        @JsonProperty("length")
        private String length;

        /**
         * 扫描时间戳(毫秒)
         */
        @JsonProperty("scanTime")
        private Long scanTime;

        /**
         * 运单号
         */
        @JsonProperty("trckNo")
        private String trckNo;

        /**
         * 体积(单位：cm^3)
         */
        @JsonProperty("volume")
        private String volume;

        /**
         * 体积重
         */
        @JsonProperty("volumeWeight")
        private String volumeWeight;

        /**
         * 称重重量(单位：g)
         */
        @JsonProperty("weight")
        private String weight;

        /**
         * 体积-宽(单位：cm)
         */
        @JsonProperty("width")
        private String width;

        /**
         * 图片链接列表
         */
        @JsonProperty("images")
        private List<String> images;

        public void setEquipmentId(String equipmentId) {
            this.equipmentId = equipmentId;
        }

        public void setEquipmentSupplier(String equipmentSupplier) {
            this.equipmentSupplier = equipmentSupplier;
        }

        public void setHeight(String height) {
            this.height = height;
        }

        public void setLength(String length) {
            this.length = length;
        }

        public void setScanTime(Long scanTime) {
            this.scanTime = scanTime;
        }

        public void setTrckNo(String trckNo) {
            this.trckNo = trckNo;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }

        public void setVolumeWeight(String volumeWeight) {
            this.volumeWeight = volumeWeight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public void setWidth(String width) {
            this.width = width;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}