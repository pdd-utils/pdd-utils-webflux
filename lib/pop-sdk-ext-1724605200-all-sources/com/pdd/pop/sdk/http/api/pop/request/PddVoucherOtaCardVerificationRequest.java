package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVoucherOtaCardVerificationResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddVoucherOtaCardVerificationRequest extends PopBaseHttpRequest<PddVoucherOtaCardVerificationResponse> {

    /**
     * 待核销的券码
     */
    @JsonProperty("card_no")
    private String cardNo;

    /**
     * 核销门店id
     */
    @JsonProperty("store_id")
    private Long storeId;

    /**
     * 核销门店名称
     */
    @JsonProperty("store_name")
    private String storeName;

    /**
     * 拼多多订单编号
     */
    @JsonProperty("order_sn")
    private String orderSn;

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
        return "pdd.voucher.ota.card.verification";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVoucherOtaCardVerificationResponse> getResponseClass() {
        return PddVoucherOtaCardVerificationResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "card_no", cardNo);
        setUserParam(params, "store_id", storeId);
        setUserParam(params, "store_name", storeName);
        setUserParam(params, "order_sn", orderSn);
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
}