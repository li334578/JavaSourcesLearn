package com.company.sources.functionalInterface.defaultMethod;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-17 14:10:23
 */
public interface MyInterface2 {
    default void MyMethod(){
        System.out.println("MyInterface2");
    }
}
