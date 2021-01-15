package com.company.sources.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-15 21:08:24
 */
public class Example3 {

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);
        List<Person> people = Arrays.asList(person1, person2, person3);
        people.stream().filter(item -> item.getName().equals("lisi")).forEach(System.out::println);
        people.stream().filter(item -> item.getAge() >= 30).forEach(System.out::println);
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        example3.method1(list1, item -> item % 2 == 0);
        people.stream().filter(Predicate.isEqual("zhangsan")).forEach(System.out::println);
        System.out.println("---------------");
        list1.stream().filter(Predicate.isEqual(1)).forEach(System.out::println);
    }


    public void method1(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(predicate).forEach(System.out::println);
    }
}
