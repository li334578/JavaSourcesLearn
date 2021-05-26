package com.company.JavaSourceLearn.designPatterns2.creatorMode.design02;

import java.util.concurrent.TimeUnit;

/**
 * @Author: liwenbo
 * @Date: 2021年05月21日
 * @Description:
 */
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
