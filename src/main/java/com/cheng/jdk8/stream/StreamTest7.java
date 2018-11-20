package com.cheng.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * stream陷阱操作
 *
 * @author cheng
 *         2018/11/20 15:57
 */
public class StreamTest7 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "cheng");

//        list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1)).forEach(System.out::println);

        list.stream().map(item -> {
            String result = item.substring(0, 1).toUpperCase() + item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);
    }
}
