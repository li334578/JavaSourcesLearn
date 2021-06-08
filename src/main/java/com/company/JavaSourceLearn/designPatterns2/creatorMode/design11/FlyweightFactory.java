package com.company.JavaSourceLearn.designPatterns2.creatorMode.design11;

import java.util.HashMap;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description: 享元工厂
 */
public class FlyweightFactory {
    private final HashMap<String, Flyweight> flyweightHashMap = new HashMap<>();

    public synchronized Flyweight getInstance(String key) {
        if (flyweightHashMap.containsKey(key)) {
            return flyweightHashMap.get(key);
        } else {
            flyweightHashMap.put(key, new ConcreteFlyweight(key));
        }
        return flyweightHashMap.get(key);
    }

    public Integer getFlyweightSize() {
        return flyweightHashMap.size();
    }
}
