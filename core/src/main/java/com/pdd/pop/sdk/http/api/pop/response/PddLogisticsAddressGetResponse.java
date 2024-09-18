package com.pdd.pop.sdk.http.api.pop.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddLogisticsAddressGetResponse extends PopBaseHttpResponse {
    @JsonProperty("logistics_address_get_response")
    private LogisticsAddressGetResponse logisticsAddressGetResponse;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LogisticsAddressGetResponseLogisticsAddressListItem {
        @JsonProperty("id")
        private Long id;
        @JsonProperty("is_enabled")
        private Integer isEnabled;
        @JsonProperty("national_code")
        private String nationalCode;
        @JsonProperty("parent_id")
        private Long parentId;
        @JsonProperty("region_name")
        private String regionName;
        @JsonProperty("region_type")
        private Integer regionType;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class LogisticsAddressGetResponse {
        @JsonProperty("logistics_address_list")
        private List<LogisticsAddressGetResponseLogisticsAddressListItem> logisticsAddressList;
    }
}
