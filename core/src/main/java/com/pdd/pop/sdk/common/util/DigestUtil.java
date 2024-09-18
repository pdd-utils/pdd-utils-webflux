//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pdd.pop.sdk.common.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class DigestUtil {
    public DigestUtil() {
    }

    public static String md5(String str) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] result = md.digest();
            StringBuilder sb = new StringBuilder(32);

            for (byte b : result) {
                int val = b & 255;
                if (val <= 15) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(val));
            }

            return sb.toString();
        } catch (Exception var6) {
            throw new AssertionError();
        }
    }
}
