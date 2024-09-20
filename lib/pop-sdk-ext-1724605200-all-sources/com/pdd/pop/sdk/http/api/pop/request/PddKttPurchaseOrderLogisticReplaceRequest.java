package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttPurchaseOrderLogisticReplaceResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKttPurchaseOrderLogisticReplaceRequest extends PopBaseHttpRequest<PddKttPurchaseOrderLogisticReplaceResponse> {

    /**
     * 新物流公司id（与物流公司名两者至少填一）
     */
    @JsonProperty("new_logistics_id")
    private Integer newLogisticsId;

    /**
     * 新物流公司名（与物流公司id两者至少填一）
     */
    @JsonProperty("new_logistics_name")
    private String newLogisticsName;

    /**
     * 新运单号
     */
    @JsonProperty("new_waybill_no")
    private String newWaybillNo;

    /**
     * 旧运单号
     */
    @JsonProperty("old_waybill_no")
    private String oldWaybillNo;

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
        return "pdd.ktt.purchase.order.logistic.replace";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttPurchaseOrderLogisticReplaceResponse> getResponseClass() {
        return PddKttPurchaseOrderLogisticReplaceResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "new_logistics_id", newLogisticsId);
        setUserParam(params, "new_logistics_name", newLogisticsName);
        setUserParam(params, "new_waybill_no", newWaybillNo);
        setUserParam(params, "old_waybill_no", oldWaybillNo);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "sub_order_sn_list", subOrderSnList);
    }

    public void setNewLogisticsId(Integer newLogisticsId) {
        this.newLogisticsId = newLogisticsId;
    }

    public void setNewLogisticsName(String newLogisticsName) {
        this.newLogisticsName = newLogisticsName;
    }

    public void setNewWaybillNo(String newWaybillNo) {
        this.newWaybillNo = newWaybillNo;
    }

    public void setOldWaybillNo(String oldWaybillNo) {
        this.oldWaybillNo = oldWaybillNo;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setSubOrderSnList(List<String> subOrderSnList) {
        this.subOrderSnList = subOrderSnList;
    }
}