package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMedicineConsultCloseResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMedicineConsultCloseRequest extends PopBaseHttpRequest<PddMedicineConsultCloseResponse> {

    /**
     * 问诊单号
     */
    @JsonProperty("consult_no")
    private String consultNo;

    /**
     * 会话关闭原因
     */
    @JsonProperty("reason")
    private String reason;

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
        return "pdd.medicine.consult.close";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMedicineConsultCloseResponse> getResponseClass() {
        return PddMedicineConsultCloseResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "consult_no", consultNo);
        setUserParam(params, "reason", reason);
    }

    public void setConsultNo(String consultNo) {
        this.consultNo = consultNo;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}