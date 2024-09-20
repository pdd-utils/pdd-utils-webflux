package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddServiceMailCheckWeightInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddServiceMailCheckWeightInfoRequest extends PopBaseHttpRequest<PddServiceMailCheckWeightInfoResponse> {

    /**
     * 请求参数
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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.service.mail.check.weight.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddServiceMailCheckWeightInfoResponse> getResponseClass() {
        return PddServiceMailCheckWeightInfoResponse.class;
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
         * 物流环节首发或到达省中心称重，单位克
         */
        @JsonProperty("centerWeight")
        private Integer centerWeight;

        /**
         * 结算重量，单位克
         */
        @JsonProperty("checkWeight")
        private Integer checkWeight;

        /**
         * 快递公司编码
         */
        @JsonProperty("expressCode")
        private String expressCode;

        /**
         * 是否使用抛重
         */
        @JsonProperty("isUseVolumetric")
        private Boolean isUseVolumetric;

        /**
         * 运单号
         */
        @JsonProperty("mailNo")
        private String mailNo;

        /**
         * 抛重体积
         */
        @JsonProperty("volume")
        private Integer volume;

        public void setCenterWeight(Integer centerWeight) {
            this.centerWeight = centerWeight;
        }

        public void setCheckWeight(Integer checkWeight) {
            this.checkWeight = checkWeight;
        }

        public void setExpressCode(String expressCode) {
            this.expressCode = expressCode;
        }

        public void setIsUseVolumetric(Boolean isUseVolumetric) {
            this.isUseVolumetric = isUseVolumetric;
        }

        public void setMailNo(String mailNo) {
            this.mailNo = mailNo;
        }

        public void setVolume(Integer volume) {
            this.volume = volume;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}