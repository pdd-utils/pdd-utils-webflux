package com.pdd.pop.sdk.http.api.pop.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pdd.pop.sdk.http.PopBaseHttpResponse;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Data
public class PddPopAuthTokenCreateResponse extends PopBaseHttpResponse {

    /**
     *
     */
    @JsonProperty("pop_auth_token_create_response")
    private PopAuthTokenCreateResponse popAuthTokenCreateResponse;

    @Getter
    @ToString
    public static class PopAuthTokenCreateResponse {

        /**
         * access_token
         */
        @JsonProperty("access_token")
        private String accessToken;

        /**
         * access_token过期时间点
         */
        @JsonProperty("expires_at")
        private Long expiresAt;

        /**
         * access_token过期时间段，10（表示10秒后过期）
         */
        @JsonProperty("expires_in")
        private Integer expiresIn;

        /**
         * 商家店铺id
         */
        @JsonProperty("owner_id")
        private String ownerId;

        /**
         * 商家账号名称
         */
        @JsonProperty("owner_name")
        private String ownerName;

        /**
         * r1级别API或字段的访问过期时间点
         */
        @JsonProperty("r1_expires_at")
        private Long r1ExpiresAt;

        /**
         * r1级别API或字段的访问过期时间；	 10（表示10秒后过期）
         */
        @JsonProperty("r1_expires_in")
        private Integer r1ExpiresIn;

        /**
         * r2级别API或字段的访问过期时间点
         */
        @JsonProperty("r2_expires_at")
        private Long r2ExpiresAt;

        /**
         * r2级别API或字段的访问过期时间；10（表示10秒后过期）
         */
        @JsonProperty("r2_expires_in")
        private Integer r2ExpiresIn;

        /**
         * refresh token，可用来刷新access_token
         */
        @JsonProperty("refresh_token")
        private String refreshToken;

        /**
         * Refresh token过期时间点
         */
        @JsonProperty("refresh_token_expires_at")
        private Long refreshTokenExpiresAt;

        /**
         * refresh_token过期时间段，10表示10秒后过期
         */
        @JsonProperty("refresh_token_expires_in")
        private Integer refreshTokenExpiresIn;

        /**
         * 接口列表
         */
        @JsonProperty("scope")
        private List<String> scope;

        /**
         * w1级别API或字段的访问过期时间点
         */
        @JsonProperty("w1_expires_at")
        private Long w1ExpiresAt;

        /**
         * w1级别API或字段的访问过期时间；	 10（表示10秒后过期）
         */
        @JsonProperty("w1_expires_in")
        private Integer w1ExpiresIn;

        /**
         * w2级别API或字段的访问过期时间点
         */
        @JsonProperty("w2_expires_at")
        private Long w2ExpiresAt;

        /**
         * w2级别API或字段的访问过期时间；10（表示10秒后过期）
         */
        @JsonProperty("w2_expires_in")
        private Integer w2ExpiresIn;
    }
}
