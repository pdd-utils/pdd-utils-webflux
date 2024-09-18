//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pdd.pop.sdk.common.exception;

import com.pdd.pop.sdk.http.ClientErrorCode;
import lombok.Getter;

@Getter
public class PopClientException extends RuntimeException {

    private final ClientErrorCode errorCode;

    public PopClientException(ClientErrorCode errorCode) {
        this(errorCode, null);
    }

    public PopClientException(ClientErrorCode errorCode, Throwable e) {
        super(errorCode.getMessage(), e);
        this.errorCode = errorCode;
    }
}
