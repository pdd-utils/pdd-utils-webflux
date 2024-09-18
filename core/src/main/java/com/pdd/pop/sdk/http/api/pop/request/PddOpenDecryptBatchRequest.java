package com.pdd.pop.sdk.http.api.pop.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenDecryptBatchResponse;
import java.util.List;
import java.util.Map;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
public class PddOpenDecryptBatchRequest extends PopBaseHttpRequest<PddOpenDecryptBatchResponse> {
    @JsonProperty("data_list")
    private List<DataListItem> dataList;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.open.decrypt.batch";
    }


    @Override
    public Class<PddOpenDecryptBatchResponse> getResponseClass() {
        return PddOpenDecryptBatchResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        this.setUserParam(params, "data_list", this.dataList);
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DataListItem {
        @JsonProperty("data_tag")
        private String dataTag;
        @JsonProperty("encrypted_data")
        private String encryptedData;
    }
}
