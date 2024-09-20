package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddCustomsSendDataReceiptResponse extends PopBaseHttpResponse {

    /**
     * 返回的结果
     */
    @JsonProperty("custom_receipt_response")
    private CustomReceiptResponse customReceiptResponse;

    public CustomReceiptResponse getCustomReceiptResponse() {
        return customReceiptResponse;
    }

    public static class CustomReceiptResponse {

        /**
         * 上报成功失败状态：0-失败，1-成功，不成功请重试3次
         */
        @JsonProperty("report_status")
        private Integer reportStatus;

        /**
         * 报关商的一次请求的id
         */
        @JsonProperty("trace_id")
        private String traceId;

        public Integer getReportStatus() {
            return reportStatus;
        }

        public String getTraceId() {
            return traceId;
        }
    }
}