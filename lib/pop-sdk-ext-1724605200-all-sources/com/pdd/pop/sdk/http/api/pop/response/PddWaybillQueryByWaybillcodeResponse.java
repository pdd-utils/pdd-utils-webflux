package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddWaybillQueryByWaybillcodeResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_waybill_query_by_waybillcode_response")
    private InnerPddWaybillQueryByWaybillcodeResponse pddWaybillQueryByWaybillcodeResponse;

    public InnerPddWaybillQueryByWaybillcodeResponse getPddWaybillQueryByWaybillcodeResponse() {
        return pddWaybillQueryByWaybillcodeResponse;
    }

    public static class InnerPddWaybillQueryByWaybillcodeResponse {

        /**
         * 查询返回值
         */
        @JsonProperty("modules")
        private List<InnerPddWaybillQueryByWaybillcodeResponseModulesItem> modules;

        public List<InnerPddWaybillQueryByWaybillcodeResponseModulesItem> getModules() {
            return modules;
        }
    }

    public static class InnerPddWaybillQueryByWaybillcodeResponseModulesItem {

        /**
         * 面单查询结构体
         */
        @JsonProperty("waybill_cloud_print_response")
        private InnerPddWaybillQueryByWaybillcodeResponseModulesItemWaybillCloudPrintResponse waybillCloudPrintResponse;

        public InnerPddWaybillQueryByWaybillcodeResponseModulesItemWaybillCloudPrintResponse getWaybillCloudPrintResponse() {
            return waybillCloudPrintResponse;
        }
    }

    public static class InnerPddWaybillQueryByWaybillcodeResponseModulesItemWaybillCloudPrintResponse {

        /**
         * 请求id
         */
        @JsonProperty("object_id")
        private String objectId;

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

        public String getPrintData() {
            return printData;
        }

        public String getWaybillCode() {
            return waybillCode;
        }
    }
}