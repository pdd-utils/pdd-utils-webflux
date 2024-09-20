package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddFdsWaybillGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("pdd_fds_waybill_get_response")
    private InnerPddFdsWaybillGetResponse pddFdsWaybillGetResponse;

    public InnerPddFdsWaybillGetResponse getPddFdsWaybillGetResponse() {
        return pddFdsWaybillGetResponse;
    }

    public static class InnerPddFdsWaybillGetResponse {

        /**
         * 系统自动生成
         */
        @JsonProperty("modules")
        private List<InnerPddFdsWaybillGetResponseModulesItem> modules;

        public List<InnerPddFdsWaybillGetResponseModulesItem> getModules() {
            return modules;
        }
    }

    public static class InnerPddFdsWaybillGetResponseModulesItem {

        /**
         * 请求 id
         */
        @JsonProperty("object_id")
        private String objectId;

        /**
         * 快运母单号
         */
        @JsonProperty("parent_waybill_code")
        private String parentWaybillCode;

        /**
         * 模板内容（模板内容加密，只需透传至打印组件
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