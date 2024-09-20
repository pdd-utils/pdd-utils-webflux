package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddTrainCallbackChangeConfirmResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddTrainCallbackChangeConfirmRequest extends PopBaseHttpRequest<PddTrainCallbackChangeConfirmResponse> {

    /**
     * 错误码
     */
    @JsonProperty("code")
    private Integer code;

    /**
     * 12306 订单号
     */
    @JsonProperty("crh_order_id")
    private String crhOrderId;

    /**
     * 检票口
     */
    @JsonProperty("gate_no")
    private String gateNo;

    /**
     * 信息
     */
    @JsonProperty("msg")
    private String msg;

    /**
     * 改签后新乘车人信息
     */
    @JsonProperty("new_passengers")
    private List<NewPassengersItem> newPassengers;

    /**
     * 商家订单号
     */
    @JsonProperty("order_id")
    private String orderId;

    /**
     * 拼多多订单号
     */
    @JsonProperty("pdd_order_id")
    private String pddOrderId;

    /**
     * 商家订单时间
     */
    @JsonProperty("vendor_time")
    private String vendorTime;

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
        return "pdd.train.callback.change.confirm";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTrainCallbackChangeConfirmResponse> getResponseClass() {
        return PddTrainCallbackChangeConfirmResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "code", code);
        setUserParam(params, "crh_order_id", crhOrderId);
        setUserParam(params, "gate_no", gateNo);
        setUserParam(params, "msg", msg);
        setUserParam(params, "new_passengers", newPassengers);
        setUserParam(params, "order_id", orderId);
        setUserParam(params, "pdd_order_id", pddOrderId);
        setUserParam(params, "vendor_time", vendorTime);
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setCrhOrderId(String crhOrderId) {
        this.crhOrderId = crhOrderId;
    }

    public void setGateNo(String gateNo) {
        this.gateNo = gateNo;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setNewPassengers(List<NewPassengersItem> newPassengers) {
        this.newPassengers = newPassengers;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPddOrderId(String pddOrderId) {
        this.pddOrderId = pddOrderId;
    }

    public void setVendorTime(String vendorTime) {
        this.vendorTime = vendorTime;
    }

    public static class NewPassengersItem {

        /**
         * 新商家子单号
         */
        @JsonProperty("new_sub_order_id")
        private String newSubOrderId;

        /**
         * 新的拼多多子单号
         */
        @JsonProperty("new_sub_pdd_order_id")
        private String newSubPddOrderId;

        /**
         * 老的商家子单号
         */
        @JsonProperty("old_sub_order_id")
        private String oldSubOrderId;

        /**
         * 老的拼多多子单号
         */
        @JsonProperty("old_sub_pdd_order_id")
        private String oldSubPddOrderId;

        public void setNewSubOrderId(String newSubOrderId) {
            this.newSubOrderId = newSubOrderId;
        }

        public void setNewSubPddOrderId(String newSubPddOrderId) {
            this.newSubPddOrderId = newSubPddOrderId;
        }

        public void setOldSubOrderId(String oldSubOrderId) {
            this.oldSubOrderId = oldSubOrderId;
        }

        public void setOldSubPddOrderId(String oldSubPddOrderId) {
            this.oldSubPddOrderId = oldSubPddOrderId;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}