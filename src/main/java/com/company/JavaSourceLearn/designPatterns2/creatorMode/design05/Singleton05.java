package com.company.JavaSourceLearn.designPatterns2.creatorMode.design05;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description: DCL
 */
public class Singleton05 {
    private static Singleton05 instance;

    private Singleton05() {
    }

    public static Singleton05 getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton05.class) {
            if (null == instance) {
                instance = new Singleton05();
            }
        }
        return instance;
    }
}
