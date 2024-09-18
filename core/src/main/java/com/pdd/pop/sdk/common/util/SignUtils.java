//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pdd.pop.sdk.common.util;


import java.util.Map;
import java.util.TreeMap;

public final class SignUtils {
    public SignUtils() {
    }

    public static boolean checkSign(Map<String, String> requestParams, String clientSecret, String sign) {
        return sign != null && sign.equals(sign(requestParams, clientSecret));
    }

    public static String sign(Map<String, String> requestParams, String clientSecret) {
        return sign(requestParams, clientSecret, "md5");
    }

    public static String sign(Map<String, String> requestParams, String clientSecret, String signMethod) {
        String signSrc = buildSignSource(requestParams, clientSecret);
        return sign(signSrc, signMethod);
    }

    public static String buildSignSource(Map<String, String> requestParams, String clientSecret) {
        if (null != requestParams && !requestParams.isEmpty()) {
            Map<String, String> signSrcMap = requestParams;
            if (!(requestParams instanceof TreeMap)) {
                signSrcMap = new TreeMap<>(requestParams);
            }

            StringBuilder signSrcBuilder = (new StringBuilder()).append(clientSecret);
            for (Map.Entry<String, String> entry : signSrcMap.entrySet()) {
                signSrcBuilder.append(entry.getKey())
                        .append(entry.getValue());
            }
            signSrcBuilder.append(clientSecret);
            return signSrcBuilder.toString();
        } else {
            return "";
        }
    }

    public static String sign(String signSrc, String signMethod) {
        if ("md5".equals(signMethod)) {
            return DigestUtil.md5(signSrc)
                    .toUpperCase();
        } else {
            throw new RuntimeException("Not Support signMethod:" + signMethod);
        }
    }
}
