package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddExpressDepotInfoGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddExpressDepotInfoGetRequest extends PopBaseHttpRequest<PddExpressDepotInfoGetResponse> {

    /**
     * 仓库id
     */
    @JsonProperty("depot_id")
    private Long depotId;

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
        return "pdd.express.depot.info.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddExpressDepotInfoGetResponse> getResponseClass() {
        return PddExpressDepotInfoGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "depot_id", depotId);
    }

    public void setDepotId(Long depotId) {
        this.depotId = depotId;
    }
}