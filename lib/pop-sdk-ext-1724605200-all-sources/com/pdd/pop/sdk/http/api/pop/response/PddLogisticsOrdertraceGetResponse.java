package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsOrdertraceGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("logistics_ordertrace_get_resposne")
    private LogisticsOrdertraceGetResposne logisticsOrdertraceGetResposne;

    public LogisticsOrdertraceGetResposne getLogisticsOrdertraceGetResposne() {
        return logisticsOrdertraceGetResposne;
    }

    public static class LogisticsOrdertraceGetResposne {

        /**
         * 返回列表
         */
        @JsonProperty("trace_list")
        private List<LogisticsOrdertraceGetResposneTraceListItem> traceList;

        public List<LogisticsOrdertraceGetResposneTraceListItem> getTraceList() {
            return traceList;
        }
    }

    public static class LogisticsOrdertraceGetResposneTraceListItem {

        /**
         * 节点说明 ，指明当前节点揽收、派送，签收。
         */
        @JsonProperty("action")
        private String action;

        /**
         * 描述
         */
        @JsonProperty("desc")
        private String desc;

        /**
         * 地址地一
         */
        @JsonProperty("node_description")
        private String nodeDescription;

        /**
         * 状态描述
         */
        @JsonProperty("status_desc")
        private String statusDesc;

        /**
         * 状态发生的时间
         */
        @JsonProperty("status_time")
        private String statusTime;

        /**
         * 时间。。
         */
        @JsonProperty("time")
        private String time;

        public String getAction() {
            return action;
        }

        public String getDesc() {
            return desc;
        }

        public String getNodeDescription() {
            return nodeDescription;
        }

        public String getStatusDesc() {
            return statusDesc;
        }

        public String getStatusTime() {
            return statusTime;
        }

        public String getTime() {
            return time;
        }
    }
}