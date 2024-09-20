package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVirtualMobileChargeNotifyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddVirtualMobileChargeNotifyRequest extends PopBaseHttpRequest<PddVirtualMobileChargeNotifyResponse> {

    /**
     * 直充附加信息对象数组
     */
    @JsonProperty("charge_certi")
    private List<ChargeCertiItem> chargeCerti;

    /**
     * 电子发票信息 0-不支持开具  1-支持开具
     */
    @JsonProperty("ele_invoice")
    private Integer eleInvoice;

    /**
     * 拼多多订单编码
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 11122dafa 外部系统订单编码
     */
    @JsonProperty("outer_order_sn")
    private String outerOrderSn;

    /**
     * 虚拟系统充值结果，SUCCESS-充值成功，FAIL-充值失败
     */
    @JsonProperty("status")
    private String status;

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
        return "pdd.virtual.mobile.charge.notify";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVirtualMobileChargeNotifyResponse> getResponseClass() {
        return PddVirtualMobileChargeNotifyResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "charge_certi", chargeCerti);
        setUserParam(params, "ele_invoice", eleInvoice);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "outer_order_sn", outerOrderSn);
        setUserParam(params, "status", status);
    }

    public void setChargeCerti(List<ChargeCertiItem> chargeCerti) {
        this.chargeCerti = chargeCerti;
    }

    public void setEleInvoice(Integer eleInvoice) {
        this.eleInvoice = eleInvoice;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setOuterOrderSn(String outerOrderSn) {
        this.outerOrderSn = outerOrderSn;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ChargeCertiItem {

        /**
         * 直充充值金额（单位：分）
         */
        @JsonProperty("charge_certi_amount")
        private Long chargeCertiAmount;

        /**
         * 直充充值成功时间 （yyyy-MM-dd HH:mm:ss格式）
         */
        @JsonProperty("charge_certi_date")
        private String chargeCertiDate;

        /**
         * 直充充值号码
         */
        @JsonProperty("charge_certi_mobile")
        private String chargeCertiMobile;

        /**
         * 充值卡号尾号
         */
        @JsonProperty("charge_certi_mobile_tail")
        private String chargeCertiMobileTail;

        /**
         * 直充充值单号
         */
        @JsonProperty("charge_certi_order_sn")
        private String chargeCertiOrderSn;

        /**
         * 直充短信原文
         */
        @JsonProperty("charge_certi_text")
        private String chargeCertiText;

        /**
         * 代理商(渠道)编号
         */
        @JsonProperty("merchant_outer_id")
        private String merchantOuterId;

        public void setChargeCertiAmount(Long chargeCertiAmount) {
            this.chargeCertiAmount = chargeCertiAmount;
        }

        public void setChargeCertiDate(String chargeCertiDate) {
            this.chargeCertiDate = chargeCertiDate;
        }

        public void setChargeCertiMobile(String chargeCertiMobile) {
            this.chargeCertiMobile = chargeCertiMobile;
        }

        public void setChargeCertiMobileTail(String chargeCertiMobileTail) {
            this.chargeCertiMobileTail = chargeCertiMobileTail;
        }

        public void setChargeCertiOrderSn(String chargeCertiOrderSn) {
            this.chargeCertiOrderSn = chargeCertiOrderSn;
        }

        public void setChargeCertiText(String chargeCertiText) {
            this.chargeCertiText = chargeCertiText;
        }

        public void setMerchantOuterId(String merchantOuterId) {
            this.merchantOuterId = merchantOuterId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}