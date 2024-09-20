package com.pdd.pop.sdk.http.api.ark.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddCloudWaybillGetResponse extends PopBaseHttpResponse {

    /**
     * 响应结果
     */
    @JsonProperty("pdd_waybill_get_response")
    private PddWaybillGetResponse pddWaybillGetResponse;

    public PddWaybillGetResponse getPddWaybillGetResponse() {
        return pddWaybillGetResponse;
    }

    public static class PddWaybillGetResponse {

        /**
         * 子错误码
         */
        @JsonProperty("error_code")
        private Integer errorCode;

        /**
         * 错误信息
         */
        @JsonProperty("error_msg")
        private String errorMsg;

        /**
         * 是否成功，false-失败，true-成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        /**
         * 结果集
         */
        @JsonProperty("modules")
        private List<PddWaybillGetResponseModulesItem> modules;

        /**
         * 错误码
         */
        @JsonProperty("sub_code")
        private Integer subCode;

        /**
         * 子错误信息
         */
        @JsonProperty("sub_msg")
        private String subMsg;

        public Integer getErrorCode() {
            return errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public Boolean getIsSuccess() {
            return isSuccess;
        }

        public List<PddWaybillGetResponseModulesItem> getModules() {
            return modules;
        }

        public Integer getSubCode() {
            return subCode;
        }

        public String getSubMsg() {
            return subMsg;
        }
    }

    public static class PddWaybillGetResponseModulesItem {

        /**
         * 请求id
         */
        @JsonProperty("object_id")
        private String objectId;

        /**
         * 快运母单号
         */
        @JsonProperty("parent_waybill_code")
        private String parentWaybillCode;

        /**
         * 面单信息
         */
        @JsonProperty("print_data")
        private String printData;

        /**
         * 面单号
         */
        @JsonProperty("waybill_code")
        private String waybillCode;

        public String getObjectId() {
            return objectId;
        }

        public String getParentWaybillCode() {
            return parentWaybillCode;
        }

        public String getPrintData() {
            return printData;
        }

        public String getWaybillCode() {
            return waybillCode;
        }
    }
}