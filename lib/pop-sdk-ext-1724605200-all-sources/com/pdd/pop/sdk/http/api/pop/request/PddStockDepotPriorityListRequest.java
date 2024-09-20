package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddStockDepotPriorityListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddStockDepotPriorityListRequest extends PopBaseHttpRequest<PddStockDepotPriorityListResponse> {

    /**
     * 省id
     */
    @JsonProperty("province_id")
    private Integer provinceId;

    /**
     * 市id
     */
    @JsonProperty("city_id")
    private Integer cityId;

    /**
     * 区id
     */
    @JsonProperty("district_id")
    private Integer districtId;

    /**
     * 仓库编码
     */
    @JsonProperty("depot_code")
    private String depotCode;

    /**
     * 每页数据显示数量
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 当前页数 从1开始
     */
    @JsonProperty("page_num")
    private Integer pageNum;

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
        return "pdd.stock.depot.priority.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddStockDepotPriorityListResponse> getResponseClass() {
        return PddStockDepotPriorityListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "province_id", provinceId);
        setUserParam(params, "city_id", cityId);
        setUserParam(params, "district_id", districtId);
        setUserParam(params, "depot_code", depotCode);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "page_num", pageNum);
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public void setDepotCode(String depotCode) {
        this.depotCode = depotCode;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}