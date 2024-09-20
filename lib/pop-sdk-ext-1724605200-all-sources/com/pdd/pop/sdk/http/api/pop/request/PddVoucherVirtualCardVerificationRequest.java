package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVoucherVirtualCardVerificationResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddVoucherVirtualCardVerificationRequest extends PopBaseHttpRequest<PddVoucherVirtualCardVerificationResponse> {

    /**
     * 拼多多订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 券信息列表
     */
    @JsonProperty("voucher_data_list")
    private List<VoucherDataListItem> voucherDataList;

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
        return "pdd.voucher.virtual.card.verification";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVoucherVirtualCardVerificationResponse> getResponseClass() {
        return PddVoucherVirtualCardVerificationResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "voucher_data_list", voucherDataList);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setVoucherDataList(List<VoucherDataListItem> voucherDataList) {
        this.voucherDataList = voucherDataList;
    }

    public static class VoucherDataListItem {

        /**
         * 流水号
         */
        @JsonProperty("out_trans_no")
        private String outTransNo;

        /**
         * 券状态更改时间
         */
        @JsonProperty("voucher_time")
        private Long voucherTime;

        /**
         * 券状态 1：已核销；2：已销毁
         */
        @JsonProperty("voucher_status")
        private Integer voucherStatus;

        /**
         * 券号
         */
        @JsonProperty("voucher_no")
        private String voucherNo;

        public void setOutTransNo(String outTransNo) {
            this.outTransNo = outTransNo;
        }

        public void setVoucherTime(Long voucherTime) {
            this.voucherTime = voucherTime;
        }

        public void setVoucherStatus(Integer voucherStatus) {
            this.voucherStatus = voucherStatus;
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