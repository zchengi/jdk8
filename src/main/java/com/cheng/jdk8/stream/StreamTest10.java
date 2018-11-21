package com.cheng.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author cheng
 *         2018/11/21 14:01
 */
public class StreamTest10 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "cheng");

//        list.stream().mapToInt(String::length).filter(length -> length == 5).findFirst().ifPresent(System.out::println);

        list.stream().mapToInt(item -> {

            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length == 5).findFirst().ifPresent(System.out::println);
    }
}
