package com.company.JavaSourceLearn.sources.functionalInterface.defaultMethod;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-17 14:09:56
 */
public interface MyInterface1 {
    default void MyMethod(){
        System.out.println("MyInterface1");
    }
}
