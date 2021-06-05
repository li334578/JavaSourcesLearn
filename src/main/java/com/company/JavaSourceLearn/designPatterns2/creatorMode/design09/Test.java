package com.company.JavaSourceLearn.designPatterns2.creatorMode.design09;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description: 装饰器模式
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake = new BaseBattercake();
        // 煎饼有点小，想再加一个鸡蛋
        battercake = new EggDecorator(battercake);
        // 再加一个鸡蛋
        battercake = new EggDecorator(battercake);
        // 很饿，再加根香肠
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() + ",总价" + battercake.getPrice());
    }
}
