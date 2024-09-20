package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddRdcPddgeniusSendgoodsCancelResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddRdcPddgeniusSendgoodsCancelRequest extends PopBaseHttpRequest<PddRdcPddgeniusSendgoodsCancelResponse> {

    /**
     * param
     */
    @JsonProperty("param")
    private Param param;

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
        return "pdd.rdc.pddgenius.sendgoods.cancel";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddRdcPddgeniusSendgoodsCancelResponse> getResponseClass() {
        return PddRdcPddgeniusSendgoodsCancelResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "param", param);
    }

    public void setParam(Param param) {
        this.param = param;
    }

    public static class Param {

        /**
         * 错误码：1001 错误场景：该订单未同步，无法取消发货 实际含义：订单未同步到isv; 错误码：1002 错误场景：该订单已发货，无法取消发货 实际含义：订单已经发货; 错误码：1003 错误场景：该订单已发货，无法取消发货 实际含义：订单已打印电子面单
         */
        @JsonProperty("fail_reason_code")
        private Integer failReasonCode;

        /**
         * 描述
         */
        @JsonProperty("msg")
        private String msg;

        /**
         * 操作时间戳（毫秒）
         */
        @JsonProperty("operate_time")
        private Long operateTime;

        /**
         * 退款金额 单位 分
         */
        @JsonProperty("refund_fee")
        private Integer refundFee;

        /**
         * 退款单ID
         */
        @JsonProperty("refund_id")
        private Long refundId;

        /**
         * 状态SUCCESS、FAIL
         */
        @JsonProperty("status")
        private String status;

        /**
         * 订单号
         */
        @JsonProperty("tid")
        private String tid;

        public void setFailReasonCode(Integer failReasonCode) {
            this.failReasonCode = failReasonCode;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public void setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
        }

        public void setRefundFee(Integer refundFee) {
            this.refundFee = refundFee;
        }

        public void setRefundId(Long refundId) {
            this.refundId = refundId;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setTid(String tid) {
            this.tid = tid;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}