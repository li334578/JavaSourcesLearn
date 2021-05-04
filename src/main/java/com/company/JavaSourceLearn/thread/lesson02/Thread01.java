package com.company.JavaSourceLearn.thread.lesson02;

import org.apache.poi.ss.formula.functions.T;

import java.util.concurrent.TimeUnit;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-30 21:03:25
 */
public class Thread01 {

    /*volatile */boolean running = true;
    // volatile 保证线程可见性 禁止指令重排序
    // MESI(CPU的缓存一致性协议)
    // new Object() 1.申请内存(值为默认值) 2.赋值 3.对象指向该内存地址


    void method1() {
        System.out.println("M start");
        while (running) {
            /*try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println("M end");
    }


    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        new Thread(thread01::method1).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread01.running = false;
    }
}
