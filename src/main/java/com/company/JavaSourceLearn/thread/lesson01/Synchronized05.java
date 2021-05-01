package com.company.JavaSourceLearn.thread.lesson01;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-29 21:30:22
 */
public class Synchronized05 implements Runnable {

    private int counter = 10;

    @Override
    public /*synchronized*/ void run() {
        counter--;
        System.out.println(Thread.currentThread().getName() + "counter=" + counter);
    }


    public static void main(String[] args) {
        Synchronized05 sync = new Synchronized05();
        for (int i = 0; i < 10; i++) {
            new Thread(sync).start();
        }
    }
}
