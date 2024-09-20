package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderUploadExtraLogisticsResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddOrderUploadExtraLogisticsRequest extends PopBaseHttpRequest<PddOrderUploadExtraLogisticsResponse> {

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

    /**
     * 额外运单类型，1=分包发货，2=补发商品，3=发放赠品
     */
    @JsonProperty("extra_track_type")
    private Integer extraTrackType;

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
        return "pdd.order.upload.extra.logistics";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderUploadExtraLogisticsResponse> getResponseClass() {
        return PddOrderUploadExtraLogisticsResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "extra_track_list", extraTrackList);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "extra_track_type", extraTrackType);
    }

    public void setExtraTrackList(List<ExtraTrackListItem> extraTrackList) {
        this.extraTrackList = extraTrackList;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setExtraTrackType(Integer extraTrackType) {
        this.extraTrackType = extraTrackType;
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