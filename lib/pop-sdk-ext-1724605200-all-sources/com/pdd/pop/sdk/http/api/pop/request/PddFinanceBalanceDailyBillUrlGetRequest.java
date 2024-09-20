package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddFinanceBalanceDailyBillUrlGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddFinanceBalanceDailyBillUrlGetRequest extends PopBaseHttpRequest<PddFinanceBalanceDailyBillUrlGetResponse> {

    /**
     * 账单日期（形如yyyy-MM-dd）；例如入参为“2019-03-24”，则返回2019年3月24日的商家货款日账单的下载链接
     */
    @JsonProperty("bill_date")
    private String billDate;

    @Override
    public String getVersion() {
        return "V1";
    }

    @Override
    public String getDataType() {
        return "JSON";
    }

    @Override
    public Integer getPlatform() {
        return 0;
    }

    @Override
    public String getType() {
        return "pdd.finance.balance.daily.bill.url.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFinanceBalanceDailyBillUrlGetResponse> getResponseClass() {
        return PddFinanceBalanceDailyBillUrlGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "bill_date", billDate);
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }
}