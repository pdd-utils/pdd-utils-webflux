package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttOrderVoucherVerifyResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttOrderVoucherVerifyRequest extends PopBaseHttpRequest<PddKttOrderVoucherVerifyResponse> {

    /**
     * 操作唯一键
     */
    @JsonProperty("external_biz_sn")
    private String externalBizSn;

    /**
     * 操作时间（格式：yyyy-MM-dd HH:mm:ss）
     */
    @JsonProperty("operation_time")
    private String operationTime;

    /**
     * 操作类型：0=核销；1=退款销毁券码
     */
    @JsonProperty("operation_type")
    private Integer operationType;

    /**
     * 父订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 销毁理由
     */
    @JsonProperty("reason")
    private String reason;

    /**
     * 子订单号
     */
    @JsonProperty("sub_order_sn")
    private String subOrderSn;

    /**
     * 核销门店
     */
    @JsonProperty("verification_store")
    private VerificationStore verificationStore;

    /**
     * 核销次数/销毁收回次数
     */
    @JsonProperty("verification_times")
    private Integer verificationTimes;

    /**
     * 当前券码是否已核销
     */
    @JsonProperty("verified")
    private Boolean verified;

    /**
     * 券码id
     */
    @JsonProperty("voucher_id")
    private String voucherId;

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
        return "pdd.ktt.order.voucher.verify";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttOrderVoucherVerifyResponse> getResponseClass() {
        return PddKttOrderVoucherVerifyResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "external_biz_sn", externalBizSn);
        setUserParam(params, "operation_time", operationTime);
        setUserParam(params, "operation_type", operationType);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "reason", reason);
        setUserParam(params, "sub_order_sn", subOrderSn);
        setUserParam(params, "verification_store", verificationStore);
        setUserParam(params, "verification_times", verificationTimes);
        setUserParam(params, "verified", verified);
        setUserParam(params, "voucher_id", voucherId);
    }

    public void setExternalBizSn(String externalBizSn) {
        this.externalBizSn = externalBizSn;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime;
    }

    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setSubOrderSn(String subOrderSn) {
        this.subOrderSn = subOrderSn;
    }

    public void setVerificationStore(VerificationStore verificationStore) {
        this.verificationStore = verificationStore;
    }

    public void setVerificationTimes(Integer verificationTimes) {
        this.verificationTimes = verificationTimes;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public static class VerificationStore {

        /**
         * 门店编号
         */
        @JsonProperty("external_store_no")
        private String externalStoreNo;

        /**
         * 门店地址详情
         */
        @JsonProperty("store_address_detail")
        private String storeAddressDetail;

        /**
         * 门店市
         */
        @JsonProperty("store_city")
        private String storeCity;

        /**
         * 门店区
         */
        @JsonProperty("store_district")
        private String storeDistrict;

        /**
         * 门店名字
         */
        @JsonProperty("store_name")
        private String storeName;

        /**
         * 门店电话
         */
        @JsonProperty("store_phone")
        private String storePhone;

        /**
         * 门店省
         */
        @JsonProperty("store_province")
        private String storeProvince;

        public void setExternalStoreNo(String externalStoreNo) {
            this.externalStoreNo = externalStoreNo;
        }

        public void setStoreAddressDetail(String storeAddressDetail) {
            this.storeAddressDetail = storeAddressDetail;
        }

        public void setStoreCity(String storeCity) {
            this.storeCity = storeCity;
        }

        public void setStoreDistrict(String storeDistrict) {
            this.storeDistrict = storeDistrict;
        }

        public void setStoreName(String storeName) {
            this.storeName = storeName;
        }

        public void setStorePhone(String storePhone) {
            this.storePhone = storePhone;
        }

        public void setStoreProvince(String storeProvince) {
            this.storeProvince = storeProvince;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}