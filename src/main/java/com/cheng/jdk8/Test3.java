package com.cheng.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Lambda 表达式是对象，他们必须依附于一类特别的对象类型——函数式接口;
 *
 * @author cheng
 *         2018/11/15 17:44
 */
public class Test3 {
    public static void main(String[] args) {

//        MyInterface1 i1 = () -> { };
//        System.out.println(i1.getClass().getInterfaces()[0]);
//
//        MyInterface2 i2 = () -> { };
//        System.out.println(i2.getClass().getInterfaces()[0]);
//
//        new Thread(() -> System.out.println("Hello World")).start();

        List<String> list = Arrays.asList("hello", "world", "hello world");

//        list.forEach(item-> System.out.println(item.toUpperCase()));

        List<String> list2 = new ArrayList<>();
//        list.forEach(item -> list2.add(item.toUpperCase()));
//        list2.forEach(System.out::println);

//        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
        // 简写
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}

@FunctionalInterface
interface MyInterface1 {

    void MyMethod1();
}

@FunctionalInterface
interface MyInterface2 {

    void MyMethod2();
}

