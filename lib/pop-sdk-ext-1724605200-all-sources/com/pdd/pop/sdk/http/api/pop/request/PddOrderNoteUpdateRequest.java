package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddOrderNoteUpdateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddOrderNoteUpdateRequest extends PopBaseHttpRequest<PddOrderNoteUpdateResponse> {

    /**
     * 订单备注
     */
    @JsonProperty("note")
    private String note;

    /**
     * 备注标记：1-红色，2-黄色，3-绿色，4-蓝色，5-紫色，tag与tag_name关联，都入参或都不入参
     */
    @JsonProperty("tag")
    private Integer tag;

    /**
     * 标记名称；长度最大为3个字符，tag与tag_name关联，都入参或都不入参
     */
    @JsonProperty("tag_name")
    private String tagName;

    /**
     * 订单号
     */
    @JsonProperty("order_sn")
    private String orderSn;

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
        return "pdd.order.note.update";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddOrderNoteUpdateResponse> getResponseClass() {
        return PddOrderNoteUpdateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "note", note);
        setUserParam(params, "tag", tag);
        setUserParam(params, "tag_name", tagName);
        setUserParam(params, "order_sn", orderSn);
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
}