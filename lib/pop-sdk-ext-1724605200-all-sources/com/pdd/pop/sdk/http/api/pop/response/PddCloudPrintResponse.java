package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudPrintResponse extends PopBaseHttpResponse {

    /**
     * 云打印响应
     */
    @JsonProperty("cloud_print_response")
    private CloudPrintResponse cloudPrintResponse;

    public CloudPrintResponse getCloudPrintResponse() {
        return cloudPrintResponse;
    }

    public static class CloudPrintResponse {

        /**
         * 错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误描述
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 结果
         */
        @JsonProperty("result")
        private CloudPrintResponseResult result;

        /**
         * 请求是否成功
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public CloudPrintResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class CloudPrintResponseResult {

        /**
         * 云打印结果列表
         */
        @JsonProperty("print_result_list")
        private List<CloudPrintResponseResultPrintResultListItem> printResultList;

        public List<CloudPrintResponseResultPrintResultListItem> getPrintResultList() {
            return printResultList;
        }
    }

    public static class CloudPrintResponseResultPrintResultListItem {

        /**
         * 失败原因
         */
        @JsonProperty("fail_reason")
        private String failReason;

        /**
         * 序号
         */
        @JsonProperty("print_sequence")
        private Long printSequence;

        /**
         * 打印任务Id
         */
        @JsonProperty("print_task_id")
        private String printTaskId;

        /**
         * 是否打印成功
         */
        @JsonProperty("result")
        private Boolean result;

        public String getFailReason() {
            return failReason;
        }

        public Long getPrintSequence() {
            return printSequence;
        }

        public String getPrintTaskId() {
            return printTaskId;
        }

        public Boolean getResult() {
            return result;
        }
    }
}