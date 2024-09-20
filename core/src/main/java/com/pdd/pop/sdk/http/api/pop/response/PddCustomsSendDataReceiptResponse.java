package com.pdd.pop.sdk.http.api.pop.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddCustomsSendDataReceiptResponse extends PopBaseHttpResponse {

    @JsonProperty("custom_receipt_response")
    private CustomReceiptResponse customReceiptResponse;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomReceiptResponse {

        @JsonProperty("report_status")
        private Integer reportStatus;

        @JsonProperty("trace_id")
        private String traceId;
    }
}
