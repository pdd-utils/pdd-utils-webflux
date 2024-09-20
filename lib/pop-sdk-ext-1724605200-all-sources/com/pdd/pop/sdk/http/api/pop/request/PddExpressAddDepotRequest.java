package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddExpressAddDepotResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddExpressAddDepotRequest extends PopBaseHttpRequest<PddExpressAddDepotResponse> {

    /**
     * 联系人姓名
     */
    @JsonProperty("contact_name")
    private String contactName;

    /**
     * 仓库详细地址5-20字
     */
    @JsonProperty("depot_address")
    private String depotAddress;

    /**
     * 别名
     */
    @JsonProperty("depot_alias")
    private String depotAlias;

    /**
     * 所在市id
     */
    @JsonProperty("depot_city_id")
    private Integer depotCityId;

    /**
     * 仓库编码
     */
    @JsonProperty("depot_code")
    private String depotCode;

    /**
     * 所在区id
     */
    @JsonProperty("depot_district_id")
    private Integer depotDistrictId;

    /**
     * 仓库名称
     */
    @JsonProperty("depot_name")
    private String depotName;

    /**
     * 所在省id
     */
    @JsonProperty("depot_province_id")
    private Integer depotProvinceId;

    /**
     * 仓库区域（ 省->市->区id列表）例如：{"34":{"396":[3383]}}Map<Integer, Map<Integer, List<Integer>>>
     * {
     * 1:{
     *   2:[3,4]
     *   }
     * }
     */
    @JsonProperty("depot_region")
    private Map<String, Map<String, List<String>>> depotRegion;

    /**
     * 联系人电话
     */
    @JsonProperty("telephone")
    private String telephone;

    /**
     * 邮编
     */
    @JsonProperty("zip_code")
    private String zipCode;

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
        return "pdd.express.add.depot";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExpressAddDepotResponse> getResponseClass() {
        return PddExpressAddDepotResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "contact_name", contactName);
        setUserParam(params, "depot_address", depotAddress);
        setUserParam(params, "depot_alias", depotAlias);
        setUserParam(params, "depot_city_id", depotCityId);
        setUserParam(params, "depot_code", depotCode);
        setUserParam(params, "depot_district_id", depotDistrictId);
        setUserParam(params, "depot_name", depotName);
        setUserParam(params, "depot_province_id", depotProvinceId);
        setUserParam(params, "depot_region", depotRegion);
        setUserParam(params, "telephone", telephone);
        setUserParam(params, "zip_code", zipCode);
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setDepotAddress(String depotAddress) {
        this.depotAddress = depotAddress;
    }

    public void setDepotAlias(String depotAlias) {
        this.depotAlias = depotAlias;
    }

    public void setDepotCityId(Integer depotCityId) {
        this.depotCityId = depotCityId;
    }

    public void setDepotCode(String depotCode) {
        this.depotCode = depotCode;
    }

    public void setDepotDistrictId(Integer depotDistrictId) {
        this.depotDistrictId = depotDistrictId;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    public void setDepotProvinceId(Integer depotProvinceId) {
        this.depotProvinceId = depotProvinceId;
    }

    public void setDepotRegion(Map<String, Map<String, List<String>>> depotRegion) {
        this.depotRegion = depotRegion;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}