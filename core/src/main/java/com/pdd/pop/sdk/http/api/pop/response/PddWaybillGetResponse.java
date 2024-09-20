package com.pdd.pop.sdk.http.api.pop.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddWaybillGetResponse extends PopBaseHttpResponse {

    @JsonProperty("pdd_waybill_get_response")
    private InnerPddWaybillGetResponse pddWaybillGetResponse;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InnerPddWaybillGetResponse {

        @JsonProperty("modules")
        private List<InnerPddWaybillGetResponseModulesItem> modules;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class InnerPddWaybillGetResponseModulesItem {

        @JsonProperty("object_id")
        private String objectId;

        @JsonProperty("parent_waybill_code")
        private String parentWaybillCode;

        @JsonProperty("print_data")
        private String printData;

        @JsonProperty("waybill_code")
        private String waybillCode;
    }
}
