package main.java.com.company.JavaSourceLearn.designPatterns.singlePatterns;

/**
 * @Author: liwenbo
 * @Date: 25/3/2021
 * @Description: 饿汉模式
 */
public class HungrySingleton {

    // 类加载就会创建该实例
    private HungrySingleton instance = new HungrySingleton();

    public HungrySingleton() {
    }

    public HungrySingleton getInstance() {
        return instance;
    }
}
