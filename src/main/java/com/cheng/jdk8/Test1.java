package com.cheng.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * 遍历 list
 *
 * @author cheng
 *         2018/11/15 17:01
 */
public class Test1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7);

        // version 1
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // version 2
        for (Integer i : list) {
            System.out.println(i);
        }

        // version 3 (Java8)
        list.forEach(System.out::println);
    }
}
