package com.company.sources.functionalInterface.stream_test;

import com.sun.deploy.uitoolkit.SynthesizedEventListener;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-17 14:55:01
 */
public class Example2 {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("hello", "world", "hello world");
//        String[] strings1 = stringStream.toArray(length -> new String[length]);
//        Arrays.asList(strings1).forEach(System.out::println);

//        String[] strings2 = stringStream.toArray(String[]::new);
//        Arrays.asList(strings2).forEach(System.out::println);

//        List<String> collect = stringStream.collect(Collectors.toList());
//        collect.forEach(System.out::println);

//        List<String> collect = stringStream.collect(() -> new ArrayList<>(),
//                (tempList, item) -> tempList.add(item),
//                (resultList, tempList) -> resultList.addAll(tempList));
//        collect.forEach(System.out::println);

//        List<String> collect = stringStream.collect(ArrayList::new,
//                (tempList, item) -> tempList.add(item), (resultList, tempList) -> resultList.addAll(tempList));
//        collect.forEach(System.out::println);

//        List<String> collect = stringStream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        collect.forEach(System.out::println);

//        List<String> collect = stringStream.collect(Collectors.toCollection(LinkedList::new));
//        collect.forEach(System.out::println);

//        Set<String> collect = stringStream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(collect.getClass());
//        collect.forEach(System.out::println);
        String string = stringStream.map(item -> item + "-|-").collect(Collectors.joining());
        System.out.println(string);
    }
}
