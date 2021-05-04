package com.company.JavaSourceLearn.thread.lesson02;

import java.util.concurrent.TimeUnit;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-30 22:15:00
 */
public class Thread04 {
    // 锁定某对象o，如果o的属性发生改变，不影响锁的使用
    // 但是o编程另一个对象则锁定的对象发生改变
    // 应该避免将锁定对象的引用变量变成另外的对象

    /*final*/ Object object = new Object();

    void m() {
        synchronized (object) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        Thread04 thread04 = new Thread04();
        new Thread(thread04::m, "t1").start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 创建第二个线程

        Thread thread = new Thread(thread04::m, "t2");

//        thread04.object = new Object();
        thread.start();
    }
}
