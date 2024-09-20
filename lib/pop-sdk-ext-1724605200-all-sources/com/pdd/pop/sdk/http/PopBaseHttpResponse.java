package com.pdd.pop.sdk.http;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;

public class PopBaseHttpResponse {

    @JsonProperty("error_response")
    private ErrorResponse errorResponse;

    @JsonProperty("request_id")
    private String requestId;

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

        public String getRequestId() {
            return requestId;
        }

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public String getSubCode() {
            return subCode;
        }

        public String getSubMsg() {
            return subMsg;
        }
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
