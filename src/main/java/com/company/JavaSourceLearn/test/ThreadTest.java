package main.java.com.company.JavaSourceLearn.test;

import java.util.HashSet;
import java.util.concurrent.*;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 多线程
 * @date : 2021-03-19 21:25:28
 */
public class ThreadTest {
    public static void main(String[] args) {
        Executors.newFixedThreadPool(10);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                5, // 核心线程数
                10, // 最大线程数
                10, // 超出核心线程数的线程空闲存活时间
                TimeUnit.MILLISECONDS, // 超出核心线程数的线程空闲存活时间的单位
                new ArrayBlockingQueue<Runnable>(10), // 任务队列 参数为任务队列中最大的等待任务数
                Executors.defaultThreadFactory(), // 创建线程的线程工厂
                new ThreadPoolExecutor.AbortPolicy()); // 当线程池线程数等于最大线程数，且任务队列排队已满。后进入的任务会执行拒绝策略
        /*
         * 1 CallerRunsPolicy 该策略下，在调用者线程直接执行被拒绝任务的run方法，如果线程池已经shutdown，则直接抛弃任务。
         * 2 AbortPolicy 该策略下，直接丢弃任务，并抛出RejectedExecutionException异常
         * 3 DiscardPolicy 该策略下直接丢弃任务，什么也不做。
         * 4 DiscardOldestPolicy 抛弃队列首部的任务，尝试把被拒绝的任务放入队列。
         */
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("cd");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("123");
    }
}
