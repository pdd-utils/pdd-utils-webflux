package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseOrderDeliveryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKttPurchaseOrderDeliveryRequest extends PopBaseHttpRequest<PddKttPurchaseOrderDeliveryResponse> {

    /**
     * 物流公司id
     */
    @JsonProperty("logistics_id")
    private Integer logisticsId;

    /**
     * 物流公司名
     */
    @JsonProperty("logistics_name")
    private String logisticsName;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 发货子单列表，无子单号视为整单发货
     */
    @JsonProperty("sub_order_sn_list")
    private List<String> subOrderSnList;

    /**
     * 物流单号
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
        return "pdd.ktt.purchase.order.delivery";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseOrderDeliveryResponse> getResponseClass() {
        return PddKttPurchaseOrderDeliveryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "logistics_id", logisticsId);
        setUserParam(params, "logistics_name", logisticsName);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "sub_order_sn_list", subOrderSnList);
        setUserParam(params, "waybill_no", waybillNo);
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setSubOrderSnList(List<String> subOrderSnList) {
        this.subOrderSnList = subOrderSnList;
    }

    public void setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
    }
}