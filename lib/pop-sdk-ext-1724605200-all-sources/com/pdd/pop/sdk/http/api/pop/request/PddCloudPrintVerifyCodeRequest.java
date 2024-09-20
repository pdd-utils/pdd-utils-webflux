package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudPrintVerifyCodeResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudPrintVerifyCodeRequest extends PopBaseHttpRequest<PddCloudPrintVerifyCodeResponse> {

    /**
     * 云打印验证码请求
     */
    @JsonProperty("cloud_print_verify_code_request")
    private CloudPrintVerifyCodeRequest cloudPrintVerifyCodeRequest;

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
        return "pdd.cloud.print.verify.code";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudPrintVerifyCodeResponse> getResponseClass() {
        return PddCloudPrintVerifyCodeResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cloud_print_verify_code_request", cloudPrintVerifyCodeRequest);
    }

    public void setCloudPrintVerifyCodeRequest(CloudPrintVerifyCodeRequest cloudPrintVerifyCodeRequest) {
        this.cloudPrintVerifyCodeRequest = cloudPrintVerifyCodeRequest;
    }

    public static class CloudPrintVerifyCodeRequest {

        /**
         * 打印机id
         */
        @JsonProperty("printer_id")
        private String printerId;

        public void setPrinterId(String printerId) {
            this.printerId = printerId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}