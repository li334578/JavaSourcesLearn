package com.company.JavaSourceLearn.springLearn.module.lesson2.bean2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-05 13:05:19
 */
public class ServiceImplB implements IService {
    @Override
    public void method1() {
        System.out.println("ServiceImplB m1");
    }

    @Override
    public void method2() {
        System.out.println("ServiceImplB m2");
    }

    @Override
    public void method3() {
        System.out.println("ServiceImplB m3");
    }
}
