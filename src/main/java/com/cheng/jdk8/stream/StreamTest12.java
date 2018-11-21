package com.cheng.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * stream分组与分区详解
 *
 * @author cheng
 *         2018/11/21 14:43
 */
public class StreamTest12 {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Hi", "Hello", "你好");
        List<String> list2 = Arrays.asList("cheng", "zhang", "zhi");

        List<String> result = list1.stream()
                .flatMap(item -> list2.stream().map(item2 -> item + " " + item2)).collect(Collectors.toList());
        System.out.println(result);
    }
}
