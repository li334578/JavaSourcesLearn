package com.company.JavaSourceLearn.sources.functionalInterface.stream_test;

import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-17 15:51:30
 */
public class Example4 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.generate(UUID.randomUUID()::toString).limit(1);
        stringStream.findFirst().ifPresent(System.out::println);
        Stream<Double> doubleStream = Stream.generate(Math::random);
        doubleStream.findFirst().ifPresent(System.out::println);
        Random random = new Random();
        Stream<Integer> integerStream1 = Stream.generate(random::nextInt).limit(1);
        integerStream1.findFirst().ifPresent(System.out::println);

        Stream<Integer> integerStream2 = Stream.iterate(1, item -> item + 2).limit(6);
        integerStream2.forEach(System.out::println);

        Integer reduce = Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).map(item -> item * 2).skip(2).limit(2).reduce(0, Integer::sum);
        int reduce2 = Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum();
        System.out.println(reduce);
        System.out.println(reduce2);
        System.out.println("-----");
        Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).min().ifPresent(System.out::println);
        System.out.println("-----");
        IntSummaryStatistics intSummaryStatistics = Stream.iterate(1, item -> item + 2).limit(6).filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getCount());
        // stream 每次中间操作都会返回一个新的stream流 原有的流会被关闭
    }
}
