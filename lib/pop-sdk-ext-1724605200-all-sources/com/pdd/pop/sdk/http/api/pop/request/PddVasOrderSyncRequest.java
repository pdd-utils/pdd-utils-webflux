package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddVasOrderSyncResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddVasOrderSyncRequest extends PopBaseHttpRequest<PddVasOrderSyncResponse> {

    /**
     * 订单创建时间，UNIX 时间戳，单位毫秒
     */
    @JsonProperty("create_time")
    private Long createTime;

    /**
     * 幂等id
     */
    @JsonProperty("out_id")
    private String outId;

    /**
     * 服务sku_id
     */
    @JsonProperty("sku_id")
    private Long skuId;

    /**
     * 订购时长，单位秒
     */
    @JsonProperty("time_length")
    private Long timeLength;

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
        return "pdd.vas.order.sync";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddVasOrderSyncResponse> getResponseClass() {
        return PddVasOrderSyncResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "create_time", createTime);
        setUserParam(params, "out_id", outId);
        setUserParam(params, "sku_id", skuId);
        setUserParam(params, "time_length", timeLength);
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public void setOutId(String outId) {
        this.outId = outId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setTimeLength(Long timeLength) {
        this.timeLength = timeLength;
    }
}