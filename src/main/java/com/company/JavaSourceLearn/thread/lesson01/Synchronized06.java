package com.company.JavaSourceLearn.thread.lesson01;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-29 21:43:17
 */
public class Synchronized06 {

    public synchronized void method1() {
        System.out.println(Thread.currentThread().getName() + "method1 start ......");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "method1 end ......");
    }


    public void method2() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "method2");
    }

    public static void main(String[] args) {
        Synchronized06 sync = new Synchronized06();
        new Thread(sync::method1, "t1").start();
        new Thread(sync::method2, "t2").start();
    }


}
