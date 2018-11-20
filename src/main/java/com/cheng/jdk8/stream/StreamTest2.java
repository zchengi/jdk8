package com.cheng.jdk8.stream;

import java.util.stream.IntStream;

/**
 *
 *
 * @author cheng
 *         2018/11/20 14:09
 */
public class StreamTest2 {
    public static void main(String[] args) {

        IntStream.of(5, 6, 7, 8, 10).forEach(System.out::println);
        System.out.println("----------");

        IntStream.range(3, 8).forEach(System.out::println);
        System.out.println("----------");

        IntStream.rangeClosed(3, 8).forEach(System.out::println);
        System.out.println("----------");
    }
}
