package com.Demo.utils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;


public class HttpUtil {

    private String value;

    public HttpUtil() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static <T> T toModel(Class<T> tClass, BufferedReader reader) throws IOException {
        HttpUtil httpUtil = new HttpUtil();
        httpUtil.setValue(httpUtil.of(reader));
        return new ObjectMapper().readValue(httpUtil.getValue(), tClass);
    }

    public String of(BufferedReader reader) throws IOException {
        String line = null;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }
}
