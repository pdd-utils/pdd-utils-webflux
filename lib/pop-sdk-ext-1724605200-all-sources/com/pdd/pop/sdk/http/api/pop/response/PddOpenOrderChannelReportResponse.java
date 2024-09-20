package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOpenOrderChannelReportResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("open_order_channel_report_response")
    private OpenOrderChannelReportResponse openOrderChannelReportResponse;

    public OpenOrderChannelReportResponse getOpenOrderChannelReportResponse() {
        return openOrderChannelReportResponse;
    }

    public static class OpenOrderChannelReportResponse {

        /**
         * 结果列表
         */
        @JsonProperty("result_list")
        private List<OpenOrderChannelReportResponseResultListItem> resultList;

        public List<OpenOrderChannelReportResponseResultListItem> getResultList() {
            return resultList;
        }
    }

    public static class OpenOrderChannelReportResponseResultListItem {

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * true：报备成功，false：报备失败
         */
        @JsonProperty("success")
        private Boolean success;

        public String getOrderSn() {
            return orderSn;
        }

        public Boolean getSuccess() {
            return success;
        }
    }
}