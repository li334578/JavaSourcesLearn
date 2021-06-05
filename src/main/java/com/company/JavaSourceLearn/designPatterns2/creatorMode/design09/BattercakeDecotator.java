package com.company.JavaSourceLearn.designPatterns2.creatorMode.design09;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description: 煎饼装饰器
 */
public class BattercakeDecotator extends Battercake {
    // 静态代理 委派
    // 指定抽象类不指定BaseBattercake实体 更加灵活
    // 以后可能会有多个类似BaseBattercake的类继承Battercake
    private Battercake battercake;

    public BattercakeDecotator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
