package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCloudPrintTaskQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddCloudPrintTaskQueryRequest extends PopBaseHttpRequest<PddCloudPrintTaskQueryResponse> {

    /**
     * 云打印任务查询请求
     */
    @JsonProperty("cloud_print_task_query")
    private CloudPrintTaskQuery cloudPrintTaskQuery;

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
        return "pdd.cloud.print.task.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudPrintTaskQueryResponse> getResponseClass() {
        return PddCloudPrintTaskQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cloud_print_task_query", cloudPrintTaskQuery);
    }

    public void setCloudPrintTaskQuery(CloudPrintTaskQuery cloudPrintTaskQuery) {
        this.cloudPrintTaskQuery = cloudPrintTaskQuery;
    }

    public static class CloudPrintTaskQuery {

        /**
         * 打印序号，非必填，填了则只查询列表内的任务
         */
        @JsonProperty("print_sequence_list")
        private List<Integer> printSequenceList;

        /**
         * 打印任务id
         */
        @JsonProperty("print_task_id")
        private String printTaskId;

        /**
         * 打印机id
         */
        @JsonProperty("printer_id")
        private String printerId;

        /**
         * 共享码
         */
        @JsonProperty("share_code")
        private String shareCode;

        public void setPrintSequenceList(List<Integer> printSequenceList) {
            this.printSequenceList = printSequenceList;
        }

        public void setPrintTaskId(String printTaskId) {
            this.printTaskId = printTaskId;
        }

        public void setPrinterId(String printerId) {
            this.printerId = printerId;
        }

        public void setShareCode(String shareCode) {
            this.shareCode = shareCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}