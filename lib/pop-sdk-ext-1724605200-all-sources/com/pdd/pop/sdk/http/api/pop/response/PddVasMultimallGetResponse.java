package com.pdd.pop.sdk.http.api.pop.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;

import java.util.List;



public class PddVasMultimallGetResponse extends PopBaseHttpResponse {

    /**
     * 主店铺id
     */
    @JsonProperty("mall_id")
    private Long mallId;

    /**
     * 子店铺id列表
     */
    @JsonProperty("sub_mall_ids")
    private List<Long> subMallIds;

    public Long getMallId() {
        return mallId;
    }

    public List<Long> getSubMallIds() {
        return subMallIds;
    }
}