package com.company.JavaSourceLearn.designPatterns2.creatorMode.design04;

import com.company.JavaSourceLearn.designPatterns2.creatorMode.design04.util.PaperFactory;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        PaperFactory paperFactory = new PaperFactory();
        System.out.println(paperFactory.createPaper("张三1", "0001"));
        System.out.println(paperFactory.createPaper("张三2", "0002"));
        System.out.println(paperFactory.createPaper("张三3", "0003"));
    }
}
