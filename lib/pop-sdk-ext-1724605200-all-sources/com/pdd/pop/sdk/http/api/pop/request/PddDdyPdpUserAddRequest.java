package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdyPdpUserAddResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdyPdpUserAddRequest extends PopBaseHttpRequest<PddDdyPdpUserAddResponse> {

    /**
     * 推送历史数据天数，只能为30天内，包含30天。当此参数不填时，表示以页面中应用配置的历史天数为准；如果为0表示这个用户不推送历史数据；其它表示推送的历史天数
     */
    @JsonProperty("history_days")
    private Integer historyDays;

    /**
     * rds实例编号
     */
    @JsonProperty("rds_id")
    private String rdsId;

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
        return "pdd.ddy.pdp.user.add";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdyPdpUserAddResponse> getResponseClass() {
        return PddDdyPdpUserAddResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "history_days", historyDays);
        setUserParam(params, "rds_id", rdsId);
    }

    public void setHistoryDays(Integer historyDays) {
        this.historyDays = historyDays;
    }

    public void setRdsId(String rdsId) {
        this.rdsId = rdsId;
    }
}