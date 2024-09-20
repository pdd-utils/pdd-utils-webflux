package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.http.api.pop.response.PddTicketAreacodeGetResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddTicketAreacodeGetRequest extends PopBaseHttpRequest<PddTicketAreacodeGetResponse> {

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
        return "pdd.ticket.areacode.get";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddTicketAreacodeGetResponse> getResponseClass() {
        return PddTicketAreacodeGetResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
    }
}