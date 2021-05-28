package com.company.JavaSourceLearn.designPatterns2.creatorMode.design05;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description: CAS
 */
public class Singleton06 {
    private static final AtomicReference<Singleton06> INSTANCE = new AtomicReference<>();
    private static Singleton06 instance;

    private Singleton06() {
    }

    public static Singleton06 getInstance() {
        for (; ; ) {
            instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton06());
            return INSTANCE.get();
        }
    }
}
