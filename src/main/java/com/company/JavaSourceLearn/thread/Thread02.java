package com.company.JavaSourceLearn.thread;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-29 20:43:46
 */
public class Thread02 {

    static class MyThred extends Thread {
        @Override
        public void run() {
            System.out.println("extends Thread 01");
        }
    }

    static class MyRun implements Runnable {
        @Override
        public void run() {
            System.out.println("implements Runnable 01");
        }
    }

    public static void main(String[] args) {
        new MyThred().start();
        new Thread(new MyRun()).start();
        new Thread(() -> {
            System.out.println("lambda 03");
        }).start();
    }
    // 启动线程的三种方式 1：Thread 2：Runnable 3：Executor.newCachedThread
}
