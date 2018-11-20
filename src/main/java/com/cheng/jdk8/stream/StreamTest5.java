package com.cheng.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * stream 实例剖析
 *
 * @author cheng
 *         2018/11/20 15:08
 */
public class StreamTest5 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "cheng", "good", "test");

        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("----------");

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        list2.stream().map(item -> item * item).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("----------");

        Stream<List<Integer>> stream = Stream.of(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6, 7));

        stream.flatMap(theList -> theList.stream()
                .map(item -> item * item)).forEach(System.out::println);
    }
}
