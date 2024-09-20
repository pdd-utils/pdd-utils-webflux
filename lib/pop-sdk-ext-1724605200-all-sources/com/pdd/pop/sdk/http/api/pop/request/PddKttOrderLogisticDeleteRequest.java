package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttOrderLogisticDeleteResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddKttOrderLogisticDeleteRequest extends PopBaseHttpRequest<PddKttOrderLogisticDeleteResponse> {

    /**
     * 订单号
     */
    @JsonProperty("orderSn")
    private String orderSn;

    /**
     * 子单号列表，无子单号视为整单删除物流
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
        return "pdd.ktt.order.logistic.delete";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttOrderLogisticDeleteResponse> getResponseClass() {
        return PddKttOrderLogisticDeleteResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "orderSn", orderSn);
        setUserParam(params, "subOrderSnList", subOrderSnList);
        setUserParam(params, "waybillNo", waybillNo);
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