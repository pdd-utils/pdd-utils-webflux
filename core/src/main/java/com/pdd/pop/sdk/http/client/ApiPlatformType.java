//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pdd.pop.sdk.http.client;


import com.pdd.pop.sdk.common.exception.PopClientException;
import com.pdd.pop.sdk.http.ClientErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ApiPlatformType {
    OPEN(0, "开放平台"),
    ARK(1, "方舟"),
    FILE(2, "文件");

    private final Integer code;
    private final String desc;

    public static ApiPlatformType getByCode(Integer code) {
        ApiPlatformType[] var1 = values();
        for (ApiPlatformType value : var1) {
            if (value.getCode()
                    .equals(code)) {
                return value;
            }
        }
        throw new PopClientException(ClientErrorCode.VALID_PLATFORM_TYPE);
    }

}
