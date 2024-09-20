package com.pdd.pop.sdk.http.api.ark.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.ark.response.PddCloudRefundInformationGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudRefundInformationGetRequest extends PopBaseHttpRequest<PddCloudRefundInformationGetResponse> {

    /**
     * 售后单id
     */
    @JsonProperty("after_sales_id")
    private Long afterSalesId;

    /**
     * 扩展字段
     */
    @JsonProperty("extend_props")
    private String extendProps;

    /**
     * 店铺ID
     */
    @JsonProperty("mall_id")
    private Long mallId;

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
        return 1;
    }

    @Override
    public String getType() {
        return "pdd.cloud.refund.information.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudRefundInformationGetResponse> getResponseClass() {
        return PddCloudRefundInformationGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "after_sales_id", afterSalesId);
        setUserParam(params, "extend_props", extendProps);
        setUserParam(params, "mall_id", mallId);
        setUserParam(params, "order_sn", orderSn);
    }

    public void setAfterSalesId(Long afterSalesId) {
        this.afterSalesId = afterSalesId;
    }

    public void setExtendProps(String extendProps) {
        this.extendProps = extendProps;
    }

    public void setMallId(Long mallId) {
        this.mallId = mallId;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
}