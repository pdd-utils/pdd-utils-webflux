package com.pdd.pop.sdk.http.api.pop.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderListGetResponse;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PddOrderListGetRequest extends PopBaseHttpRequest<PddOrderListGetResponse> {
    @JsonProperty("end_confirm_at")
    private Long endConfirmAt;
    @JsonProperty("order_status")
    private Integer orderStatus;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("page_size")
    private Integer pageSize;
    @JsonProperty("refund_status")
    private Integer refundStatus;
    @JsonProperty("start_confirm_at")
    private Long startConfirmAt;
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
        return "pdd.order.list.get";
    }


    @Override
    public Class<PddOrderListGetResponse> getResponseClass() {
        return PddOrderListGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        this.setUserParam(params, "end_confirm_at", this.endConfirmAt);
        this.setUserParam(params, "order_status", this.orderStatus);
        this.setUserParam(params, "page", this.page);
        this.setUserParam(params, "page_size", this.pageSize);
        this.setUserParam(params, "refund_status", this.refundStatus);
        this.setUserParam(params, "start_confirm_at", this.startConfirmAt);
        this.setUserParam(params, "trade_type", this.tradeType);
        this.setUserParam(params, "use_has_next", this.useHasNext);
    }
}
