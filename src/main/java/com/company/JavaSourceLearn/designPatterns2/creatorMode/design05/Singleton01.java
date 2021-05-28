package com.company.JavaSourceLearn.designPatterns2.creatorMode.design05;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description: 懒汉
 */
public class Singleton01 {
    private static Singleton01 instance;

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton01();
        return instance;
    }
}
