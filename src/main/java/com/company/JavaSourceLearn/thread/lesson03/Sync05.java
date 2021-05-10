package com.company.JavaSourceLearn.thread.lesson03;

import java.util.concurrent.CountDownLatch;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-01 20:43:14
 */
public class Sync05 {


    public void method01() {
        CountDownLatch latch = new CountDownLatch(100);
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                int result = 0;
                for (int j = 0; j < 10000; j++) {
                    result += j;
                }
                System.out.println(result);
            });
        }

        for (Thread value : threads) {
            value.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("method1 end ...");
    }


    public void method02() {
        CountDownLatch latch = new CountDownLatch(100);
        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                int result = 0;
                for (int j = 0; j < 10000; j++) {
                    result += j;
                }
                System.out.println(result);
                latch.countDown();
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        try {
            latch.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method2 end ...");
    }

    public static void main(String[] args) {
        Sync05 sync05 = new Sync05();
        sync05.method01();
        sync05.method02();
    }
}
