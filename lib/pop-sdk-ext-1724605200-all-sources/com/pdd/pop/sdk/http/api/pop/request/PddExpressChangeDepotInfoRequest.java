package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddExpressChangeDepotInfoResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddExpressChangeDepotInfoRequest extends PopBaseHttpRequest<PddExpressChangeDepotInfoResponse> {

    /**
     * 仓库id
     */
    @JsonProperty("depot_id")
    private Long depotId;

    /**
     * 仓库编码
     */
    @JsonProperty("depot_code")
    private String depotCode;

    /**
     * 仓库名称
     */
    @JsonProperty("depot_name")
    private String depotName;

    /**
     * 别名
     */
    @JsonProperty("depot_alias")
    private String depotAlias;

    /**
     * 所在省id
     */
    @JsonProperty("depot_province_id")
    private Integer depotProvinceId;

    /**
     * 所在市id
     */
    @JsonProperty("depot_city_id")
    private Integer depotCityId;

    /**
     * 所在区id
     */
    @JsonProperty("depot_district_id")
    private Integer depotDistrictId;

    /**
     * 仓库详细地址 5-20字
     */
    @JsonProperty("depot_address")
    private String depotAddress;

    /**
     * 联系人姓名
     */
    @JsonProperty("contact_name")
    private String contactName;

    /**
     * 联系人电话
     */
    @JsonProperty("telephone")
    private String telephone;

    /**
     * 仓库区域（ 省->市->区id列表）例如：{"34":{"396":[3383]}}Map<Integer, Map<Integer, List<Integer>>>
     */
    @JsonProperty("depot_region")
    private String depotRegion;

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
        return "pdd.express.change.depot.info";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExpressChangeDepotInfoResponse> getResponseClass() {
        return PddExpressChangeDepotInfoResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "depot_id", depotId);
        setUserParam(params, "depot_code", depotCode);
        setUserParam(params, "depot_name", depotName);
        setUserParam(params, "depot_alias", depotAlias);
        setUserParam(params, "depot_province_id", depotProvinceId);
        setUserParam(params, "depot_city_id", depotCityId);
        setUserParam(params, "depot_district_id", depotDistrictId);
        setUserParam(params, "depot_address", depotAddress);
        setUserParam(params, "contact_name", contactName);
        setUserParam(params, "telephone", telephone);
        setUserParam(params, "depot_region", depotRegion);
    }

    public void setDepotId(Long depotId) {
        this.depotId = depotId;
    }

    public void setDepotCode(String depotCode) {
        this.depotCode = depotCode;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    public void setDepotAlias(String depotAlias) {
        this.depotAlias = depotAlias;
    }

    public void setDepotProvinceId(Integer depotProvinceId) {
        this.depotProvinceId = depotProvinceId;
    }

    public void setDepotCityId(Integer depotCityId) {
        this.depotCityId = depotCityId;
    }

    public void setDepotDistrictId(Integer depotDistrictId) {
        this.depotDistrictId = depotDistrictId;
    }

    public void setDepotAddress(String depotAddress) {
        this.depotAddress = depotAddress;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setDepotRegion(String depotRegion) {
        this.depotRegion = depotRegion;
    }
}