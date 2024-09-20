package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddEinvoiceMallRegisterResultResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddEinvoiceMallRegisterResultRequest extends PopBaseHttpRequest<PddEinvoiceMallRegisterResultResponse> {

    /**
     * 业务数据
     */
    @JsonProperty("data")
    private Data data;

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
        return "pdd.einvoice.mall.register.result";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddEinvoiceMallRegisterResultResponse> getResponseClass() {
        return PddEinvoiceMallRegisterResultResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "data", data);
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static class Data {

        /**
         * 写死 1.0.0
         */
        @JsonProperty("einvoiceApiVersion")
        private String einvoiceApiVersion;

        /**
         * 流水号
         */
        @JsonProperty("eventSerialNo")
        private String eventSerialNo;

        /**
         * 商家ID回传
         */
        @JsonProperty("mallId")
        private String mallId;

        /**
         * 供应商拒绝原因
         */
        @JsonProperty("refuseReason")
        private String refuseReason;

        /**
         * 入驻申请工单号
         */
        @JsonProperty("registerId")
        private String registerId;

        /**
         * 接入状态
         */
        @JsonProperty("registerStatus")
        private Integer registerStatus;

        /**
         * 税号回传
         */
        @JsonProperty("taxNo")
        private String taxNo;

        public void setEinvoiceApiVersion(String einvoiceApiVersion) {
            this.einvoiceApiVersion = einvoiceApiVersion;
        }

        public void setEventSerialNo(String eventSerialNo) {
            this.eventSerialNo = eventSerialNo;
        }

        public void setMallId(String mallId) {
            this.mallId = mallId;
        }

        public void setRefuseReason(String refuseReason) {
            this.refuseReason = refuseReason;
        }

        public void setRegisterId(String registerId) {
            this.registerId = registerId;
        }

        public void setRegisterStatus(Integer registerStatus) {
            this.registerStatus = registerStatus;
        }

        public void setTaxNo(String taxNo) {
            this.taxNo = taxNo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}