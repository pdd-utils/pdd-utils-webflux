package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkGoodsPidGenerateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.List;
import java.util.Map;

public class PddDdkGoodsPidGenerateRequest extends PopBaseHttpRequest<PddDdkGoodsPidGenerateResponse> {

    /**
     * 要生成的推广位数量，默认为10，范围为：1~100
     */
    @JsonProperty("number")
    private Long number;

    /**
     * 推广位名称，例如["1","2"]
     */
    @JsonProperty("p_id_name_list")
    private List<String> pIdNameList;

    /**
     * 媒体id
     */
    @JsonProperty("media_id")
    private Long mediaId;

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
        return "pdd.ddk.goods.pid.generate";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkGoodsPidGenerateResponse> getResponseClass() {
        return PddDdkGoodsPidGenerateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "number", number);
        setUserParam(params, "p_id_name_list", pIdNameList);
        setUserParam(params, "media_id", mediaId);
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public void setPIdNameList(List<String> pIdNameList) {
        this.pIdNameList = pIdNameList;
    }

    public void setMediaId(Long mediaId) {
        this.mediaId = mediaId;
    }
}