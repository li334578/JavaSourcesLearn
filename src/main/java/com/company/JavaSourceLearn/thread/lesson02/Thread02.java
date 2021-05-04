package com.company.JavaSourceLearn.thread.lesson02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-30 21:56:37
 */
public class Thread02 {
    volatile int counter = 0;
    // volatile 并不能保证多个线程共通修改running变量时带来的不一致的问题 也就是volatile不能替代synchronized

    void m() {
        for (int i = 0; i < 10000; i++) counter++;
    }

    public static void main(String[] args) {
        Thread02 thread02 = new Thread02();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(thread02::m, "thread->" + i));
        }
        threads.forEach(Thread::start);
        threads.forEach(item -> {
            try {
                item.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(thread02.counter);
    }
}
