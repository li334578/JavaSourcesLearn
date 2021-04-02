package main.java.com.company.JavaSourceLearn.sources.functionalInterface.stream_test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-17 14:33:05
 */
public class Example1 {
    public static void main(String[] args) {
        Stream stream1 = Stream.of("hello", "world", "hello world");
        String[] strings = new String[]{"hello", "world", "hello world"};
        Stream stream2 = Stream.of(strings);

        IntStream.range(1, 10).forEach(System.out::println);
        System.out.println("--------");
        IntStream.rangeClosed(1, 10).forEach(System.out::println);
        System.out.println("--------");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().map(item -> item * 2).reduce(0, (a, b) -> a + b));

        System.out.println(list.stream().map(item -> item * 2).reduce(0, Integer::sum));
    }
}
