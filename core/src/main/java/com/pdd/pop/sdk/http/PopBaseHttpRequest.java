//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pdd.pop.sdk.http;


import com.pdd.pop.sdk.common.util.JsonUtil;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.TreeMap;

@Getter
@Setter
public abstract class PopBaseHttpRequest<T> {
    private Long timestamp;
    private String targetClientId;
    private String partnerId;
    private Map<String, String> headers;

    public PopBaseHttpRequest() {
    }

    public abstract Integer getPlatform();


    public abstract Class<T> getResponseClass();

    public final Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<>();
        paramsMap.put("version", this.getVersion());
        paramsMap.put("data_type", this.getDataType());
        paramsMap.put("type", this.getType());
        paramsMap.put("timestamp", this.getTimestamp()
                .toString());
        if (this.targetClientId != null) {
            paramsMap.put("target_client_id", this.targetClientId);
        }

        if (this.partnerId != null) {
            paramsMap.put("partner_id", this.partnerId);
        }

        this.setUserParams(paramsMap);
        return paramsMap;
    }

    public Long getTimestamp() {
        if (this.timestamp == null) {
            this.timestamp = System.currentTimeMillis() / 1000L;
        }

        return this.timestamp;
    }

    public abstract String getVersion();

    public abstract String getDataType();

    public abstract String getType();

    protected abstract void setUserParams(Map<String, String> var1);


    protected final void setUserParam(Map<String, String> paramMap, String name, Object param) {
        if (param != null) {
            if (this.isPrimaryType(param)) {
                paramMap.put(name, String.valueOf(param));
            } else {
                paramMap.put(name, JsonUtil.transferToJson(param));
            }
        }

    }

    private boolean isPrimaryType(Object param) {
        if (param instanceof Boolean) {
            return true;
        } else if (param instanceof Byte) {
            return true;
        } else if (param instanceof Character) {
            return true;
        } else if (param instanceof Short) {
            return true;
        } else if (param instanceof Integer) {
            return true;
        } else if (param instanceof Long) {
            return true;
        } else if (param instanceof Float) {
            return true;
        } else if (param instanceof Double) {
            return true;
        } else {
            return param instanceof String;
        }
    }
}
