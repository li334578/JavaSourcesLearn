package com.company.JavaSourceLearn.designPatterns2.creatorMode.design13;

/**
 * @Author: liwenbo
 * @Date: 2021年06月02日
 * @Description:
 */
public class FlyCar extends CarDecorator {
    /**
     * 汽车功能
     */
    @Override
    public void features() {
        System.out.println("飞行行驶");
    }

    public FlyCar(Car car) {
        super(car);
    }
}
