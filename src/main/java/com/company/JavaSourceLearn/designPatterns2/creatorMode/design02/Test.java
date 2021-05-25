package com.company.JavaSourceLearn.designPatterns2.creatorMode.design02;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ICacheAdapter cacheAdapter = new EGMCacheAdapter();
        cacheAdapter.get("1");
    }
}
