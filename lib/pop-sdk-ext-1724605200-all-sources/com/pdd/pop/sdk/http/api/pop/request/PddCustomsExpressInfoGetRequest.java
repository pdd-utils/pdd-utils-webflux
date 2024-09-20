package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCustomsExpressInfoGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCustomsExpressInfoGetRequest extends PopBaseHttpRequest<PddCustomsExpressInfoGetResponse> {

    /**
     * 拼多多订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 快递公司Code
     */
    @JsonProperty("ship_code")
    private String shipCode;

    /**
     * 报关商的一次请求的id，建议使用UUID.randomUUID().toString()生成，不能超过50个字符
     */
    @JsonProperty("trace_id")
    private String traceId;

    /**
     * XP开头的交易的单号
     */
    @JsonProperty("trade_no")
    private String tradeNo;

    /**
     * 申报服务仓海关备案号，例如：W60TQ6
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 申报服务仓名称，例如：东莞虎门保税仓
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;

    /**
     * 电子面单号
     */
    @JsonProperty("waybill_code")
    private String waybillCode;

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
        return "pdd.customs.express.info.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCustomsExpressInfoGetResponse> getResponseClass() {
        return PddCustomsExpressInfoGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "ship_code", shipCode);
        setUserParam(params, "trace_id", traceId);
        setUserParam(params, "trade_no", tradeNo);
        setUserParam(params, "warehouse_code", warehouseCode);
        setUserParam(params, "warehouse_name", warehouseName);
        setUserParam(params, "waybill_code", waybillCode);
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }
}