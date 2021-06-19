package com.company.JavaSourceLearn.designPatterns2.creatorMode.design13;

/**
 * @Author: liwenbo
 * @Date: 2021年06月02日
 * @Description: 装饰器
 */
public class CarDecorator extends Car {

    private final Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    /**
     * 汽车功能
     */
    @Override
    public void features() {
        this.car.features();
    }
}
