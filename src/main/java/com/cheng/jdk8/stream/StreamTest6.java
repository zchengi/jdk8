package com.cheng.jdk8.stream;

import java.util.stream.Stream;

/**
 * @author cheng
 *         2018/11/20 15:19
 */
public class StreamTest6 {
    public static void main(String[] args) {

//        Stream<String> stream = Stream.generate(UUID.randomUUID()::toString);
//        Stream<String> stream = Stream.empty();
//        stream.findFirst().ifPresent(System.out::println);

        // iterate 生成一个 无限串行流
//        Stream.iterate(1, item -> item + 1).limit(6).forEach(System.out::println);


        // 找出流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中前两个元素，接着再取流中前两个元素，最后求流中元素总和
//        int res = Stream.iterate(1, item -> item + 2).limit(6)
//                .filter(i -> i > 2).mapToInt(i -> i * 2).skip(2).limit(2).sum();
//        System.out.println(res);

//        Stream.iterate(1, item -> item + 2).limit(6)
//                .filter(i -> i > 2).mapToInt(i -> i * 2).skip(2).limit(2).min().ifPresent(System.out::println);


//        IntSummaryStatistics intSummaryStatistics = Stream.iterate(1, item -> item + 2).limit(6)
//                .filter(i -> i > 2).mapToInt(i -> i * 2).skip(2).limit(2).summaryStatistics();

//        System.out.println(intSummaryStatistics.getMin());
//        System.out.println(intSummaryStatistics.getCount());
//        System.out.println(intSummaryStatistics.getMax());
//        System.out.println(intSummaryStatistics.getAverage());


        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);

//        System.out.println(stream);
//        System.out.println(stream.filter(item -> item > 2));
//        System.out.println(stream.distinct());

        System.out.println(stream);
        Stream<Integer> stream2 = stream.filter(item -> item > 2);
        System.out.println(stream2);
        Stream<Integer> stream3 = stream2.distinct();
        System.out.println(stream3);
    }
}
