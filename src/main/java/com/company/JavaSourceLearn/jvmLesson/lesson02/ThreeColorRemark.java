package com.company.JavaSourceLearn.jvmLesson.lesson02;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 三色标记
 * @date : 2021-07-14 21:07:36
 */
public class ThreeColorRemark {
    public static void main(String[] args) {
        A a = new A();
        // 开始做并发标记
        D d = a.b.d; // 1.读
        a.d = null; // 2.写
        a.d = d; // 3.写l
    }
}

class A {
    B b = new B();
    D d = null;
}

class B {
    C c = new C();
    D d = new D();

}

class C {

}

class D {

}