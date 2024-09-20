package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttOrderVoucherSyncResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKttOrderVoucherSyncRequest extends PopBaseHttpRequest<PddKttOrderVoucherSyncResponse> {

    /**
     * 父订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 子订单号
     */
    @JsonProperty("sub_order_sn")
    private String subOrderSn;

    /**
     * 券码列表
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
        return "pdd.ktt.order.voucher.sync";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttOrderVoucherSyncResponse> getResponseClass() {
        return PddKttOrderVoucherSyncResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "sub_order_sn", subOrderSn);
        setUserParam(params, "voucher_list", voucherList);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setSubOrderSn(String subOrderSn) {
        this.subOrderSn = subOrderSn;
    }

    public void setVoucherList(List<VoucherListItem> voucherList) {
        this.voucherList = voucherList;
    }

    public static class VoucherListItem {

        /**
         * 过期时间（格式：yyyy-MM-dd HH:mm:ss）
         */
        @JsonProperty("expire_date")
        private String expireDate;

        /**
         * 可核销次数
         */
        @JsonProperty("valid_verification_times")
        private Integer validVerificationTimes;

        /**
         * 券码id
         */
        @JsonProperty("voucher_id")
        private String voucherId;

        /**
         * 券码编号
         */
        @JsonProperty("voucher_sn")
        private String voucherSn;

        public void setExpireDate(String expireDate) {
            this.expireDate = expireDate;
        }

        public void setValidVerificationTimes(Integer validVerificationTimes) {
            this.validVerificationTimes = validVerificationTimes;
        }

        public void setVoucherId(String voucherId) {
            this.voucherId = voucherId;
        }

        public void setVoucherSn(String voucherSn) {
            this.voucherSn = voucherSn;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}