package com.pdd.pop.sdk.http;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PopBaseHttpResponse {
    @JsonProperty("error_response")
    private ErrorResponse errorResponse;
    @JsonProperty("request_id")
    private String requestId;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ErrorResponse {
        @JsonProperty("request_id")
        private String requestId;
        @JsonProperty("error_code")
        private Integer errorCode;
        @JsonProperty("error_msg")
        private String errorMsg;
        @JsonProperty("sub_code")
        private String subCode;
        @JsonProperty("sub_msg")
        private String subMsg;
    }
}
