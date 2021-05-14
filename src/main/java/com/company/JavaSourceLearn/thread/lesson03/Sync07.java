package com.company.JavaSourceLearn.thread.lesson03;

import java.util.concurrent.Semaphore;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-04 14:48:58
 */
public class Sync07 {

    public static void main(String[] args) {
        // 允许一个线程同时执行
//        Semaphore semaphore = new Semaphore(1);
        Semaphore semaphore = new Semaphore(1, true);
        new Thread(() -> {
            try {
                // 占有
                semaphore.acquire();
                System.out.println("T1 running....");
                Thread.sleep(200);
                System.out.println("T1 running....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 释放
                semaphore.release();
            }
        }).start();
        new Thread(() -> {
            try {
                // 占有
                semaphore.acquire();
                System.out.println("T2 running....");
                Thread.sleep(200);
                System.out.println("T2 running....");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // 释放
                semaphore.release();
            }
        }).start();

    }
}
