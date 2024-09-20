package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddCustomsSignGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCustomsSignGetRequest extends PopBaseHttpRequest<PddCustomsSignGetResponse> {

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
     * 企业的类型，1-报关本企业，2-报关物流企业，用于区分使用的密钥
     */
    @JsonProperty("company_type")
    private String companyType;

    /**
     * 要加签的数据
     */
    @JsonProperty("data_to_sign")
    private String dataToSign;

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
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * trace_id不能为空，用于请求的唯一性标示和问题排查，请在日志中打印，同时此字段也用于数据的去重，建议使用UUID.randomUUID().toString()生成，不能超过50个字符
     */
    @JsonProperty("trace_id")
    private String traceId;

    /**
     * XP开头的交易的单号不能为空
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
        return "pdd.customs.sign.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCustomsSignGetResponse> getResponseClass() {
        return PddCustomsSignGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ceb311_declare_company", ceb311DeclareCompany);
        setUserParam(params, "ceb311_declare_company_code", ceb311DeclareCompanyCode);
        setUserParam(params, "ceb621_declare_company", ceb621DeclareCompany);
        setUserParam(params, "ceb621_declare_company_code", ceb621DeclareCompanyCode);
        setUserParam(params, "ceb_name", cebName);
        setUserParam(params, "company_type", companyType);
        setUserParam(params, "data_to_sign", dataToSign);
        setUserParam(params, "express_declare_company", expressDeclareCompany);
        setUserParam(params, "express_declare_company_code", expressDeclareCompanyCode);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "trace_id", traceId);
        setUserParam(params, "trade_no", tradeNo);
        setUserParam(params, "warehouse_code", warehouseCode);
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

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public void setDataToSign(String dataToSign) {
        this.dataToSign = dataToSign;
    }

    public void setExpressDeclareCompany(String expressDeclareCompany) {
        this.expressDeclareCompany = expressDeclareCompany;
    }

    public void setExpressDeclareCompanyCode(String expressDeclareCompanyCode) {
        this.expressDeclareCompanyCode = expressDeclareCompanyCode;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
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
}