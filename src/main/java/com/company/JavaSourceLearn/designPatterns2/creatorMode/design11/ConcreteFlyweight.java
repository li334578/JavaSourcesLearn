package com.company.JavaSourceLearn.designPatterns2.creatorMode.design11;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description:
 */
public class ConcreteFlyweight extends Flyweight {
    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println(name + "ConcreteFlyweight operation run ....");
    }
}
