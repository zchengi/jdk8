package com.cheng.jdk8.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Function 与 biFunction 函数式接口详解
 *
 * @author cheng
 *         2018/11/16 15:27
 */
public class FunctionTest2 {

    public int compute1(int a,
                        Function<Integer, Integer> function1,
                        Function<Integer, Integer> function2) {
        //  compose: 先调用 function2 然后调用 function1
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a,
                        Function<Integer, Integer> function1,
                        Function<Integer, Integer> function2) {
        //  andThen: 先调用 function1 然后调用 function2
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a, int b,
                        BiFunction<Integer, Integer, Integer> biFunction) {
        return biFunction.apply(a, b);
    }

    public int compute4(int a, int b,
                        BiFunction<Integer, Integer, Integer> biFunction,
                        Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }

    public static void main(String[] args) {

        FunctionTest2 test = new FunctionTest2();

//        System.out.println(test.compute1(2, value -> value * 3, value -> value * value));
//        System.out.println(test.compute2(2, value -> value * 3, value -> value * value));

//        System.out.println(test.compute3(1, 2, (value1, value2) -> value1 + value2));
//        System.out.println(test.compute3(1, 2, (value1, value2) -> value1 - value2));
//        System.out.println(test.compute3(1, 2, (value1, value2) -> value1 * value2));
//        System.out.println(test.compute3(1, 2, (value1, value2) -> value1 / value2));

        System.out.println(test.compute4(2, 3, (value1, value2) -> value1 + value2, value -> value * value));
    }
}
