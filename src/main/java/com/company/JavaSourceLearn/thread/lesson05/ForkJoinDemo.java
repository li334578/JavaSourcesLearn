package com.company.JavaSourceLearn.thread.lesson05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-07-08 20:53:54
 */
public class ForkJoinDemo {
    public static void main(String[] args) {
        MyTask myTask = new MyTask(0, 100);
        // 创建分支合并池对象
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        ForkJoinTask<Integer> forkJoinTask = forkJoinPool.submit(myTask);
        try {
            System.out.println(forkJoinTask.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            forkJoinPool.shutdown();
        }
    }
}


class MyTask extends RecursiveTask<Integer> {

    private static final int bound = 10;
    private int begin;
    private int end;
    private int result;


    public MyTask(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        // 拆分
        if (end - begin <= bound) {
            for (int i = begin; i <= end; i++) {
                result += i;
            }
        } else {
            int middle = (begin + end) / 2;
            MyTask task1 = new MyTask(begin, middle);
            MyTask task2 = new MyTask(middle + 1, end);
            // 调用方法拆分
            task1.fork();
            task2.fork();

            // 合并结果
            result = task1.join() + task2.join();
        }
        return result;
    }
}
