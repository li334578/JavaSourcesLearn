package com.company.JavaSourceLearn.thread;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-29 20:53:40
 */
public class Thread03 {
    public static void main(String[] args) {
        // sleep() 线程睡眠 不释放CPU占用
        // yield() 谦让 当前线程回到就绪队列 CPU根据调度算法调用下一个线程进行执行
        // join() 插队
        runMethod();
    }

    public static void runMethod() {
        // 保证三个线程按照T3 -> T2 -> T1 的顺序执行
        Thread t3 = new Thread(() -> {
            System.out.println("**************************");
            System.out.println("T3");
        });
        t3.setName("T3");
        Thread t2 = new Thread(() -> {
            try {
                t3.join();
                System.out.println("T2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t2.setName("T2");
        Thread t1 = new Thread(() -> {
            try {
                t2.join();
                System.out.println("T1");
                System.out.println("--------------------------");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.setName("T1");
        t1.start();
        t2.start();
        t3.start();
    }
}
