package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLogisticsOrdertraceGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLogisticsOrdertraceGetRequest extends PopBaseHttpRequest<PddLogisticsOrdertraceGetResponse> {

    /**
     * 1
     */
    @JsonProperty("company_code")
    private String companyCode;

    /**
     * 1
     */
    @JsonProperty("mail_no")
    private String mailNo;

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
        return "pdd.logistics.ordertrace.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLogisticsOrdertraceGetResponse> getResponseClass() {
        return PddLogisticsOrdertraceGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "company_code", companyCode);
        setUserParam(params, "mail_no", mailNo);
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public void setMailNo(String mailNo) {
        this.mailNo = mailNo;
    }
}