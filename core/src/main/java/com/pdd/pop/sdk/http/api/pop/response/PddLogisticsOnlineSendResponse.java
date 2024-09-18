package com.pdd.pop.sdk.http.api.pop.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddLogisticsOnlineSendResponse extends PopBaseHttpResponse {
    @JsonProperty("logistics_online_send_response")
    private LogisticsOnlineSendResponse logisticsOnlineSendResponse;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LogisticsOnlineSendResponse {
        @JsonProperty("is_success")
        private Boolean isSuccess;
    }
}
