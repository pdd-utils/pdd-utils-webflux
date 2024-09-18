//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pdd.pop.sdk.common.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
@RequiredArgsConstructor
public enum UrlEnum {
    OPEN(0, "https://", "gw-api.pinduoduo.com", "opengw-api.yangkeduo.com", "/api/router"),
    ARK(1, "https://", "ark-api.pinduoduo.com", "ark-api.yangkeduo.com", "/ark/router"),
    FILE(2, "https://", "gw-upload.pinduoduo.com", "opengw-upload.yangkeduo.com", "/api/upload"),
    MESSAGE(3, "wss://", "message-api.pinduoduo.com", "message-api.yangkeduo.com", "");

    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^((?:http|https|ws|wss)://)([^/\\s]+)([^\\s]*)$");
    private final Integer code;
    private final String protocol;
    private final String mainDomain;
    private final String backupDomain;
    private final String router;
    private final boolean currentMain = true;

    public String getUrl() {
        return this.protocol + (this.currentMain ? this.mainDomain : this.backupDomain) + this.router;
    }

    private String getAnotherUrl(String url) {
        Matcher matcher = DOMAIN_PATTERN.matcher(url);
        if (matcher.matches()) {
            String originProtocol = matcher.group(1);
            String originDomain = matcher.group(2);
            if (this.mainDomain.equals(originDomain)) {
                return originProtocol + this.backupDomain + this.router;
            }

            if (this.backupDomain.equals(originDomain)) {
                return originProtocol + this.mainDomain + this.router;
            }
        }

        return this.protocol + (this.currentMain ? this.backupDomain : this.mainDomain) + this.router;
    }
}
