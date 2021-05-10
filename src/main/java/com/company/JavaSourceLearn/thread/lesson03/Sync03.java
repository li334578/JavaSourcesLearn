package com.company.JavaSourceLearn.thread.lesson03;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-01 20:20:04
 */
public class Sync03 {

    Lock lock = new ReentrantLock();

    void method1() {
        try {
            lock.lock();
            for (int i = 0; i < 3; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        } finally {
            lock.unlock();
        }
    }

    void method2() {
        boolean locked = false;
        try {
            locked = lock.tryLock(5, TimeUnit.SECONDS);
            lock.lock();
            System.out.println("m2....." + locked);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (locked) lock.unlock();
        }
    }


    public static void main(String[] args) {
        Sync03 sync03 = new Sync03();
        new Thread(sync03::method1).start();
        new Thread(sync03::method2).start();
    }
}
