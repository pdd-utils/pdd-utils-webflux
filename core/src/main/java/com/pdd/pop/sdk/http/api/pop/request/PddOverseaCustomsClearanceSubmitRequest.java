package com.pdd.pop.sdk.http.api.pop.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

import com.pdd.pop.sdk.http.api.pop.response.PddOverseaCustomsClearanceSubmitResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddOverseaCustomsClearanceSubmitRequest extends PopBaseHttpRequest<PddOverseaCustomsClearanceSubmitResponse> {

    /**
     * 区内企业代码 ,仅中通多账号的isv需要填写
     */
    @JsonProperty("area_code")
    private String areaCode;

    /**
     * 申报公司代码
     */
    @JsonProperty("base_transfer_cop_code")
    private String baseTransferCopCode;

    /**
     * 报关单类型
     */
    @JsonProperty("clearance_message_type")
    private String clearanceMessageType;

    /**
     * 报关请求原始报文。请注意将敏感信息密文传输，提交给海关什么格式就提交给这个接口什么格式的报文
     */
    @JsonProperty("content")
    private String content;

    /**
     * 国家公布的海关关区标准代码
     */
    @JsonProperty("customs_area_code")
    private String customsAreaCode;

    /**
     * 拼多多平台订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 跨境模式，例如bbc、bc，默认值bbc
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
        return "pdd.oversea.customs.clearance.submit";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return super.getHttpMethod();
    }

    @Override
    public Class<PddOverseaCustomsClearanceSubmitResponse> getResponseClass() {
        return PddOverseaCustomsClearanceSubmitResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "area_code", areaCode);
        setUserParam(params, "base_transfer_cop_code", baseTransferCopCode);
        setUserParam(params, "clearance_message_type", clearanceMessageType);
        setUserParam(params, "content", content);
        setUserParam(params, "customs_area_code", customsAreaCode);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "oversea_business_type", overseaBusinessType);
        setUserParam(params, "config_key", configKey);
    }
}
