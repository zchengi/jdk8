package com.cheng.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * @author cheng
 *         2018/11/18 19:07
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {

        BinaryOperatorTest test = new BinaryOperatorTest();
        System.out.println(test.compute(10, 20, (a, b) -> a + b));
        System.out.println(test.compute(10, 20, (a, b) -> a - b));
        System.out.println("----------");

        System.out.println(test.getShort("abc", "abcd", (a, b) -> a.length() - b.length()));
        System.out.println(test.getShort("dbc", "bcd", (a, b) -> a.charAt(0) - b.charAt(0)));
    }

    public int compute(int a, int b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }
}
