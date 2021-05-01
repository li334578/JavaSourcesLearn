package com.company.JavaSourceLearn.thread.lesson01;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-29 21:23:16
 */
public class Synchronized04 {

    private static int counter = 10;

    private static synchronized void m() { // Synchronized04.class
        counter--;
        System.out.println(Thread.currentThread().getName() + "counter=" + counter);
    }


    private static void mm() { // Synchronized04.class
        synchronized (Synchronized04.class) {
            counter--;
            System.out.println(Thread.currentThread().getName() + "counter=" + counter);
        }
    }
}
