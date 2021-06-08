package com.company.JavaSourceLearn.designPatterns2.creatorMode.design11;

/**
 * @Author: liwenbo
 * @Date: 2021年06月01日
 * @Description:
 */
public class Test {
    private final FlyweightFactory factory = new FlyweightFactory();
    private final Flyweight fly1;
    private final Flyweight fly2;
    private final Flyweight fly3;
    private final Flyweight fly4;
    private final Flyweight fly5;
    private final Flyweight fly6;

    public Test() {
        fly1 = factory.getInstance("Google");
        fly2 = factory.getInstance("Qutr");
        fly3 = factory.getInstance("Google");
        fly4 = factory.getInstance("Google");
        fly5 = factory.getInstance("Google");
        fly6 = factory.getInstance("Google");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.fly1.operation();
        test.fly2.operation();
        test.fly3.operation();
        test.fly4.operation();
        test.fly5.operation();
        test.fly6.operation();
        int objSize = test.factory.getFlyweightSize();
        System.out.println("objSize = " + objSize);
    }
}
