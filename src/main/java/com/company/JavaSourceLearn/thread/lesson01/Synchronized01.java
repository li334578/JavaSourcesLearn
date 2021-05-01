package com.company.JavaSourceLearn.thread.lesson01;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-29 21:23:16
 */
public class Synchronized01 {

    private int counter = 10;
    private Object object = new Object();

    private void m() {
        synchronized (object) {// 任何线程想要执行下面的代码必须拿到object的锁
            counter--;
            System.out.println(Thread.currentThread().getName() + "counter=" + counter);
        }
    }
}
