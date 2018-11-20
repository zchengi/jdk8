package com.cheng.jdk8.stream;

import java.util.stream.IntStream;

/**
 * @author cheng
 *         2018/11/20 16:03
 */
public class StreamTest8 {
    public static void main(String[] args) {

        // 代码无限运行，处理 distinct
//        IntStream.iterate(0, i -> (i + 1) % 2).distinct().limit(6).forEach(System.out::println);

        // 更正
        IntStream.iterate(0, i -> (i + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
