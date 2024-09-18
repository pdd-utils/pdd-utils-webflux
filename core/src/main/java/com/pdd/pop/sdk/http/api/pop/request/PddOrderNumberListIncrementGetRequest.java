package com.pdd.pop.sdk.http.api.pop.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderNumberListIncrementGetResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddOrderNumberListIncrementGetRequest extends PopBaseHttpRequest<PddOrderNumberListIncrementGetResponse> {
    @JsonProperty("end_updated_at")
    private Long endUpdatedAt;
    @JsonProperty("is_lucky_flag")
    private Integer isLuckyFlag;
    @JsonProperty("order_status")
    private Integer orderStatus;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("page_size")
    private Integer pageSize;
    @JsonProperty("refund_status")
    private Integer refundStatus;
    @JsonProperty("start_updated_at")
    private Long startUpdatedAt;
    @JsonProperty("trade_type")
    private Integer tradeType;
    @JsonProperty("use_has_next")
    private Boolean useHasNext;

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
        return "pdd.order.number.list.increment.get";
    }



    @Override
    public Class<PddOrderNumberListIncrementGetResponse> getResponseClass() {
        return PddOrderNumberListIncrementGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        this.setUserParam(params, "end_updated_at", this.endUpdatedAt);
        this.setUserParam(params, "is_lucky_flag", this.isLuckyFlag);
        this.setUserParam(params, "order_status", this.orderStatus);
        this.setUserParam(params, "page", this.page);
        this.setUserParam(params, "page_size", this.pageSize);
        this.setUserParam(params, "refund_status", this.refundStatus);
        this.setUserParam(params, "start_updated_at", this.startUpdatedAt);
        this.setUserParam(params, "trade_type", this.tradeType);
        this.setUserParam(params, "use_has_next", this.useHasNext);
    }
}
