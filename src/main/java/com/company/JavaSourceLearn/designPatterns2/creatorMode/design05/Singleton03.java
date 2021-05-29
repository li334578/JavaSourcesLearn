package com.company.JavaSourceLearn.designPatterns2.creatorMode.design05;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description: 饿汉
 */
public class Singleton03 {
    private static Singleton03 instance = new Singleton03();

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        return instance;
    }
}
