//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.pdd.pop.sdk.common.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.json.JsonReadFeature;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.pdd.pop.sdk.common.exception.PopClientException;
import com.pdd.pop.sdk.http.ClientErrorCode;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.StringWriter;

@Slf4j
public class JsonUtil {
    private static final JsonFactory jsonFactory = new JsonFactory();
    private static final ObjectMapper defaultObjectMapper = createObjectMapper();

    public JsonUtil() {
    }

    public static ObjectMapper createObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        objectMapper.registerModule(module);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, false);
        objectMapper.enable(JsonReadFeature.ALLOW_UNESCAPED_CONTROL_CHARS.mappedFeature());
        objectMapper.enable(JsonReadFeature.ALLOW_UNQUOTED_FIELD_NAMES.mappedFeature());
        objectMapper.enable(JsonReadFeature.ALLOW_SINGLE_QUOTES.mappedFeature());
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    public static <T> String transferToJson(T value) {
        StringWriter sw = new StringWriter();

        try (JsonGenerator gen = jsonFactory.createGenerator(sw)) {
            defaultObjectMapper.writeValue(gen, value);
            return sw.toString();
        } catch (IOException e) {
            throw new PopClientException(ClientErrorCode.JSON_PARSE_ERROR, e);
        }
    }

    public static <T> T transferToObj(String jsonString, Class<T> valueType) {
        T value = null;
        if (jsonString != null && !jsonString.isEmpty()) {
            try {
                value = defaultObjectMapper.readValue(jsonString, valueType);
            } catch (IOException e) {
                throw new PopClientException(ClientErrorCode.JSON_READ_ERROR, e);
            }
        }
        return value;
    }

    public static <T> T transferToObj(String jsonString, TypeReference<T> typeReference) {
        if (jsonString != null && !jsonString.isEmpty() && typeReference != null) {
            try {
                return defaultObjectMapper.readValue(jsonString, typeReference);
            } catch (IOException e) {
                throw new PopClientException(ClientErrorCode.JSON_READ_ERROR, e);
            }
        } else {
            throw new PopClientException(ClientErrorCode.JSON_READ_ERROR);
        }
    }
}
