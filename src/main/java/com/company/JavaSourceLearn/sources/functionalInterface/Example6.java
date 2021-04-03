package com.company.JavaSourceLearn.sources.functionalInterface;

import java.util.Arrays;
import java.util.List;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-16 15:22:29
 */
public class Example6 {
    public static void main(String[] args) {
        Undergraduate undergraduate1 = new Undergraduate("zhangsan", 10);
        Undergraduate undergraduate2 = new Undergraduate("lisi", 90);
        Undergraduate undergraduate3 = new Undergraduate("wangwu", 60);
        Undergraduate undergraduate4 = new Undergraduate("zhaoliu", 30);
        Undergraduate undergraduate5 = new Undergraduate("qianqi", 40);
        List<Undergraduate> undergraduateList =
                Arrays.asList(undergraduate1, undergraduate2, undergraduate3, undergraduate4, undergraduate5);
        undergraduateList.sort(Undergraduate::compareByScore);
        System.out.println(undergraduateList);
        undergraduateList.sort(Undergraduate::compareByName);
        System.out.println(undergraduateList);
        UndergraduateComparator undergraduateComparator = new UndergraduateComparator();
        undergraduateList.sort(undergraduateComparator::compareByScore);
        System.out.println(undergraduateList);
        undergraduateList.sort(undergraduateComparator::compareByName);
        System.out.println(undergraduateList);
        undergraduateList.sort(Undergraduate::compareScore);
        System.out.println(undergraduateList);
        undergraduateList.sort(Undergraduate::compareName);
        System.out.println(undergraduateList);
    }
}
