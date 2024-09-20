package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderUpdateAddressResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOrderUpdateAddressRequest extends PopBaseHttpRequest<PddOrderUpdateAddressResponse> {

    /**
     * 收件详细地址
     */
    @JsonProperty("address")
    private String address;

    /**
     * 收件地城市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 城市编码
     */
    @JsonProperty("city_id")
    private Integer cityId;

    /**
     * 订单编号
     */
    @JsonProperty("order_sn")
    private String orderSn;

    /**
     * 收件地省份
     */
    @JsonProperty("province")
    private String province;

    /**
     * 省份编码
     */
    @JsonProperty("province_id")
    private Integer provinceId;

    /**
     * 收件人姓名
     */
    @JsonProperty("receiver_name")
    private String receiverName;

    /**
     * 收件人电话，明文
     */
    @JsonProperty("receiver_phone")
    private String receiverPhone;

    /**
     * 收件地区县
     */
    @JsonProperty("town")
    private String town;

    /**
     * 区县编码
     */
    @JsonProperty("town_id")
    private Integer townId;

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
        return "pdd.order.update.address";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderUpdateAddressResponse> getResponseClass() {
        return PddOrderUpdateAddressResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "address", address);
        setUserParam(params, "city", city);
        setUserParam(params, "city_id", cityId);
        setUserParam(params, "order_sn", orderSn);
        setUserParam(params, "province", province);
        setUserParam(params, "province_id", provinceId);
        setUserParam(params, "receiver_name", receiverName);
        setUserParam(params, "receiver_phone", receiverPhone);
        setUserParam(params, "town", town);
        setUserParam(params, "town_id", townId);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setTownId(Integer townId) {
        this.townId = townId;
    }
}