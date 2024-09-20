package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddMallInfoStoreGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddMallInfoStoreGetRequest extends PopBaseHttpRequest<PddMallInfoStoreGetResponse> {

    /**
     * 市
     */
    @JsonProperty("city")
    private String city;

    /**
     * 区
     */
    @JsonProperty("district")
    private String district;

    /**
     * 分页
     */
    @JsonProperty("page_number")
    private Integer pageNumber;

    /**
     * 分页大小
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 省
     */
    @JsonProperty("province")
    private String province;

    /**
     * 门店Id
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
        return "pdd.mall.info.store.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddMallInfoStoreGetResponse> getResponseClass() {
        return PddMallInfoStoreGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "city", city);
        setUserParam(params, "district", district);
        setUserParam(params, "page_number", pageNumber);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "province", province);
        setUserParam(params, "store_id", storeId);
        setUserParam(params, "store_name", storeName);
        setUserParam(params, "store_number", storeNumber);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setProvince(String province) {
        this.province = province;
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
}