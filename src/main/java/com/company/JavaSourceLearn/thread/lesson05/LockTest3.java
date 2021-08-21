package com.company.JavaSourceLearn.thread.lesson05;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-07-07 21:43:21
 */
public class LockTest3 {

    public synchronized void method() {
        // 可以递归调用自己说明是可重入锁
        method();
    }


    public static void main(String[] args) {
        LockTest3 lockTest3 = new LockTest3();
        Lock lock = new ReentrantLock();
        new Thread(() -> {
            lock.lock();
            try {
                System.out.println("外城锁");
                lock.lock();
                try {
                    System.out.println("内城锁");
                } finally {
                    lock.unlock(); // 必须要解锁，不解锁不影响当前线程 但是会导致其他线程获取不到锁。
                }
            } finally {
                lock.unlock();
            }
        }).start();
    }
}
