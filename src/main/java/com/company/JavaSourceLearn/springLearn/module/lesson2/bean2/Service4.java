package com.company.JavaSourceLearn.springLearn.module.lesson2.bean2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : cglib动态代理
 * @date : 2021-04-05 19:39:48
 */
public class Service4 {
    public void insert1() {
        System.out.println("insert1方法");
    }

    public void insert2() {
        System.out.println("insert2方法");
    }

    public String get1() {
        System.out.println("get1方法");
        return "get1";
    }

    public String get2() {
        System.out.println("get2方法");
        return "get2";
    }
}
