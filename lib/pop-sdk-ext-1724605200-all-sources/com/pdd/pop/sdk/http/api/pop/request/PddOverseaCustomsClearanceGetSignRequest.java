package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOverseaCustomsClearanceGetSignResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOverseaCustomsClearanceGetSignRequest extends PopBaseHttpRequest<PddOverseaCustomsClearanceGetSignResponse> {

    /**
     * 业务单证名称
     */
    @JsonProperty("ceb_name")
    private String cebName;

    /**
     * 加密机绑定的企业的海关注册10位编码
     */
    @JsonProperty("company_customs_code")
    private String companyCustomsCode;

    /**
     * 拼多多订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 待加签的数据,不包含签名节点的xml报关报文字符串
     */
    @JsonProperty("original_data_to_sign")
    private String originalDataToSign;

    /**
     * 批量拼多多订单号,用于批量加签时传递多个orderSn
     */
    @JsonProperty("order_sn_list")
    private List<String> orderSnList;

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
        return "pdd.oversea.customs.clearance.get.sign";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOverseaCustomsClearanceGetSignResponse> getResponseClass() {
        return PddOverseaCustomsClearanceGetSignResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "ceb_name", cebName);
        setUserParam(params, "company_customs_code", companyCustomsCode);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "original_data_to_sign", originalDataToSign);
        setUserParam(params, "order_sn_list", orderSnList);
    }

    public void setCebName(String cebName) {
        this.cebName = cebName;
    }

    public void setCompanyCustomsCode(String companyCustomsCode) {
        this.companyCustomsCode = companyCustomsCode;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setOriginalDataToSign(String originalDataToSign) {
        this.originalDataToSign = originalDataToSign;
    }

    public void setOrderSnList(List<String> orderSnList) {
        this.orderSnList = orderSnList;
    }
}