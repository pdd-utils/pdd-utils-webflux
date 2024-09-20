package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddCloudprintPortableprinterGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddCloudprintPortableprinterGetRequest extends PopBaseHttpRequest<PddCloudprintPortableprinterGetResponse> {

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
        return "pdd.cloudprint.portableprinter.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddCloudprintPortableprinterGetResponse> getResponseClass() {
        return PddCloudprintPortableprinterGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}