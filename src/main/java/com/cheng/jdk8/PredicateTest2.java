package com.cheng.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author cheng
 *         2018/11/16 16:28
 */
public class PredicateTest2 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        PredicateTest2 predicateTest2 = new PredicateTest2();

        // 所有偶数
        predicateTest2.conditionFilter(list, integer -> integer % 2 == 0);
        System.out.println("----------");
        // 所有奇数
        predicateTest2.conditionFilter(list, integer -> integer % 2 == 1);
        System.out.println("----------");
        // 所有大于 5 的数字
        predicateTest2.conditionFilter(list, integer -> integer > 5);
        System.out.println("----------");
        // 所有小于 3 的数字
        predicateTest2.conditionFilter(list, integer -> integer < 3);
        System.out.println("----------");
        // 所有数字
        predicateTest2.conditionFilter(list, integer -> true);
        System.out.println("----------");
        // 不打印任何数字
        predicateTest2.conditionFilter(list, integer -> false);
        System.out.println("----------");

        // 所有大于5并且是偶数的数字
        predicateTest2.conditionFilter2(list,
                integer -> integer > 5,
                integer -> integer % 2 == 0);
        System.out.println("----------");

        // Predicate 的 isEqual 方法
        System.out.println(predicateTest2.isEquals("test").test("test"));
        System.out.println(predicateTest2.isEquals("test").test("test no"));
//        System.out.println(predicateTest2.isEquals(new Date()).test(new Date()));
    }

    public void conditionFilter(List<Integer> list, Predicate<Integer> predicate) {

        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public void conditionFilter2(List<Integer> list,
                                 Predicate<Integer> predicate,
                                 Predicate<Integer> predicate2) {
        for (Integer integer : list) {
//            if (predicate.and(predicate2).test(integer)) {
//            if (predicate.or(predicate2).test(integer)) {
            if (predicate.and(predicate2).negate().test(integer)) {
                System.out.println(integer);
            }
        }
    }

    public Predicate<String> isEquals(Object object) {
//    public Predicate<Date> isEquals(Object object) {
        return Predicate.isEqual(object);
    }
}
