package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddRefundInformationGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddRefundInformationGetRequest extends PopBaseHttpRequest<PddRefundInformationGetResponse> {

    /**
     * 售后单id
     */
    @JsonProperty("after_sales_id")
    private Long afterSalesId;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

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
        return "pdd.refund.information.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddRefundInformationGetResponse> getResponseClass() {
        return PddRefundInformationGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "after_sales_id", afterSalesId);
        setUserParam(params, "order_sn", orderSn);
    }

    public void setAfterSalesId(Long afterSalesId) {
        this.afterSalesId = afterSalesId;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
}