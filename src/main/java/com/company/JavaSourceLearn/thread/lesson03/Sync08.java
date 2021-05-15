package com.company.JavaSourceLearn.thread.lesson03;

import java.util.concurrent.Exchanger;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-04 15:01:18
 */
public class Sync08 {

    static Exchanger<String> exchanger = new Exchanger<>();

    public static void main(String[] args) {
        // exchanger 两个线程之间才能交换
        new Thread(() -> {
            String s = "T1";
            try {
                s = exchanger.exchange(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + s);
        }, "t1").start();
        System.out.println("------");
        new Thread(() -> {
            String s = "T2";
            try {
                s = exchanger.exchange(s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + s);
        }, "t2").start();
    }
}
