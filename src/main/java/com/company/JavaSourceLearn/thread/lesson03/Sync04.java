package com.company.JavaSourceLearn.thread.lesson03;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-01 20:23:55
 */
public class Sync04 {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        Thread thread1 = new Thread(() -> {
            try {
                lock.lock();
                System.out.println("t1 start");
                TimeUnit.SECONDS.sleep(Integer.MAX_VALUE);
                System.out.println("t1 end");
            } catch (InterruptedException e) {
                System.out.println("  interrupted ");
            } finally {
                lock.unlock();
            }
        });
        thread1.start();

        Thread thread2 = new Thread(() -> {
            try {
                lock.lockInterruptibly();// 对interrupt()做出响应
                System.out.println("t2 start");
                TimeUnit.SECONDS.sleep(5);
                System.out.println("t2 end");
            } catch (InterruptedException e) {
                System.out.println("interrupted..");
            } finally {
                lock.unlock();
            }
        });
        thread2.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.interrupt();
    }
}
