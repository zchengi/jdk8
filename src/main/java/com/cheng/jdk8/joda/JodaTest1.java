package com.cheng.jdk8.joda;

import org.joda.primitives.list.IntList;
import org.joda.primitives.list.impl.ArrayIntList;

/**
 * joda-primitives
 *
 * @author cheng
 *         2018/12/5 12:08
 */
public class JodaTest1 {
    public static void main(String[] args) {

        IntList intList = new ArrayIntList();

        intList.add(1);
        intList.add(2);

        intList.forEach(System.out::println);
    }
}
