//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pdd.pop.sdk.http;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ClientErrorCode {
    SUC("0", "成功"),
    FAIL("1000", "失败"),
    ILLEGAL_HTTP_METHOD("1001", "非法Http方法"),
    HTTP_STATUS_FAIL("1002", "HTTP返回码失败"),
    ILLEGAL_PARAMETERS("1003", "非法参数"),
    TRANSFET_ERROR("1004", "对象转化失败"),
    DESTROY_CLIENT_ERROR("1005", "关闭客户端失败"),
    VALID_PLATFORM_TYPE("1006", "无效的网关类型"),
    JSON_PARSE_ERROR("1007", "JSON解析失败"),
    JSON_READ_ERROR("1008", "JSON读取失败"),


    ;

    private final String code;
    private final String message;

}
