package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVoucherRealtimeVerifySyncResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddVoucherRealtimeVerifySyncRequest extends PopBaseHttpRequest<PddVoucherRealtimeVerifySyncResponse> {

    /**
     * 请求入参
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
        return "pdd.voucher.realtime.verify.sync";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVoucherRealtimeVerifySyncResponse> getResponseClass() {
        return PddVoucherRealtimeVerifySyncResponse.class;
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
         * 订单号
         */
        @JsonProperty("order_sn")
        private String orderSn;

        /**
         * 备注
         */
        @JsonProperty("remark")
        private String remark;

        /**
         * ISV核销流水号
         */
        @JsonProperty("serial_no")
        private String serialNo;

        /**
         * 门店名称
         */
        @JsonProperty("shop_name")
        private String shopName;

        /**
         * 门店编号
         */
        @JsonProperty("shop_no")
        private String shopNo;

        /**
         * 卡券核销时间（13 位毫秒）
         */
        @JsonProperty("verify_time")
        private Long verifyTime;

        /**
         * 卡券编号
         */
        @JsonProperty("out_voucher_id")
        private String outVoucherId;

        public void setOrderSn(String orderSn) {
            this.orderSn = orderSn;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public void setSerialNo(String serialNo) {
            this.serialNo = serialNo;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public void setShopNo(String shopNo) {
            this.shopNo = shopNo;
        }

        public void setVerifyTime(Long verifyTime) {
            this.verifyTime = verifyTime;
        }

        public void setOutVoucherId(String outVoucherId) {
            this.outVoucherId = outVoucherId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}