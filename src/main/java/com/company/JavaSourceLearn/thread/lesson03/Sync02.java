package com.company.JavaSourceLearn.thread.lesson03;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-01 20:16:01
 */
public class Sync02 {

    Lock lock = new ReentrantLock();

    void method1() {
        try {
            lock.lock();
            for (int i = 0; i < 10; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(123);
                method2();
            }
        } finally {
            lock.unlock();
        }
    }

    void method2() {
        try {
            lock.lock();
            System.out.println("m2.....");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Sync02 sync02 = new Sync02();

        new Thread(sync02::method1).start();
    }


}
