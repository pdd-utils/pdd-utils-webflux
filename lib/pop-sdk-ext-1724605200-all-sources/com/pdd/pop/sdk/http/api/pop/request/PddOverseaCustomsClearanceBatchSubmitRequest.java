package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOverseaCustomsClearanceBatchSubmitResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOverseaCustomsClearanceBatchSubmitRequest extends PopBaseHttpRequest<PddOverseaCustomsClearanceBatchSubmitResponse> {

    /**
     * 申报公司的海关代码
     */
    @JsonProperty("base_transfer_cop_code")
    private String baseTransferCopCode;

    /**
     * 报关单类型
     */
    @JsonProperty("clearance_message_type")
    private String clearanceMessageType;

    /**
     * 报关请求原始报文。请注意将敏感信息密文传输
     */
    @JsonProperty("content")
    private String content;

    /**
     * 国家公布的标准海关代码
     */
    @JsonProperty("customs_area_code")
    private String customsAreaCode;

    /**
     * 拼多多平台订单号列表，必须与报文中的订单信息按序对应
     */
    @JsonProperty("order_sn_list")
    private List<String> orderSnList;

    /**
     * bbc(保税仓模式), bc(直邮模式)
     */
    @JsonProperty("oversea_business_type")
    private String overseaBusinessType;

    /**
     * 账密标识（报关账密管理）
     */
    @JsonProperty("config_key")
    private String configKey;

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
        return "pdd.oversea.customs.clearance.batch.submit";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOverseaCustomsClearanceBatchSubmitResponse> getResponseClass() {
        return PddOverseaCustomsClearanceBatchSubmitResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "base_transfer_cop_code", baseTransferCopCode);
        setUserParam(params, "clearance_message_type", clearanceMessageType);
        setUserParam(params, "content", content);
        setUserParam(params, "customs_area_code", customsAreaCode);
        setUserParam(params, "order_sn_list", orderSnList);
        setUserParam(params, "oversea_business_type", overseaBusinessType);
        setUserParam(params, "config_key", configKey);
    }

    public void setBaseTransferCopCode(String baseTransferCopCode) {
        this.baseTransferCopCode = baseTransferCopCode;
    }

    public void setClearanceMessageType(String clearanceMessageType) {
        this.clearanceMessageType = clearanceMessageType;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCustomsAreaCode(String customsAreaCode) {
        this.customsAreaCode = customsAreaCode;
    }

    public void setOrderSnList(List<String> orderSnList) {
        this.orderSnList = orderSnList;
    }

    public void setOverseaBusinessType(String overseaBusinessType) {
        this.overseaBusinessType = overseaBusinessType;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }
}