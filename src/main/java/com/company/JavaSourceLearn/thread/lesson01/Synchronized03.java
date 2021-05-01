package com.company.JavaSourceLearn.thread.lesson01;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-29 21:23:16
 */
public class Synchronized03 {

    private int counter = 10;

    private synchronized void m() {
        counter--;
        System.out.println(Thread.currentThread().getName() + "counter=" + counter);
    }
}
