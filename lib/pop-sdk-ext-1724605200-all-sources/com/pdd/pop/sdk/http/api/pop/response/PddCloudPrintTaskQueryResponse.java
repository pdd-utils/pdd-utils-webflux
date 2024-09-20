package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudPrintTaskQueryResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 
         */
        @JsonProperty("result")
        private ResponseResult result;

        /**
         * 
         */
        @JsonProperty("success")
        private Boolean success;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public ResponseResult getResult() {
            return result;
        }

        public Boolean getSuccess() {
            return success;
        }
    }

    public static class ResponseResult {

        /**
         * 云打印任务结果列表
         */
        @JsonProperty("cloud_print_task_result_list")
        private List<ResponseResultCloudPrintTaskResultListItem> cloudPrintTaskResultList;

        public List<ResponseResultCloudPrintTaskResultListItem> getCloudPrintTaskResultList() {
            return cloudPrintTaskResultList;
        }
    }

    public static class ResponseResultCloudPrintTaskResultListItem {

        /**
         * 失败原因
         */
        @JsonProperty("fail_reason")
        private String failReason;

        /**
         * 请求云打印时token对应的mallId
         */
        @JsonProperty("mall_id")
        private Long mallId;

        /**
         * 打印序号
         */
        @JsonProperty("print_sequence")
        private Integer printSequence;

        /**
         * 打印状态 0:打印中 1:打印成功 2:打印失败 3:打印超时
         */
        @JsonProperty("print_status")
        private Integer printStatus;

        /**
         * 打印任务id
         */
        @JsonProperty("print_task_id")
        private String printTaskId;

        /**
         * 是否推送给云打印机，只有打印失败的任务才有值，如果为true，需要重点关注是否打印完成
         */
        @JsonProperty("pushed_to_printer")
        private Boolean pushedToPrinter;

        /**
         * 快递公司编码
         */
        @JsonProperty("ship_code")
        private String shipCode;

        /**
         * 运单号
         */
        @JsonProperty("waybill_code")
        private String waybillCode;

        public String getFailReason() {
            return failReason;
        }

        public Long getMallId() {
            return mallId;
        }

        public Integer getPrintSequence() {
            return printSequence;
        }

        public Integer getPrintStatus() {
            return printStatus;
        }

        public String getPrintTaskId() {
            return printTaskId;
        }

        public Boolean getPushedToPrinter() {
            return pushedToPrinter;
        }

        public String getShipCode() {
            return shipCode;
        }

        public String getWaybillCode() {
            return waybillCode;
        }
    }
}