package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddQrpayPayeeRegisterResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddQrpayPayeeRegisterRequest extends PopBaseHttpRequest<PddQrpayPayeeRegisterResponse> {

    /**
     * 参数列表
     */
    @JsonProperty("payee_list")
    private List<PayeeListItem> payeeList;

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
        return "pdd.qrpay.payee.register";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddQrpayPayeeRegisterResponse> getResponseClass() {
        return PddQrpayPayeeRegisterResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "payee_list", payeeList);
    }

    public void setPayeeList(List<PayeeListItem> payeeList) {
        this.payeeList = payeeList;
    }

    public static class PayeeListItem {

        /**
         * 参数名，用于注册到名单，并生成对应URL
         */
        @JsonProperty("payee")
        private String payee;

        public void setPayee(String payee) {
            this.payee = payee;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}