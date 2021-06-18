package com.company.JavaSourceLearn.designPatterns2.creatorMode.design13;

/**
 * @Author: liwenbo
 * @Date: 2021年06月02日
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Car car = new BaseCar();
        car.features();
        car = new SuperCar(car);
        car.features();
        car = new FlyCar(car);
        car.features();
    }
}
