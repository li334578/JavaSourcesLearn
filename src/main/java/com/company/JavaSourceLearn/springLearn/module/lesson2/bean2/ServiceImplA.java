package com.company.JavaSourceLearn.springLearn.module.lesson2.bean2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-05 13:05:19
 */
public class ServiceImplA implements IService {
    @Override
    public void method1() {
        System.out.println("ServiceImplA m1");
    }

    @Override
    public void method2() {
        System.out.println("ServiceImplA m2");
    }

    @Override
    public void method3() {
        System.out.println("ServiceImplA m3");
    }
}
