package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddDdkStatisticsDataQueryResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddDdkStatisticsDataQueryRequest extends PopBaseHttpRequest<PddDdkStatisticsDataQueryResponse> {

    /**
     * 分页数，默认值: 1
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 每页结果数，默认值: 20
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 周期类型: 1-每7天，2-自然月
     */
    @JsonProperty("period_type")
    private Integer periodType;

    /**
     * 数据类型: 1-增量补贴数据
     */
    @JsonProperty("statistics_type")
    private Integer statisticsType;

    /**
     * 查询时间点，格式: "yyyy-MM-dd"。period_type为1时，查询时间点前7天的数据；period_type为2时，查询时间点所在自然月的数据。
     */
    @JsonProperty("time")
    private String time;

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
        return "pdd.ddk.statistics.data.query";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddDdkStatisticsDataQueryResponse> getResponseClass() {
        return PddDdkStatisticsDataQueryResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "page", page);
        setUserParam(params, "page_size", pageSize);
        setUserParam(params, "period_type", periodType);
        setUserParam(params, "statistics_type", statisticsType);
        setUserParam(params, "time", time);
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public void setStatisticsType(Integer statisticsType) {
        this.statisticsType = statisticsType;
    }

    public void setTime(String time) {
        this.time = time;
    }
}