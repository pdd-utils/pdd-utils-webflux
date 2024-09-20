package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCustomsSendDataReceiptResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCustomsSendDataReceiptRequest extends PopBaseHttpRequest<PddCustomsSendDataReceiptResponse> {

    /**
     * 订单申报公司全称
     */
    @JsonProperty("ceb311_declare_company")
    private String ceb311DeclareCompany;

    /**
     * 订单申报公司海关备案号
     */
    @JsonProperty("ceb311_declare_company_code")
    private String ceb311DeclareCompanyCode;

    /**
     * 清单申报公司全称
     */
    @JsonProperty("ceb621_declare_company")
    private String ceb621DeclareCompany;

    /**
     * 清单申报公司海关备案号
     */
    @JsonProperty("ceb621_declare_company_code")
    private String ceb621DeclareCompanyCode;

    /**
     * 业务单证名称，例如：CEB311，CEB621，枚举见：CEBNameEnum
     */
    @JsonProperty("ceb_name")
    private String cebName;

    /**
     * 回执时间13位的timestamp，dataType=2-报关回执数据，此字段必填
     */
    @JsonProperty("ceb_receipt_time")
    private Long cebReceiptTime;

    /**
     * 业务单证报关数据回执，dataType=2-报关回执数据，此字段必填
     */
    @JsonProperty("ceb_receipt_xml")
    private String cebReceiptXml;

    /**
     * 业务单证报关数据，dataType=1-报关数据，此字段必填
     */
    @JsonProperty("ceb_request_xml")
    private String cebRequestXml;

    /**
     * 数据类型：1-报关数据，2-报关回执数据
     */
    @JsonProperty("data_type")
    private Integer dataType;

    /**
     * 实际发货仓海关备案号，比如：W60TQ6
     */
    @JsonProperty("delivery_warehouse_code")
    private String deliveryWarehouseCode;

    /**
     * 实际发货仓名称，例如仓
     */
    @JsonProperty("delivery_warehouse_name")
    private String deliveryWarehouseName;

    /**
     * 快递承运公司全称，例如中通快递
     */
    @JsonProperty("express_company")
    private String expressCompany;

    /**
     * 运单申报公司全称，例如快递
     */
    @JsonProperty("express_declare_company")
    private String expressDeclareCompany;

    /**
     * 运单申报公司海关备案号，比如：W60TQ6
     */
    @JsonProperty("express_declare_company_code")
    private String expressDeclareCompanyCode;

    /**
     * 快递发货运单号
     */
    @JsonProperty("express_no")
    private String expressNo;

    /**
     * 拼多多订单号，dataType=1-报关数据，此字段必填
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 清关状态，dataType=2-报关回执数据，此字段必填，填充回执中的returnStatus
     */
    @JsonProperty("receipt_status")
    private String receiptStatus;

    /**
     * 清关状态描述，dataType=2-报关回执数据，此字段必填，填充回执中的returnInfo
     */
    @JsonProperty("receipt_status_desc")
    private String receiptStatusDesc;

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
     * 申报服务仓地址
     */
    @JsonProperty("warehouse_address")
    private String warehouseAddress;

    /**
     * 申报服务仓海关备案号，例如：W60TQ6
     */
    @JsonProperty("warehouse_code")
    private String warehouseCode;

    /**
     * 申报服务仓所属服务商公司全称
     */
    @JsonProperty("warehouse_company")
    private String warehouseCompany;

    /**
     * 申报服务仓名称，例如：东莞虎门保税仓
     */
    @JsonProperty("warehouse_name")
    private String warehouseName;

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
        return "pdd.customs.send.data.receipt";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCustomsSendDataReceiptResponse> getResponseClass() {
        return PddCustomsSendDataReceiptResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ceb311_declare_company", ceb311DeclareCompany);
        setUserParam(params, "ceb311_declare_company_code", ceb311DeclareCompanyCode);
        setUserParam(params, "ceb621_declare_company", ceb621DeclareCompany);
        setUserParam(params, "ceb621_declare_company_code", ceb621DeclareCompanyCode);
        setUserParam(params, "ceb_name", cebName);
        setUserParam(params, "ceb_receipt_time", cebReceiptTime);
        setUserParam(params, "ceb_receipt_xml", cebReceiptXml);
        setUserParam(params, "ceb_request_xml", cebRequestXml);
        setUserParam(params, "data_type", dataType);
        setUserParam(params, "delivery_warehouse_code", deliveryWarehouseCode);
        setUserParam(params, "delivery_warehouse_name", deliveryWarehouseName);
        setUserParam(params, "express_company", expressCompany);
        setUserParam(params, "express_declare_company", expressDeclareCompany);
        setUserParam(params, "express_declare_company_code", expressDeclareCompanyCode);
        setUserParam(params, "express_no", expressNo);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "receipt_status", receiptStatus);
        setUserParam(params, "receipt_status_desc", receiptStatusDesc);
        setUserParam(params, "trace_id", traceId);
        setUserParam(params, "trade_no", tradeNo);
        setUserParam(params, "warehouse_address", warehouseAddress);
        setUserParam(params, "warehouse_code", warehouseCode);
        setUserParam(params, "warehouse_company", warehouseCompany);
        setUserParam(params, "warehouse_name", warehouseName);
    }

    public void setCeb311DeclareCompany(String ceb311DeclareCompany) {
        this.ceb311DeclareCompany = ceb311DeclareCompany;
    }

    public void setCeb311DeclareCompanyCode(String ceb311DeclareCompanyCode) {
        this.ceb311DeclareCompanyCode = ceb311DeclareCompanyCode;
    }

    public void setCeb621DeclareCompany(String ceb621DeclareCompany) {
        this.ceb621DeclareCompany = ceb621DeclareCompany;
    }

    public void setCeb621DeclareCompanyCode(String ceb621DeclareCompanyCode) {
        this.ceb621DeclareCompanyCode = ceb621DeclareCompanyCode;
    }

    public void setCebName(String cebName) {
        this.cebName = cebName;
    }

    public void setCebReceiptTime(Long cebReceiptTime) {
        this.cebReceiptTime = cebReceiptTime;
    }

    public void setCebReceiptXml(String cebReceiptXml) {
        this.cebReceiptXml = cebReceiptXml;
    }

    public void setCebRequestXml(String cebRequestXml) {
        this.cebRequestXml = cebRequestXml;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public void setDeliveryWarehouseCode(String deliveryWarehouseCode) {
        this.deliveryWarehouseCode = deliveryWarehouseCode;
    }

    public void setDeliveryWarehouseName(String deliveryWarehouseName) {
        this.deliveryWarehouseName = deliveryWarehouseName;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany;
    }

    public void setExpressDeclareCompany(String expressDeclareCompany) {
        this.expressDeclareCompany = expressDeclareCompany;
    }

    public void setExpressDeclareCompanyCode(String expressDeclareCompanyCode) {
        this.expressDeclareCompanyCode = expressDeclareCompanyCode;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setReceiptStatus(String receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    public void setReceiptStatusDesc(String receiptStatusDesc) {
        this.receiptStatusDesc = receiptStatusDesc;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public void setWarehouseCompany(String warehouseCompany) {
        this.warehouseCompany = warehouseCompany;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }
}