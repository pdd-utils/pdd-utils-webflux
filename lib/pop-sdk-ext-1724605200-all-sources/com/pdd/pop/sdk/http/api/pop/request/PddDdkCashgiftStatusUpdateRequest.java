package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkCashgiftStatusUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkCashgiftStatusUpdateRequest extends PopBaseHttpRequest<PddDdkCashgiftStatusUpdateResponse> {

    /**
     * 多多礼金ID
     */
    @JsonProperty("cash_gift_id")
    private Long cashGiftId;

    /**
     * 礼金更新类型：0-停止礼金推广，1-恢复礼金推广
     */
    @JsonProperty("update_type")
    private Integer updateType;

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
        return "pdd.ddk.cashgift.status.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkCashgiftStatusUpdateResponse> getResponseClass() {
        return PddDdkCashgiftStatusUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "cash_gift_id", cashGiftId);
        setUserParam(params, "update_type", updateType);
    }

    public void setCashGiftId(Long cashGiftId) {
        this.cashGiftId = cashGiftId;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }
}