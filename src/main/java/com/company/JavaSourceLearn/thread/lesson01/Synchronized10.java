package com.company.JavaSourceLearn.thread.lesson01;

import java.util.concurrent.TimeUnit;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-29 22:06:00
 */
public class Synchronized10 {
    int counter = 0;

    synchronized void method1() {
        System.out.println(Thread.currentThread().getName() + "start");
        while (true) {
            counter++;
            System.out.println(Thread.currentThread().getName() + " counter = " + counter);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (counter == 5) {
                int i = 1 / 0; // 手动传异常 锁将被释放 想要不被释放可以在此处catch 使循环继续
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Synchronized10 synchronized10 = new Synchronized10();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized10.method1();
            }
        };
        new Thread(runnable, "thread1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(runnable, "thread2").start();

    }
}
