package com.pdd.pop.sdk.http.api.pop.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddOverseaClearanceGetResponse extends PopBaseHttpResponse {
    @JsonProperty("clearance_response")
    private ClearanceResponse clearanceResponse;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ClearanceResponse {
        @JsonProperty("id_card_name")
        private String idCardName;
        @JsonProperty("id_card_no")
        private String idCardNo;
        @JsonProperty("inner_transaction_id")
        private String innerTransactionId;
        @JsonProperty("pay_no")
        private String payNo;
        @JsonProperty("pay_type")
        private String payType;
        @JsonProperty("order_sn")
        private String orderSn;
    }
}
