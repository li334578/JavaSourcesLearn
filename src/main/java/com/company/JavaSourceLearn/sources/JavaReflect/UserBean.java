package com.company.JavaSourceLearn.sources.JavaReflect;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-25 21:41:09
 */
public class UserBean implements Runnable {
    @TestAnno
    private String testPropertyOne;

    @TestAnno
    @Deprecated
    public void testMethodOne() {

    }

    @Override
    public void run() {
        //
        System.out.println("userBean run ...");
    }
}
