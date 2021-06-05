package com.company.JavaSourceLearn.designPatterns2.creatorMode.design09;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description: 基础煎饼套餐
 */
public class BaseBattercake extends Battercake {
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
