package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddHeavygoodsBackExpressCallbackResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddHeavygoodsBackExpressCallbackRequest extends PopBaseHttpRequest<PddHeavygoodsBackExpressCallbackResponse> {

    /**
     * 包裹回退原因
     */
    @JsonProperty("back_reason")
    private String backReason;

    /**
     * 逆向运单号
     */
    @JsonProperty("back_trck_no")
    private String backTrckNo;

    /**
     * 逆向运单所关联的正向运单号
     */
    @JsonProperty("trck_no")
    private String trckNo;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.heavygoods.back.express.callback";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddHeavygoodsBackExpressCallbackResponse> getResponseClass() {
        return PddHeavygoodsBackExpressCallbackResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "back_reason", backReason);
        setUserParam(params, "back_trck_no", backTrckNo);
        setUserParam(params, "trck_no", trckNo);
    }

    public void setBackReason(String backReason) {
        this.backReason = backReason;
    }

    public void setBackTrckNo(String backTrckNo) {
        this.backTrckNo = backTrckNo;
    }

    public void setTrckNo(String trckNo) {
        this.trckNo = trckNo;
    }
}