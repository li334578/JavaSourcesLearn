package com.company.JavaSourceLearn.designPatterns2.creatorMode.design05;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description: synchronized 懒汉
 */
public class Singleton02 {
    private static Singleton02 instance;

    private Singleton02() {
    }

    public static synchronized Singleton02 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton02();
        return instance;
    }
}
