package com.pdd.pop.sdk.http.api.pop.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddOverseaCustomsClearanceSubmitResponse extends PopBaseHttpResponse {

    @JsonProperty("customs_clearance_submit_response")
    private CustomsClearanceSubmitResponse customsClearanceSubmitResponse;

    @JsonProperty("request_id")
    private String requestId;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomsClearanceSubmitResponse {

        @JsonProperty("call_customs_api_result")
        private String callCustomsApiResult;
    }
}
