package com.company.JavaSourceLearn.sources.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-14 20:40:29
 */
@FunctionalInterface
interface MyInterface1 {
    void apply();
}

public class Test1 {
    public void mymethod1(MyInterface1 myInterface1) {
        System.out.println("before");
        myInterface1.apply();
        System.out.println("after");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.mymethod1(()-> System.out.println("myMethod"));

        List<Integer> list = Arrays.asList(1,1,2,3,5,8,13,21);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        list.forEach(i-> System.out.println(i));
        // method references ::->consumer
        list.forEach(System.out::println);


        List<String> list1 = Arrays.asList("hello","world","hello world");
        list1.stream().map(item->item.toUpperCase()).forEach(System.out::println);
        list1.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
