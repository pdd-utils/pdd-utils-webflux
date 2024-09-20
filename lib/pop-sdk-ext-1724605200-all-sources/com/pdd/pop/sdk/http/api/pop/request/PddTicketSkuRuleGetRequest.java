package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddTicketSkuRuleGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTicketSkuRuleGetRequest extends PopBaseHttpRequest<PddTicketSkuRuleGetResponse> {

    /**
     * 商户履约规则 id
     */
    @JsonProperty("out_rule_id")
    private String outRuleId;

    /**
     * 上传商品的上传序列 ID
     */
    @JsonProperty("rule_id")
    private String ruleId;

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
        return "pdd.ticket.sku.rule.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTicketSkuRuleGetResponse> getResponseClass() {
        return PddTicketSkuRuleGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "out_rule_id", outRuleId);
        setUserParam(params, "rule_id", ruleId);
    }

    public void setOutRuleId(String outRuleId) {
        this.outRuleId = outRuleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }
}