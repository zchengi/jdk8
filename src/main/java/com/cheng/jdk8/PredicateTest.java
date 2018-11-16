package com.cheng.jdk8;

import java.util.function.Predicate;

/**
 * @author cheng
 *         2018/11/16 16:23
 */
public class PredicateTest {
    public static void main(String[] args) {

        Predicate<String> predicate = p -> p.length() > 5;

        System.out.println(predicate.test("Hello"));
        System.out.println(predicate.test("Hello World"));
    }
}
