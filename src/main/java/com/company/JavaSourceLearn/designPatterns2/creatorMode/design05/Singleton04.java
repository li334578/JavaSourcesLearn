package com.company.JavaSourceLearn.designPatterns2.creatorMode.design05;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description: 使用静态内部类的单例模式 推荐
 */
public class Singleton04 {

    private Singleton04() {
    }

    public static Singleton04 getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton04 instance = new Singleton04();
    }
}
