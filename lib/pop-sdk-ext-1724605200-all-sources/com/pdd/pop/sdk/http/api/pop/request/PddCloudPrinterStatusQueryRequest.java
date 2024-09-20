package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudPrinterStatusQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudPrinterStatusQueryRequest extends PopBaseHttpRequest<PddCloudPrinterStatusQueryResponse> {

    /**
     * 打印状态查询请求
     */
    @JsonProperty("cloud_printer_status_query_request")
    private CloudPrinterStatusQueryRequest cloudPrinterStatusQueryRequest;

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
        return "pdd.cloud.printer.status.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudPrinterStatusQueryResponse> getResponseClass() {
        return PddCloudPrinterStatusQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cloud_printer_status_query_request", cloudPrinterStatusQueryRequest);
    }

    public void setCloudPrinterStatusQueryRequest(CloudPrinterStatusQueryRequest cloudPrinterStatusQueryRequest) {
        this.cloudPrinterStatusQueryRequest = cloudPrinterStatusQueryRequest;
    }

    public static class CloudPrinterStatusQueryRequest {

        /**
         * 打印机id
         */
        @JsonProperty("printer_id")
        private String printerId;

        /**
         * 共享码
         */
        @JsonProperty("share_code")
        private String shareCode;

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