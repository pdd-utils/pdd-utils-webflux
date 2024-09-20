package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddKttGoodsQueryListResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddKttGoodsQueryListRequest extends PopBaseHttpRequest<PddKttGoodsQueryListResponse> {

    /**
     * 团号（团号和创建时间只能传一个）
     */
    @JsonProperty("activity_no")
    private String activityNo;

    /**
     * 分页页码
     */
    @JsonProperty("page")
    private Integer page;

    /**
     * 分页大小
     */
    @JsonProperty("size")
    private Integer size;

    /**
     * 结束最后更新时间（毫秒级时间戳）
     */
    @JsonProperty("update_time_end")
    private Long updateTimeEnd;

    /**
     * 起始最后更新时间（毫秒级时间戳）
     */
    @JsonProperty("update_time_start")
    private Long updateTimeStart;

    /**
     * 开始时间结束（毫秒级时间戳）
     */
    @JsonProperty("create_time_end")
    private Long createTimeEnd;

    /**
     * 开始时间起始（毫秒级时间戳）
     */
    @JsonProperty("create_time_start")
    private Long createTimeStart;

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
        return "pdd.ktt.goods.query.list";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddKttGoodsQueryListResponse> getResponseClass() {
        return PddKttGoodsQueryListResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "activity_no", activityNo);
        setUserParam(params, "page", page);
        setUserParam(params, "size", size);
        setUserParam(params, "update_time_end", updateTimeEnd);
        setUserParam(params, "update_time_start", updateTimeStart);
        setUserParam(params, "create_time_end", createTimeEnd);
        setUserParam(params, "create_time_start", createTimeStart);
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setUpdateTimeEnd(Long updateTimeEnd) {
        this.updateTimeEnd = updateTimeEnd;
    }

    public void setUpdateTimeStart(Long updateTimeStart) {
        this.updateTimeStart = updateTimeStart;
    }

    public void setCreateTimeEnd(Long createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public void setCreateTimeStart(Long createTimeStart) {
        this.createTimeStart = createTimeStart;
    }
}