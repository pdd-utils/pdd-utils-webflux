package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddFdsWaybillReturnSlaveResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddFdsWaybillReturnSlaveRequest extends PopBaseHttpRequest<PddFdsWaybillReturnSlaveResponse> {

    /**
     * 回传从运单号请求
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
        return "pdd.fds.waybill.return.slave";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFdsWaybillReturnSlaveResponse> getResponseClass() {
        return PddFdsWaybillReturnSlaveResponse.class;
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
         * 代打店铺id
         */
        @JsonProperty("mall_mask_id")
        private String mallMaskId;

        /**
         * 代打订单号
         */
        @JsonProperty("order_mask_sn")
        private String orderMaskSn;

        /**
         * 从运单号列表，最多传递十条从运单号
         */
        @JsonProperty("waybill_codes")
        private List<String> waybillCodes;

        /**
         * 物流公司 Code ，枚举： YTO- 圆通，ZTO-中通，YUNDA-韵达，STO-申通
         */
        @JsonProperty("wp_code")
        private String wpCode;

        public void setMallMaskId(String mallMaskId) {
            this.mallMaskId = mallMaskId;
        }

        public void setOrderMaskSn(String orderMaskSn) {
            this.orderMaskSn = orderMaskSn;
        }

        public void setWaybillCodes(List<String> waybillCodes) {
            this.waybillCodes = waybillCodes;
        }

        public void setWpCode(String wpCode) {
            this.wpCode = wpCode;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}