package com.company.JavaSourceLearn.designPatterns2.creatorMode.design13;

/**
 * @Author: liwenbo
 * @Date: 2021年06月02日
 * @Description: 基础款汽车
 */
public class BaseCar extends Car {
    /**
     * 汽车功能
     */
    @Override
    public void features() {
        System.out.println("低速行驶...");
    }
}
