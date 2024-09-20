package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTraceSourceUploadCodeInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddTraceSourceUploadCodeInfoRequest extends PopBaseHttpRequest<PddTraceSourceUploadCodeInfoResponse> {

    /**
     * 溯源码列表
     */
    @JsonProperty("serial_num_list")
    private List<SerialNumListItem> serialNumList;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.trace.source.upload.code.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTraceSourceUploadCodeInfoResponse> getResponseClass() {
        return PddTraceSourceUploadCodeInfoResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "serial_num_list", serialNumList);
    }

    public void setSerialNumList(List<SerialNumListItem> serialNumList) {
        this.serialNumList = serialNumList;
    }

    public static class SerialNumListItem {

        /**
         * 溯源码（处理后）
         */
        @JsonProperty("encoded_serial_num")
        private String encodedSerialNum;

        /**
         * 溯源码
         */
        @JsonProperty("serial_num")
        private String serialNum;

        public void setEncodedSerialNum(String encodedSerialNum) {
            this.encodedSerialNum = encodedSerialNum;
        }

        public void setSerialNum(String serialNum) {
            this.serialNum = serialNum;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}