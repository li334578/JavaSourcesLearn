package com.company.JavaSourceLearn.thread.lesson03;

import java.util.concurrent.TimeUnit;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-01 20:06:15
 */
public class Sync01 {


    private synchronized void method1() {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(Thread.currentThread().getName() + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void method2() {
        System.out.println("method2");
    }


    public static void main(String[] args) {
        Sync01 sync01 = new Sync01();
        new Thread(sync01::method1).start();
        new Thread(sync01::method2).start();
    }
}
