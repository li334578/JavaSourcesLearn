package com.company.JavaSourceLearn.designPatterns2.creatorMode.design13;

/**
 * @Author: liwenbo
 * @Date: 2021年06月02日
 * @Description:
 */
public class SuperCar extends CarDecorator {
    /**
     * 汽车功能
     */
    @Override
    public void features() {
        System.out.println("高速行驶");
    }

    public SuperCar(Car car) {
        super(car);
    }
}
