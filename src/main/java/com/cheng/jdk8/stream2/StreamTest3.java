package com.cheng.jdk8.stream2;

import java.util.Arrays;
import java.util.List;

/**
 * 分割迭代器源码剖析
 *
 * @author cheng
 *         2018/11/30 14:21
 */
public class StreamTest3 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "cheng");

        list.stream().forEach(System.out::println);
    }
}
