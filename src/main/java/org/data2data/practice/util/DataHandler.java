package org.data2data.practice.util;

import ch.qos.logback.core.encoder.ByteArrayUtil;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import org.apache.commons.lang3.ArrayUtils;

import java.nio.charset.StandardCharsets;

public class DataHandler {


    public static void main(String[] args) {
        byte[] buffer = new byte[0];
        buffer = ArrayUtils.addAll(buffer, "999999999999999".getBytes(StandardCharsets.UTF_8));
        buffer = ArrayUtils.addAll(buffer, "22222".getBytes(StandardCharsets.UTF_8));
        System.out.println(buffer.length);
    }
}
