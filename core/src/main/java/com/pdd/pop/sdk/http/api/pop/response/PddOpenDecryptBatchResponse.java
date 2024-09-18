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
public class PddOpenDecryptBatchResponse extends PopBaseHttpResponse {
    @JsonProperty("open_decrypt_batch_response")
    private OpenDecryptBatchResponse openDecryptBatchResponse;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OpenDecryptBatchResponseDataDecryptListItem {
        @JsonProperty("data_tag")
        private String dataTag;
        @JsonProperty("data_type")
        private Integer dataType;
        @JsonProperty("decrypted_data")
        private String decryptedData;
        @JsonProperty("encrypted_data")
        private String encryptedData;
        @JsonProperty("error_code")
        private Integer errorCode;
        @JsonProperty("error_msg")
        private String errorMsg;
        @JsonProperty("virtual_identify_number")
        private String virtualIdentifyNumber;
        @JsonProperty("virtual_number_type")
        private Integer virtualNumberType;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OpenDecryptBatchResponse {
        @JsonProperty("data_decrypt_list")
        private List<OpenDecryptBatchResponseDataDecryptListItem> dataDecryptList;
    }
}
