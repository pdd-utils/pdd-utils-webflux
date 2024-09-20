package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVoucherOtaCardPrepareVerificationResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddVoucherOtaCardPrepareVerificationRequest extends PopBaseHttpRequest<PddVoucherOtaCardPrepareVerificationResponse> {

    /**
     * 请求体
     */
    @JsonProperty("request")
    private Request request;

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
        return "pdd.voucher.ota.card.prepare.verification";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVoucherOtaCardPrepareVerificationResponse> getResponseClass() {
        return PddVoucherOtaCardPrepareVerificationResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * 卡密
         */
        @JsonProperty("card_no")
        private String cardNo;

        /**
         * 门店id
         */
        @JsonProperty("store_id")
        private Long storeId;

        public void setCardNo(String cardNo) {
            this.cardNo = cardNo;
        }

        public void setStoreId(Long storeId) {
            this.storeId = storeId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}