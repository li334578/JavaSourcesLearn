package com.company.JavaSourceLearn.designPatterns2.creatorMode.design09;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description: 香肠煎饼
 */
public class SausageDecorator extends BattercakeDecotator {
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
