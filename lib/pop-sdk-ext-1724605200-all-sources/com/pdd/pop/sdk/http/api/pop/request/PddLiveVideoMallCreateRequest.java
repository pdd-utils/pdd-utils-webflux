package com.pdd.pop.sdk.http.api.pop.request;

import com.pdd.pop.sdk.common.util.JsonUtil;
import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.api.pop.response.PddLiveVideoMallCreateResponse;
import com.pdd.pop.sdk.http.HttpMethod;
import com.pdd.pop.sdk.http.PopBaseHttpRequest;

import java.util.Map;

public class PddLiveVideoMallCreateRequest extends PopBaseHttpRequest<PddLiveVideoMallCreateResponse> {

    /**
     * 请求
     */
    @JsonProperty("request")
    private Request request;

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
        return "pdd.live.video.mall.create";
    }

    @Override
    public HttpMethod getHttpMethod() {
        return HttpMethod.POST;
    }

    @Override
    public Class<PddLiveVideoMallCreateResponse> getResponseClass() {
        return PddLiveVideoMallCreateResponse.class;
    }

    @Override
    protected void setUserParams(Map<String, String> params) {
        setUserParam(params, "request", request);
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public static class Request {

        /**
         * 视频封面，通过图片上传接口得到
         */
        @JsonProperty("cover")
        private String cover;

        /**
         * 视频标题，可以带话题
         */
        @JsonProperty("desc")
        private String desc;

        /**
         * 视频关联的商品，注意只能是当前商家的商品
         */
        @JsonProperty("goods_id")
        private Long goodsId;

        /**
         * 是否将发布的视频同步到商品讲解
         */
        @JsonProperty("sync_explanation_video")
        private Boolean syncExplanationVideo;

        /**
         * 通过视频上传接口得到，注意每次请求发布接口需要重新生成vid
         */
        @JsonProperty("vid")
        private String vid;

        public void setCover(String cover) {
            this.cover = cover;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setGoodsId(Long goodsId) {
            this.goodsId = goodsId;
        }

        public void setSyncExplanationVideo(Boolean syncExplanationVideo) {
            this.syncExplanationVideo = syncExplanationVideo;
        }

        public void setVid(String vid) {
            this.vid = vid;
        }

        @Override
        public String toString() {
            return JsonUtil.transferToJson(this);
        }
    }
}