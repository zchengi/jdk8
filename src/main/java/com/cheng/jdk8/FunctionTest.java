package com.cheng.jdk8;

import java.util.function.Function;

/**
 * @author cheng
 *         2018/11/16 15:06
 */
public class FunctionTest {

    public int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    public String convert(int s, Function<Integer, String> function) {
        return function.apply(s);
    }

    public int method1(int a) {
        return 2 * a;
    }

    public int method2(int a) {
        return 5 + a;
    }

    public int method3(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        FunctionTest test = new FunctionTest();

        System.out.println(test.compute(1, value -> 2 * value));
        System.out.println(test.compute(2, value -> 5 + value));
        System.out.println(test.compute(3, value -> value * value));

        System.out.println(test.convert(5, value -> String.valueOf(value + " Hello World")));

        System.out.println(test.method1(1));
        System.out.println(test.method2(2));
        System.out.println(test.method3(3));
    }
}
