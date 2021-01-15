package com.company.sources.functionalInterface;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : FunctionalInterface
 * @date : 2021-01-14 20:34:55
 */
public class Example1 {
    public static void main(String[] args) {
        // StringComparator
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
//        Collections.sort(names,(o1,o2)->o2.compareTo(o1));
        Collections.sort(names, Comparator.reverseOrder());
        System.out.println(names);

        // function
        Example1 example1 = new Example1();
        System.out.println(example1.method1(1, item -> 2 * item));

        System.out.println(example1.method2(10, item -> item + "个点"));
    }

    public int method1(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    public String method2(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
