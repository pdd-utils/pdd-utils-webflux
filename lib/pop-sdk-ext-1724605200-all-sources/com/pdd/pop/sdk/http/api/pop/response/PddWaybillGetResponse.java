package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddWaybillGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_waybill_get_response")
    private InnerPddWaybillGetResponse pddWaybillGetResponse;

    public InnerPddWaybillGetResponse getPddWaybillGetResponse() {
        return pddWaybillGetResponse;
    }

    public static class InnerPddWaybillGetResponse {

        /**
         * 系统自动生成
         */
        @JsonProperty("modules")
        private List<InnerPddWaybillGetResponseModulesItem> modules;

        public List<InnerPddWaybillGetResponseModulesItem> getModules() {
            return modules;
        }
    }

    public static class InnerPddWaybillGetResponseModulesItem {

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