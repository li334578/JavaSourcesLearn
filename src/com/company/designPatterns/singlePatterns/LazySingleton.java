package com.company.designPatterns.singlePatterns;

/**
 * @Author: liwenbo
 * @Date: 25/3/2021
 * @Description: 懒汉模式
 */
public class LazySingleton {
    private LazySingleton instance = null;


    // 避免实例在外部进行实例化
    public LazySingleton() {
    }

    // 获取实例方法
    public LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
