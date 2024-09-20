package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenDecryptBatchResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOpenDecryptBatchRequest extends PopBaseHttpRequest<PddOpenDecryptBatchResponse> {

    /**
     * 数据列表, 默认列表大小不超过100
     */
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
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenDecryptBatchResponse> getResponseClass() {
        return PddOpenDecryptBatchResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "data_list", dataList);
    }

    public void setDataList(List<DataListItem> dataList) {
        this.dataList = dataList;
    }

    public static class DataListItem {

        /**
         * 解密tag，对于订单数据是订单号
         */
        @JsonProperty("data_tag")
        private String dataTag;

        /**
         * 密文
         */
        @JsonProperty("encrypted_data")
        private String encryptedData;

        public void setDataTag(String dataTag) {
            this.dataTag = dataTag;
        }

        public void setEncryptedData(String encryptedData) {
            this.encryptedData = encryptedData;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}