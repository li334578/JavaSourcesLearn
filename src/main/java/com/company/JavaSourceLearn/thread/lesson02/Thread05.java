package com.company.JavaSourceLearn.thread.lesson02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-30 22:24:28
 */
public class Thread05 {
    AtomicInteger counter = new AtomicInteger(0);

    void m() {
        for (int i = 0; i < 10000; i++) {
            counter.incrementAndGet(); // counter++
        }
    }

    public static void main(String[] args) {
        Thread05 thread05 = new Thread05();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(thread05::m, "thead->" + 1));
        }
        threads.forEach(Thread::start);

        threads.forEach(item -> {
            try {
                item.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(thread05.counter);
    }
}
