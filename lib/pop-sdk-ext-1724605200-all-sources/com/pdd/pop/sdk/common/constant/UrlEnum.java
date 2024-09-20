package com.pdd.pop.sdk.common.constant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author shunsheng
 * @date 2022/2/24
 */
public enum UrlEnum {
    /** 开放平台 */
    OPEN(0, "https://", "gw-api.pinduoduo.com", "opengw-api.yangkeduo.com", "/api/router"),
    /** 方舟 */
    ARK(1, "https://", "ark-api.pinduoduo.com", "ark-api.yangkeduo.com", "/ark/router"),
    /** 文件 */
    FILE(2, "https://", "gw-upload.pinduoduo.com", "opengw-upload.yangkeduo.com", "/api/upload"),
    /** 消息 */
    MESSAGE(3, "wss://", "message-api.pinduoduo.com", "message-api.yangkeduo.com", "")
    ;
    private Integer code;
    private String protocol;
    private String mainDomain;
    private String backupDomain;
    private String router;

    /** 当前使用的是否是主域名 */
    private volatile boolean currentMain = true;

    UrlEnum(Integer code, String protocol, String mainDomain, String backupDomain, String router) {
        this.code = code;
        this.protocol = protocol;
        this.mainDomain = mainDomain;
        this.backupDomain = backupDomain;
        this.router = router;
    }

    public String getUrl() {
        return protocol + (currentMain ? mainDomain : backupDomain) + router;
    }

    public String getMainDomain() {
        return mainDomain;
    }

    public String getBackupDomain() {
        return backupDomain;
    }

    public void setCurrentMain(boolean currentMain) {
        this.currentMain = currentMain;
    }

    private static final Pattern DOMAIN_PATTERN = Pattern.compile("^((?:http|https|ws|wss)://)([^/\\s]+)([^\\s]*)$");

    private String getAnotherUrl(String url) {
        Matcher matcher = DOMAIN_PATTERN.matcher(url);
        if (matcher.matches()) {
            String originProtocol = matcher.group(1);
            String originDomain = matcher.group(2);
            if (mainDomain.equals(originDomain)) {
                return originProtocol + backupDomain + router;
            } else if (backupDomain.equals(originDomain)) {
                return originProtocol + mainDomain + router;
            }
        }
        return protocol + (currentMain ? backupDomain : mainDomain) + router;
    }
}
