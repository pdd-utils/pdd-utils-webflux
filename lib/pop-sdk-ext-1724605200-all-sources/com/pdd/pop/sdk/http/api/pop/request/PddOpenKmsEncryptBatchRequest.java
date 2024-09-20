package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenKmsEncryptBatchResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOpenKmsEncryptBatchRequest extends PopBaseHttpRequest<PddOpenKmsEncryptBatchResponse> {

    /**
     * 要加密的数据列表, 列表大小不超过100
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
        return "pdd.open.kms.encrypt.batch";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenKmsEncryptBatchResponse> getResponseClass() {
        return PddOpenKmsEncryptBatchResponse.class;
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
         * 明文数据
         */
        @JsonProperty("data")
        private String data;

        /**
         * 是否支持搜索
         */
        @JsonProperty("search")
        private Boolean search;

        /**
         * 敏感信息类型. id: 身份证号, phone: 手机号码, simple: 昵称, 地址等
         */
        @JsonProperty("type")
        private String type;

        public void setData(String data) {
            this.data = data;
        }

        public void setSearch(Boolean search) {
            this.search = search;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}