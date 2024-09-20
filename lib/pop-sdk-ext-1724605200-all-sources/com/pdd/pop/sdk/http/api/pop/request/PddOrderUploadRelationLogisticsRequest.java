package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderUploadRelationLogisticsResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOrderUploadRelationLogisticsRequest extends PopBaseHttpRequest<PddOrderUploadRelationLogisticsResponse> {

    /**
     * 订单多包裹发货时使用的其他发货快递信息
     */
    @JsonProperty("extra_track_list")
    private List<ExtraTrackListItem> extraTrackList;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

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
        return "pdd.order.upload.relation.logistics";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderUploadRelationLogisticsResponse> getResponseClass() {
        return PddOrderUploadRelationLogisticsResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "extra_track_list", extraTrackList);
        setUserParam(params, "order_sn", orderSn);
    }

    public void setExtraTrackList(List<ExtraTrackListItem> extraTrackList) {
        this.extraTrackList = extraTrackList;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public static class ExtraTrackListItem {

        /**
         * 快递公司id
         */
        @JsonProperty("shipping_id")
        private Integer shippingId;

        /**
         * 快递单号
         */
        @JsonProperty("tracking_number")
        private String trackingNumber;

        public void setShippingId(Integer shippingId) {
            this.shippingId = shippingId;
        }

        public void setTrackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}