package com.company.sources.functionalInterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-16 14:16:19
 */
public class Example4 {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student();
        System.out.println(studentSupplier.get());
        Supplier<Student> studentSupplier1 = Student::new;
        System.out.println(studentSupplier1.get());
        Example4 example4 = new Example4();
        example4.method1(1, 2, (a, b) -> a + b);
        example4.method2(2, 3, (a, b) -> a - b);
        example4.method2(2, 3, (a, b) -> b - a);
        List<String> list = new ArrayList<>();
        List<String> list2 = null;
        Optional<List<String>> optionalStrings = Optional.of(list);
        optionalStrings.ifPresent(item -> System.out.println(item.size()));
        Optional<List<String>> optionalStrings1 = Optional.ofNullable(list2);
        optionalStrings1.ifPresent(item -> System.out.println(item.stream()));

        Optional<String> optionalS = Optional.empty();
        System.out.println(optionalS.orElse("123"));
        System.out.println(optionalS.orElseGet(() -> "123456"));

    }

    public void method1(int a, int b, BinaryOperator<Integer> binaryOperator) {
        System.out.println(binaryOperator.apply(a, b));
    }

    public void method2(int a, int b, Comparator<Integer> comparator) {
        System.out.println(BinaryOperator.maxBy(comparator).apply(a, b));
    }
}
