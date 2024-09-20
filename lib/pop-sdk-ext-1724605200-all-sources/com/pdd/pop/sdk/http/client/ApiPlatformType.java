package com.pdd.pop.sdk.http.client;

import com.pdd.pop.sdk.common.exception.PopClientException;
import com.pdd.pop.sdk.http.ClientErrorCode;

public enum ApiPlatformType {
    OPEN(0, "开放平台"),
    ARK(1, "方舟"),
    FILE(2, "文件");

    private Integer code;
    private String desc;

    ApiPlatformType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static ApiPlatformType getByCode(Integer code) {
        for (ApiPlatformType value : ApiPlatformType.values()) {
            if (value.getCode().equals(code))
                return value;
        }
        throw new PopClientException(ClientErrorCode.VALID_PLATFORM_TYPE);
    }
}
