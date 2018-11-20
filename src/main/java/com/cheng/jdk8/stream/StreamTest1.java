package com.cheng.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * stream介绍与操作方式详解
 *
 * @author cheng
 *         2018/11/20 14:05
 */
public class StreamTest1 {
    public static void main(String[] args) {

        // 1. Stream.of 创建流
        Stream stream1 = Stream.of("hello", "world", "cheng");

        // 2. 数组方式 创建流
        String[] arr = {"hello", "world", "cheng"};
        Stream stream2 = Stream.of(arr);
        Stream stream3 = Arrays.stream(arr);

        // 3. 集合方式 创建流
        List<String> list = Arrays.asList(arr);
        Stream stream4 = list.stream();
    }
}
