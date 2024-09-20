package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMallInfoStoreUpdatePostResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddMallInfoStoreUpdatePostRequest extends PopBaseHttpRequest<PddMallInfoStoreUpdatePostResponse> {

    /**
     * 门店营业状态
     */
    @JsonProperty("business_status")
    private Integer businessStatus;

    /**
     * 营业天数
     */
    @JsonProperty("business_week_list")
    private List<Integer> businessWeekList;

    /**
     * 省市区三级地址-市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 省市区三级地址-区
     */
    @JsonProperty("district")
    private String district;

    /**
     * 结束营业时间段
     */
    @JsonProperty("end_business_hour")
    private String endBusinessHour;

    /**
     * 腾讯地图POI信息ID
     */
    @JsonProperty("poi_id")
    private String poiId;

    /**
     * 门店纬度
     */
    @JsonProperty("poi_latitude")
    private Double poiLatitude;

    /**
     * 门店经度
     */
    @JsonProperty("poi_longitude")
    private Double poiLongitude;

    /**
     * 省市区三级地址-省
     */
    @JsonProperty("province")
    private String province;

    /**
     * 起始营业时间段
     */
    @JsonProperty("start_business_hour")
    private String startBusinessHour;

    /**
     * 门店地址
     */
    @JsonProperty("store_address")
    private String storeAddress;

    /**
     * 门店ID
     */
    @JsonProperty("store_id")
    private Long storeId;

    /**
     * 门店名称
     */
    @JsonProperty("store_name")
    private String storeName;

    /**
     * 门店自有编号
     */
    @JsonProperty("store_number")
    private String storeNumber;

    /**
     * 门店电话
     */
    @JsonProperty("store_phone")
    private String storePhone;

    /**
     * 门店行业（1-男女装，2-运动户外，3-服饰配件，4-厨具电器，5-汽车，8-全屋定制）
     */
    @JsonProperty("trade_type")
    private Integer tradeType;

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
        return "pdd.mall.info.store.update.post";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallInfoStoreUpdatePostResponse> getResponseClass() {
        return PddMallInfoStoreUpdatePostResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "business_status", businessStatus);
        setUserParam(params, "business_week_list", businessWeekList);
        setUserParam(params, "city", city);
        setUserParam(params, "district", district);
        setUserParam(params, "end_business_hour", endBusinessHour);
        setUserParam(params, "poi_id", poiId);
        setUserParam(params, "poi_latitude", poiLatitude);
        setUserParam(params, "poi_longitude", poiLongitude);
        setUserParam(params, "province", province);
        setUserParam(params, "start_business_hour", startBusinessHour);
        setUserParam(params, "store_address", storeAddress);
        setUserParam(params, "store_id", storeId);
        setUserParam(params, "store_name", storeName);
        setUserParam(params, "store_number", storeNumber);
        setUserParam(params, "store_phone", storePhone);
        setUserParam(params, "trade_type", tradeType);
    }

    public void setBusinessStatus(Integer businessStatus) {
        this.businessStatus = businessStatus;
    }

    public void setBusinessWeekList(List<Integer> businessWeekList) {
        this.businessWeekList = businessWeekList;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setEndBusinessHour(String endBusinessHour) {
        this.endBusinessHour = endBusinessHour;
    }

    public void setPoiId(String poiId) {
        this.poiId = poiId;
    }

    public void setPoiLatitude(Double poiLatitude) {
        this.poiLatitude = poiLatitude;
    }

    public void setPoiLongitude(Double poiLongitude) {
        this.poiLongitude = poiLongitude;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setStartBusinessHour(String startBusinessHour) {
        this.startBusinessHour = startBusinessHour;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }
}