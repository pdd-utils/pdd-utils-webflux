package com.pdd.pop.sdk.http;

import com.pdd.pop.sdk.common.util.JsonUtil;

import java.util.Map;
import java.util.TreeMap;

public abstract class PopBaseHttpRequest<T> {

    private Long timestamp;
    private String targetClientId;
    private String partnerId;

    private Map<String, String> headers;

    public Long getTimestamp() {
        if (timestamp == null) {
            timestamp = System.currentTimeMillis() / 1000;
        }
        return timestamp;
    }

    public abstract String getVersion();

    public abstract String getDataType();

    public abstract Integer getPlatform();

    public abstract String getType();

    public abstract HttpMethod getHttpMethod();

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public abstract Class<T> getResponseClass();

    public final Map<String, String> getParamsMap() {
        Map<String, String> paramsMap = new TreeMap<String, String>();
        paramsMap.put("version", getVersion());
        paramsMap.put("data_type", getDataType());
        paramsMap.put("type", getType());
        paramsMap.put("timestamp", getTimestamp().toString());
        if (targetClientId != null)
            paramsMap.put("target_client_id", targetClientId);
        if (partnerId != null)
            paramsMap.put("partner_id", partnerId);
        setUserParams(paramsMap);
        return paramsMap;
    }

    public void setTargetClientId(String targetClientId) {
        this.targetClientId = targetClientId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public FileItem getFileItem() {
        return null;
    }

    protected abstract void setUserParams(Map<String, String> params);

    protected final void setUserParam(Map<String, String> paramMap, String name, Object param) {
        if (param != null) {
            if (isPrimaryType(param)) {
                paramMap.put(name, String.valueOf(param));
            } else {
                paramMap.put(name, JsonUtil.transferToJson(param));
            }
        }
    }

    private boolean isPrimaryType(Object param) {
        if (param instanceof Boolean) {
            return true;
        }

        if (param instanceof Byte) {
            return true;
        }

        if (param instanceof Character) {
            return true;
        }

        if (param instanceof Short) {
            return true;
        }

        if (param instanceof Integer) {
            return true;
        }

        if (param instanceof Long) {
            return true;
        }

        if (param instanceof Float) {
            return true;
        }

        if (param instanceof Double) {
            return true;
        }

        if (param instanceof String) {
            return true;
        }

        return false;
    }
}
