package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddErpOrderSyncResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddErpOrderSyncRequest extends PopBaseHttpRequest<PddErpOrderSyncResponse> {

    /**
     * 物流公司编码
     */
    @JsonProperty("logistics_id")
    private Long logisticsId;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 订单状态：1-已打单
     */
    @JsonProperty("order_state")
    private Integer orderState;

    /**
     * 运单号
     */
    @JsonProperty("waybill_no")
    private String waybillNo;

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
        return "pdd.erp.order.sync";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddErpOrderSyncResponse> getResponseClass() {
        return PddErpOrderSyncResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "logistics_id", logisticsId);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "order_state", orderState);
        setUserParam(params, "waybill_no", waybillNo);
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }
}