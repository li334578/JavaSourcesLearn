package com.company.JavaSourceLearn.designPatterns2.creatorMode.design14;

/**
 * @Author: liwenbo
 * @Date: 2021年06月02日
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new ZhangSan("张三");
        Person p2 = new LiSi("李四");
        Matchmaker matchmaker = new Matchmaker(p1, p2, "媒婆");
        matchmaker.showLove();
    }
}
