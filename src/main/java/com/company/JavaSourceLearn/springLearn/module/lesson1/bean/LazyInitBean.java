package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 延迟初始化bean
 * @date : 2021-04-05 10:12:39
 */
public class LazyInitBean {
    public LazyInitBean() {
        System.out.println("延迟初始化bean");
    }
}
