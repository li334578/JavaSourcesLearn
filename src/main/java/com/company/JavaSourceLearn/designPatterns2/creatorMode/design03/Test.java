package com.company.JavaSourceLearn.designPatterns2.creatorMode.design03;

import java.math.BigDecimal;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(new BigDecimal("132.52")).getDetail());
        // 轻奢⽥田园
        System.out.println(builder.levelTwo(new BigDecimal("98.25")).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(new BigDecimal("85.43")).getDetail());
    }
}
