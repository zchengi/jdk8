package com.cheng.jdk8;

import java.util.Optional;

/**
 * @author cheng
 *         2018/11/18 19:32
 */
public class OptionalTest {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Hello");
//        Optional<String> optional = Optional.ofNullable("Hello");

//        if (optional.ifPresent()) {
//            System.out.println(optional.get());
//        }

        // 推荐 Optional 使用方式
//        optional.ifPresent(item -> System.out.println(item));
        optional.ifPresent(System.out::println);
        System.out.println("----------");

        System.out.println(optional.orElse("world"));
        System.out.println("----------");

        System.out.println(optional.orElseGet(() -> "zzz"));
        System.out.println("----------");
    }
}
