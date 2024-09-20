package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddLogisticsIsvTraceNotifySubResponse extends PopBaseHttpResponse {

    /**
     * 订阅响应对象
     */
    @JsonProperty("logistics_isv_trace_notify_sub")
    private LogisticsIsvTraceNotifySub logisticsIsvTraceNotifySub;

    public LogisticsIsvTraceNotifySub getLogisticsIsvTraceNotifySub() {
        return logisticsIsvTraceNotifySub;
    }

    public static class LogisticsIsvTraceNotifySub {

        /**
         * 是否成功，false-失败，true-成功
         */
        @JsonProperty("is_success")
        private Boolean isSuccess;

        public Boolean getIsSuccess() {
            return isSuccess;
        }
    }
}