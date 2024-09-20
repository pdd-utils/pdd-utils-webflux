package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddFdsWaybillReturnResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddFdsWaybillReturnRequest extends PopBaseHttpRequest<PddFdsWaybillReturnResponse> {

    /**
     * 入参信息
     */
    @JsonProperty("param_fds_waybill_return_request")
    private ParamFdsWaybillReturnRequest paramFdsWaybillReturnRequest;

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
        return "pdd.fds.waybill.return";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFdsWaybillReturnResponse> getResponseClass() {
        return PddFdsWaybillReturnResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "param_fds_waybill_return_request", paramFdsWaybillReturnRequest);
    }

    public void setParamFdsWaybillReturnRequest(ParamFdsWaybillReturnRequest paramFdsWaybillReturnRequest) {
        this.paramFdsWaybillReturnRequest = paramFdsWaybillReturnRequest;
    }

    public static class ParamFdsWaybillReturnRequest {

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
         * 面单号
         */
        @JsonProperty("waybill_code")
        private String waybillCode;

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

        public void setWaybillCode(String waybillCode) {
            this.waybillCode = waybillCode;
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