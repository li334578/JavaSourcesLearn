package com.company.JavaSourceLearn.sources.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-17 13:59:35
 */
public class Example7 {

    public String getAppendString(Supplier<String> stringSupplier) {
        return stringSupplier.get() + "_test";
    }

    public String getAppendString(String str, Function<String, String> function) {
        return function.apply(str);
    }

    public static void main(String[] args) {
        Example7 example7 = new Example7();
        List<String> list = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
        System.out.println(example7.getAppendString(String::new));
        System.out.println(example7.getAppendString("hello", String::new));
    }
}
