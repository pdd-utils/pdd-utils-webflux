package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddOpenWaybillTypeReportResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("open_waybill_type_report_response")
    private OpenWaybillTypeReportResponse openWaybillTypeReportResponse;

    public OpenWaybillTypeReportResponse getOpenWaybillTypeReportResponse() {
        return openWaybillTypeReportResponse;
    }

    public static class OpenWaybillTypeReportResponse {

        /**
         * 结果列表
         */
        @JsonProperty("result_list")
        private List<OpenWaybillTypeReportResponseResultListItem> resultList;

        public List<OpenWaybillTypeReportResponseResultListItem> getResultList() {
            return resultList;
        }
    }

    public static class OpenWaybillTypeReportResponseResultListItem {

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