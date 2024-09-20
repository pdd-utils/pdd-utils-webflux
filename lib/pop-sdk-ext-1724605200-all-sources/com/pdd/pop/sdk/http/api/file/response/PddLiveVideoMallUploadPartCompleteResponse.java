package com.pdd.pop.sdk.http.api.file.response;

import com.pdd.pop.ext.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;




public class PddLiveVideoMallUploadPartCompleteResponse extends PopBaseHttpResponse {

    /**
     * 
     */
    @JsonProperty("response")
    private Response response;

    public Response getResponse() {
        return response;
    }

    public static class Response {

        /**
         * 创建的视频资源对应的vid
         */
        @JsonProperty("video_id")
        private String videoId;

        public String getVideoId() {
            return videoId;
        }
    }
}