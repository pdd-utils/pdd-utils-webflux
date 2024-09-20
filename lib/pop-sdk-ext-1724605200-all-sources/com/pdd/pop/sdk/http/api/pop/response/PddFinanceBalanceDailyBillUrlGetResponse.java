package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddFinanceBalanceDailyBillUrlGetResponse extends PopBaseHttpResponse {

    /**
     * response
     */
    @JsonProperty("finance_balance_daily_bill_url_get_response")
    private FinanceBalanceDailyBillUrlGetResponse financeBalanceDailyBillUrlGetResponse;

    public FinanceBalanceDailyBillUrlGetResponse getFinanceBalanceDailyBillUrlGetResponse() {
        return financeBalanceDailyBillUrlGetResponse;
    }

    public static class FinanceBalanceDailyBillUrlGetResponse {

        /**
         * 货款账单下载 URL
         */
        @JsonProperty("download_url")
        private String downloadUrl;

        public String getDownloadUrl() {
            return downloadUrl;
        }
    }
}