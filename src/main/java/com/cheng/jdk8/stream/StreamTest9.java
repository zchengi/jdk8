package com.cheng.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @author cheng
 *         2018/11/21 13:54
 */
public class StreamTest9 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(5000000);
        List<String> list2 = new ArrayList<>(5000000);

        for (int i = 0; i < 5000000; i++) {
            String uuid = UUID.randomUUID().toString();
            list.add(uuid);
            list2.add(uuid);
        }

        System.out.println("串行流开始排序");

        long startTime = System.nanoTime();
        list.stream().sorted().count();
        long endTime = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("排序耗时: " + millis + "ms");
        System.out.println("串行流结束排序");

        System.out.println("并行流开始排序");

        startTime = System.nanoTime();
        list2.parallelStream().sorted().count();
        endTime = System.nanoTime();

        millis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);

        System.out.println("排序耗时: " + millis + "ms");
        System.out.println("并行流结束排序");
    }
}
