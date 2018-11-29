package com.cheng.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author cheng
 *         2018/11/29 17:54
 */
public class StreamTest2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "cheng", "world");

        NullPointerException nullPointerException = new NullPointerException("my exception");

        try (Stream<String> stream = list.stream()) {
            stream
                    .onClose(() -> {
                        System.out.println("onClose1");
//                        throw new NullPointerException("first exception");
//                        throw nullPointerException;
                        throw new NullPointerException("first exception");
                    })
                    .onClose(() -> {
//                        System.out.println("onClose2");
//                        throw new ArithmeticException("second exception");
//                        throw nullPointerException;
                        throw new NullPointerException("second exception");
                    })
                    .forEach(System.out::println);
        }
    }
}
