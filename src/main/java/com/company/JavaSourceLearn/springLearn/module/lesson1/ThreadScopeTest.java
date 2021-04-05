package com.company.JavaSourceLearn.springLearn.module.lesson1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.*;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-03 21:30:29
 */
public class ThreadScopeTest {

    @Test
    public void threadScopeTestMethod() {

        // 创建线程池
        ExecutorService executorService = new ThreadPoolExecutor(10,
                20, 5, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        for (int i = 0; i < 10; i++) {
            // 不同的线程获取的不同threadScope
            MyThread myThread = new MyThread();
            executorService.submit(myThread);
        }
    }
}

class MyThread implements Runnable {

    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("classpath:/com/JavaSourceLearn/lesson1/scope.xml");

    @Override
    public void run() {
        // 同一线程内获取的是同一个threadScope对象
        context.getBean("threadScope");
        context.getBean("threadScope");
    }
}
