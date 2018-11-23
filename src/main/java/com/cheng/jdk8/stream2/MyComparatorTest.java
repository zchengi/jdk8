package com.cheng.jdk8.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 比较器与类型推断特例
 *
 * @author cheng
 *         2018/11/23 12:01
 */
public class MyComparatorTest {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "cheng", "welcome");

        // 按照字符串长度升序排序
//        Collections.sort(list, (item1, item2) -> item1.length() - item2.length());

        // 按照字符串长度降序排序
//        Collections.sort(list, (item1, item2) -> item2.length() - item1.length());

        // 按照字符串长度降序排序
//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());
        // 不能进行类型推断，因为编译器不知道 类型是 String 还是 String 的父类 Object
//        Collections.sort(list, Comparator.comparingInt(item -> item.length()).reversed());
//        Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).reversed());
        list.sort(Comparator.comparingInt(String::length).reversed());

        // 按照字符串长度升序排序，如果字符串长度相同，按照字母顺序排序
//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing((item1, item2) -> item1.compareToIgnoreCase(item2)));
//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));
//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));
//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String::toLowerCase, Comparator.reverseOrder()));


//        Collections.sort(list, Comparator.comparingInt(String::length).reversed()
//                .thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder())));

        Collections.sort(list, Comparator.comparingInt(String::length).reversed().
                thenComparing(Comparator.comparing(String::toLowerCase, Comparator.reverseOrder()))
                // 不进行比较，因为上次比较已经没有 相等 的元素
                .thenComparing(Comparator.reverseOrder()));

        System.out.println(list);
    }
}
