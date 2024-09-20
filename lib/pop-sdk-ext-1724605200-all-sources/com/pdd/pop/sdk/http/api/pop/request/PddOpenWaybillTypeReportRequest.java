package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOpenWaybillTypeReportResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOpenWaybillTypeReportRequest extends PopBaseHttpRequest<PddOpenWaybillTypeReportResponse> {

    /**
     * 订单号列表, 默认列表大小不超过100
     */
    @JsonProperty("order_sn_list")
    private List<String> orderSnList;

    /**
     * 面单类型(0-拼多多面单,1-友商平台面单,2-快递公司面单,99-其他)
     */
    @JsonProperty("waybill_type")
    private Integer waybillType;

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
        return "pdd.open.waybill.type.report";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOpenWaybillTypeReportResponse> getResponseClass() {
        return PddOpenWaybillTypeReportResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn_list", orderSnList);
        setUserParam(params, "waybill_type", waybillType);
    }

    public void setOrderSnList(List<String> orderSnList) {
        this.orderSnList = orderSnList;
    }

    public void setWaybillType(Integer waybillType) {
        this.waybillType = waybillType;
    }
}