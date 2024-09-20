package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddFdsOrderGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddFdsOrderGetRequest extends PopBaseHttpRequest<PddFdsOrderGetResponse> {

    /**
     * 入参信息
     */
    @JsonProperty("param_fds_order_get_request")
    private ParamFdsOrderGetRequest paramFdsOrderGetRequest;

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
        return "pdd.fds.order.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddFdsOrderGetResponse> getResponseClass() {
        return PddFdsOrderGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "param_fds_order_get_request", paramFdsOrderGetRequest);
    }

    public void setParamFdsOrderGetRequest(ParamFdsOrderGetRequest paramFdsOrderGetRequest) {
        this.paramFdsOrderGetRequest = paramFdsOrderGetRequest;
    }

    public static class ParamFdsOrderGetRequest {

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

        public void setMallMaskId(String mallMaskId) {
            this.mallMaskId = mallMaskId;
        }

        public void setOrderMaskSn(String orderMaskSn) {
            this.orderMaskSn = orderMaskSn;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}