package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVasOrderDivertResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddVasOrderDivertRequest extends PopBaseHttpRequest<PddVasOrderDivertResponse> {

    /**
     * 服务市场订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 服务sku_id
     */
    @JsonProperty("sku_id")
    private Long skuId;

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
        return "pdd.vas.order.divert";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVasOrderDivertResponse> getResponseClass() {
        return PddVasOrderDivertResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "sku_id", skuId);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}