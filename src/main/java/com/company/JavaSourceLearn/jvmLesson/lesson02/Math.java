package com.company.JavaSourceLearn.jvmLesson.lesson02;

import com.company.bean.Student;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-07-11 17:30:42
 */
public class Math {
    public static final int initData = 666;
    public static Student student = new Student();

    public int coupute() {
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.coupute();
        System.out.println("test");
    }
}
