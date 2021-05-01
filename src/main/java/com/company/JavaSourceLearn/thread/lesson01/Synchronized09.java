package com.company.JavaSourceLearn.thread.lesson01;

import java.util.concurrent.TimeUnit;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : synchronized
 * @date : 2021-04-29 21:56:51
 */
public class Synchronized09 {


    public synchronized void method1() {
        System.out.println("method1 start");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method1 end ...");
    }


    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
    }
}

class Child extends Synchronized09 {
    @Override
    public synchronized void method1() {
        System.out.println("child method1 start ...");
        super.method1();
        System.out.println("child method1 end ...");
    }
}
