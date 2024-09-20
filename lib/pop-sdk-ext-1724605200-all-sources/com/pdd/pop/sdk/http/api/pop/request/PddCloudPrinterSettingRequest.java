package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudPrinterSettingResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudPrinterSettingRequest extends PopBaseHttpRequest<PddCloudPrinterSettingResponse> {

    /**
     * 开平请求基类
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
        return "pdd.cloud.printer.setting";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudPrinterSettingResponse> getResponseClass() {
        return PddCloudPrinterSettingResponse.class;
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
         * 打印浓度（1-淡，2-正常，3-浓）
         */
        @JsonProperty("density")
        private Integer density;

        /**
         * 打印机标识
         */
        @JsonProperty("printer_id")
        private String printerId;

        /**
         * 共享码
         */
        @JsonProperty("share_code")
        private String shareCode;

        public void setDensity(Integer density) {
            this.density = density;
        }

        public void setPrinterId(String printerId) {
            this.printerId = printerId;
        }

        public void setShareCode(String shareCode) {
            this.shareCode = shareCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}