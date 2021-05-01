package com.company.JavaSourceLearn.thread.lesson01;

import java.util.concurrent.TimeUnit;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : synchronized
 * @date : 2021-04-29 21:56:51
 */
public class Synchronized08 {


    private synchronized void method1() {
        System.out.println("method1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        method2();
        System.out.println("method1 end ...");
    }


    private synchronized void method2() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method2");
    }


    public static void main(String[] args) {
        Synchronized08 synchronized08 = new Synchronized08();

        synchronized08.method1();
    }
}
