package com.company.JavaSourceLearn.sources.functionalInterface;


import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : function
 * @date : 2021-01-15 20:34:16
 */
public class Example2 {
    public static void main(String[] args) {
        Example2 example2 = new Example2();
        System.out.println(example2.method1(2, value -> value * 3, value -> value * value));
        System.out.println(example2.method2(2, value -> value * 3, value -> value * value));
        System.out.println(example2.method3(2, 3, (a, b) -> a + b));
        System.out.println(example2.method3(2, 3, (a, b) -> a - b));
        System.out.println(example2.method3(2, 3, (a, b) -> a * b));
        System.out.println(example2.method3(2, 3, (a, b) -> a / b));

        System.out.println(example2.method4(2, 3, (a, b) -> a + b, a -> a * a));
    }

    public int method1(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int method2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    public int method3(int a, int b, BiFunction<Integer, Integer, Integer> function) {
        return function.apply(a, b);
    }

    public int method4(int a, int b, BiFunction<Integer, Integer, Integer> biFunction, Function<Integer, Integer> function) {
        return biFunction.andThen(function).apply(a, b);
    }
}
