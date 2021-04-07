package com.company.JavaSourceLearn.springLearn.module.lesson2.bean2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : cglib动态代理
 * @date : 2021-04-05 19:39:48
 */
public class Service3 {
    public String method1() {
        System.out.println("method1方法");
        return "Service3:method1";
    }

    public String method2() {
        System.out.println("method2方法");
        return "Service3:method2";
    }
}
