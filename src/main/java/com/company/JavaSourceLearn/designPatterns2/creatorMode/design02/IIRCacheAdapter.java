package com.company.JavaSourceLearn.designPatterns2.creatorMode.design02;

import java.util.concurrent.TimeUnit;

/**
 * @Author: liwenbo
 * @Date: 2021年05月21日
 * @Description:
 */
public class IIRCacheAdapter implements ICacheAdapter {
    @Override
    public String get(String key) {
        System.out.println("IIRCacheAdapter get ...");
        return null;
    }

    @Override
    public void set(String key, String value) {
        System.out.println("IIRCacheAdapter set ...");
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        System.out.println("IIRCacheAdapter set ...");
    }

    @Override
    public void del(String key) {
        System.out.println("IIRCacheAdapter del ...");
    }
}
