package com.company.JavaSourceLearn.designPatterns2.creatorMode.design14;

/**
 * @Author: liwenbo
 * @Date: 2021年06月02日
 * @Description:
 */
public class Matchmaker extends Person implements Action {

    private final Person p1;
    private final Person p2;

    public Matchmaker(Person p1, Person p2, String name) {
        this.p1 = p1;
        this.p2 = p2;
        super.setName(name);
    }

    /**
     * 表白方法
     */
    @Override
    public void showLove() {
        System.out.println(p1.getName() + "通过" + this.getName() + "对" + p2.getName() + "表白");
    }

    public void showName() {

    }
}
