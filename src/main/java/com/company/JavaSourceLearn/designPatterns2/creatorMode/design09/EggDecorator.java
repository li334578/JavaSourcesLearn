package com.company.JavaSourceLearn.designPatterns2.creatorMode.design09;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description: 鸡蛋煎饼
 */
public class EggDecorator extends BattercakeDecotator {
    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
