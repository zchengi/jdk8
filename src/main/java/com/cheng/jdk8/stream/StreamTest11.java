package com.cheng.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cheng
 *         2018/11/21 14:11
 */
public class StreamTest11 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello welcome", "world hello", "hello world hello", "hello welcome");

//        List<String[]> result = list.stream().map(item -> item.split(" " +
//                "")).distinct().collect(Collectors.toList());

//        list.forEach(item -> Arrays.asList(item).forEach(System.out::println));

        List<String> res = list.stream().map(item -> item.split(" ")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

        res.forEach(System.out::println);
    }
}
