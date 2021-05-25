package com.company.JavaSourceLearn.designPatterns2.creatorMode.design02;

import java.util.concurrent.TimeUnit;

/**
 * @Author: liwenbo
 * @Date: 2021年05月21日
 * @Description:
 */
public class EGMCacheAdapter implements ICacheAdapter {
    @Override
    public String get(String key) {
        System.out.println("EGMCacheAdapter get ...");
        return null;
    }

    @Override
    public void set(String key, String value) {
        System.out.println("EGMCacheAdapter set1 ...");
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        System.out.println("EGMCacheAdapter set2 ...");
    }

    @Override
    public void del(String key) {
        System.out.println("EGMCacheAdapter del ...");
    }
}
