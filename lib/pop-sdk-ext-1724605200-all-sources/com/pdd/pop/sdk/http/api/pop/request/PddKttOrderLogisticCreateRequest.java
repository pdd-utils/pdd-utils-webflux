package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttOrderLogisticCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKttOrderLogisticCreateRequest extends PopBaseHttpRequest<PddKttOrderLogisticCreateResponse> {

    /**
     * 物流公司编码
     */
    @JsonProperty("logisticsId")
    private Integer logisticsId;

    /**
     * 物流公司名称
     */
    @JsonProperty("logisticsName")
    private String logisticsName;

    /**
     * 订单号
     */
    @JsonProperty("orderSn")
    private String orderSn;

    /**
     * 发货子单号列表，无子单号视为整单发货
     */
    @JsonProperty("subOrderSnList")
    private List<String> subOrderSnList;

    /**
     * 运单号
     */
    @JsonProperty("waybillNo")
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
        return "pdd.ktt.order.logistic.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttOrderLogisticCreateResponse> getResponseClass() {
        return PddKttOrderLogisticCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "logisticsId", logisticsId);
        setUserParam(params, "logisticsName", logisticsName);
        setUserParam(params, "orderSn", orderSn);
        setUserParam(params, "subOrderSnList", subOrderSnList);
        setUserParam(params, "waybillNo", waybillNo);
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