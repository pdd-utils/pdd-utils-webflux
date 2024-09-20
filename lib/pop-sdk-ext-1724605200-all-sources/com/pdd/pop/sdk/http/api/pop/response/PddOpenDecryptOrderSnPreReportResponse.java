package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOpenDecryptOrderSnPreReportResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("open_data_tag_report_response")
    private OpenDataTagReportResponse openDataTagReportResponse;

    public OpenDataTagReportResponse getOpenDataTagReportResponse() {
        return openDataTagReportResponse;
    }

    public static class OpenDataTagReportResponse {

        /**
         * list
         */
        @JsonProperty("list")
        private List<OpenDataTagReportResponseListItem> list;

        public List<OpenDataTagReportResponseListItem> getList() {
            return list;
        }
    }

    public static class OpenDataTagReportResponseListItem {

        /**
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 是否成功写入
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