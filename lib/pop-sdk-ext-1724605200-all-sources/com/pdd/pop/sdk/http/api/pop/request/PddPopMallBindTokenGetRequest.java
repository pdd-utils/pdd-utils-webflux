package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddPopMallBindTokenGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddPopMallBindTokenGetRequest extends PopBaseHttpRequest<PddPopMallBindTokenGetResponse> {

    /**
     * 被关联店铺的关联code
     */
    @JsonProperty("bind_code")
    private String bindCode;

    /**
     * 三方应用的用户id
     */
    @JsonProperty("external_uid")
    private String externalUid;

    /**
     * 当前店群包含的拼多多店铺id
     */
    @JsonProperty("mall_list")
    private List<Long> mallList;

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
        return "pdd.pop.mall.bind.token.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddPopMallBindTokenGetResponse> getResponseClass() {
        return PddPopMallBindTokenGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "bind_code", bindCode);
        setUserParam(params, "external_uid", externalUid);
        setUserParam(params, "mall_list", mallList);
    }

    public void setBindCode(String bindCode) {
        this.bindCode = bindCode;
    }

    public void setExternalUid(String externalUid) {
        this.externalUid = externalUid;
    }

    public void setMallList(List<Long> mallList) {
        this.mallList = mallList;
    }
}