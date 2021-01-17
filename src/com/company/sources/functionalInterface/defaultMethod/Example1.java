package com.company.sources.functionalInterface.defaultMethod;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-17 14:09:39
 */
public class Example1 implements MyInterface1, MyInterface2 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.MyMethod();
    }

    @Override
    public void MyMethod() {
        MyInterface2.super.MyMethod();
    }
}
