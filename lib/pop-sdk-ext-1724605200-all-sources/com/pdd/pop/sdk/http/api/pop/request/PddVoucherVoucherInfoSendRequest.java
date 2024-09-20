package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVoucherVoucherInfoSendResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddVoucherVoucherInfoSendRequest extends PopBaseHttpRequest<PddVoucherVoucherInfoSendResponse> {

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 外部流水号
     */
    @JsonProperty("out_biz_no")
    private String outBizNo;

    /**
     * 卡券信息列表,例子[{"voucher_id":"test voucher_id","voucher_no":"test voucher_no"}]
     */
    @JsonProperty("voucher_list")
    private List<VoucherListItem> voucherList;

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
        return "pdd.voucher.voucher.info.send";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVoucherVoucherInfoSendResponse> getResponseClass() {
        return PddVoucherVoucherInfoSendResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "out_biz_no", outBizNo);
        setUserParam(params, "voucher_list", voucherList);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public void setVoucherList(List<VoucherListItem> voucherList) {
        this.voucherList = voucherList;
    }

    public static class VoucherListItem {

        /**
         * 卡券ID
         */
        @JsonProperty("voucher_id")
        private String voucherId;

        /**
         * 卡券号
         */
        @JsonProperty("voucher_no")
        private String voucherNo;

        public void setVoucherId(String voucherId) {
            this.voucherId = voucherId;
        }

        public void setVoucherNo(String voucherNo) {
            this.voucherNo = voucherNo;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}