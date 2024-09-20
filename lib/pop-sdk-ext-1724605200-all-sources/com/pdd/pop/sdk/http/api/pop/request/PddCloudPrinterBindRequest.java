package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudPrinterBindResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudPrinterBindRequest extends PopBaseHttpRequest<PddCloudPrinterBindResponse> {

    /**
     * 云打印绑定请求
     */
    @JsonProperty("cloud_printer_bind_request")
    private CloudPrinterBindRequest cloudPrinterBindRequest;

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
        return "pdd.cloud.printer.bind";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudPrinterBindResponse> getResponseClass() {
        return PddCloudPrinterBindResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cloud_printer_bind_request", cloudPrinterBindRequest);
    }

    public void setCloudPrinterBindRequest(CloudPrinterBindRequest cloudPrinterBindRequest) {
        this.cloudPrinterBindRequest = cloudPrinterBindRequest;
    }

    public static class CloudPrinterBindRequest {

        /**
         * 打印机id
         */
        @JsonProperty("printer_id")
        private String printerId;

        /**
         * 验证码
         */
        @JsonProperty("verify_code")
        private String verifyCode;

        public void setPrinterId(String printerId) {
            this.printerId = printerId;
        }

        public void setVerifyCode(String verifyCode) {
            this.verifyCode = verifyCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}