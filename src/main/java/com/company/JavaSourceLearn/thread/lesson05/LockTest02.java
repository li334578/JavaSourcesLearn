package com.company.JavaSourceLearn.thread.lesson05;

import org.junit.Test;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-07-07 20:18:38
 */
public class LockTest02 {

    @Test
    public void testMethod() {
        PrintThread pt = new PrintThread();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    pt.printA(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "A").start();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    pt.printB(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "B").start();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    pt.printC(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "C").start();
    }

    public static void main(String[] args) {
        PrintThread pt = new PrintThread();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    pt.printA(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "A").start();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    pt.printB(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "B").start();
        new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    pt.printC(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "C").start();
    }
}

class PrintThread {
    private int flag = 1;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    public void printA(int loop) throws InterruptedException {
        lock.lock();
        try {
            while (flag != 1) {
                condition1.await();
            }
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + "::第" + loop + "次循环::" + i);
            }
            flag = 2;
            condition2.signal();
        } finally {
            lock.unlock();
        }
    }

    public void printB(int loop) throws InterruptedException {
        lock.lock();
        try {
            while (flag != 2) {
                condition2.await();
            }
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "::第" + loop + "次循环::" + i);
            }
            flag = 3;
            condition3.signal();
        } finally {
            lock.unlock();
        }
    }

    public void printC(int loop) throws InterruptedException {
        lock.lock();
        try {
            while (flag != 3) {
                condition3.await();
            }
            for (int i = 1; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName() + "::第" + loop + "次循环::" + i);
            }
            flag = 1;
            condition1.signal();
        } finally {
            lock.unlock();
        }
    }
}
