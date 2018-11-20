package com.cheng.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * @author cheng
 *         2018/11/20 14:13
 */
public class StreamTest3 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(list.stream().map(i -> 2 * i).reduce(0, Integer::sum));
    }
}
