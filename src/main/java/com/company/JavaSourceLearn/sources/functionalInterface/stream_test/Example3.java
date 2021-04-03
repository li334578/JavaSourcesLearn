package com.company.JavaSourceLearn.sources.functionalInterface.stream_test;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-17 15:26:22
 */
public class Example3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "function", "apple", "test", "consumer");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("----------------");
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5));
//        stream.flatMap(tempList -> tempList.stream()).map(item -> item * item).forEach(System.out::println);
        System.out.println("----------------");
        stream.flatMap(Collection::stream).map(item -> item * item).forEach(System.out::println);

        Stream<String> stringStream = Stream.generate(UUID.randomUUID()::toString);
        stringStream.findFirst().ifPresent(System.out::println);
        Stream<Double> stream1 = Stream.generate(Math::random);
        stream1.findFirst().ifPresent(System.out::println);
    }
}
