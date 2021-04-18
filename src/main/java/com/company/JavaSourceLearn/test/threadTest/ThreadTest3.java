package com.company.JavaSourceLearn.test.threadTest;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.*;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 10:45:15
 */
public class ThreadTest3 {

    public static void main(String[] args) {
        ExecutorService service = new ThreadPoolExecutor(5,
                10,
                5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        // LinkedBlockingDeque
        Random random = new Random();
        int a = random.nextInt(100);
        for (int i = 1; i <= 1000; i++) {
            service.submit(new MyTask2(i));
        }
        service.shutdown();
        assert a > 110 :
                "this is a";
    }

    @Test
    public void testMethod() {
        int a = 1;
        int b = 2;
        // 格式2：assert [boolean 表达式] : [错误表达式 （日志）]
        assert a > b : "错误，a不大于b";
    }
}


class MyTask2 implements Runnable {


    private Integer counter;

    public MyTask2(Integer counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        if (counter % 5 == 0) {
            System.out.println(Thread.currentThread().getName() + "->" + counter);
        }
    }
}