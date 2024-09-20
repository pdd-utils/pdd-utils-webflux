package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddLogisticsTicketProblemTypeGetResponse extends PopBaseHttpResponse {

    /**
     * 返回response
     */
    @JsonProperty("logistics_problem_type_get_response")
    private LogisticsProblemTypeGetResponse logisticsProblemTypeGetResponse;

    public LogisticsProblemTypeGetResponse getLogisticsProblemTypeGetResponse() {
        return logisticsProblemTypeGetResponse;
    }

    public static class LogisticsProblemTypeGetResponse {

        /**
         * 问题类型list
         */
        @JsonProperty("logistics_problem_type_list")
        private List<LogisticsProblemTypeGetResponseLogisticsProblemTypeListItem> logisticsProblemTypeList;

        public List<LogisticsProblemTypeGetResponseLogisticsProblemTypeListItem> getLogisticsProblemTypeList() {
            return logisticsProblemTypeList;
        }
    }

    public static class LogisticsProblemTypeGetResponseLogisticsProblemTypeListItem {

        /**
         * 问题类型id
         */
        @JsonProperty("id")
        private Long id;

        /**
         * 问题类型描述
         */
        @JsonProperty("type_desc")
        private String typeDesc;

        public Long getId() {
            return id;
        }

        public String getTypeDesc() {
            return typeDesc;
        }
    }
}