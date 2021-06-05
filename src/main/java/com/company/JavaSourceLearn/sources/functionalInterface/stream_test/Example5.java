package com.company.JavaSourceLearn.sources.functionalInterface.stream_test;

import com.company.JavaSourceLearn.sources.functionalInterface.Person;

import java.util.*;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-06-04 20:12:22
 */
public class Example5 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(new Person("张1", 1),
                new Person("张2", 2),
                new Person("张1", 3));
        Map<String, List<Person>> map = list.stream().reduce(new HashMap<>(), (h1, k2) -> {
            h1.computeIfAbsent(k2.getName(), v -> new ArrayList<>()).add(k2);
            return h1;
        }, (v1, v2) -> v1);
        map.keySet().forEach(item -> System.out.println(item + ":" + map.get(item)));
    }
}
