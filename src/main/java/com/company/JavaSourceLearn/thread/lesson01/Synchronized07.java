package com.company.JavaSourceLearn.thread.lesson01;

import java.util.concurrent.TimeUnit;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-29 21:49:18
 */
public class Synchronized07 {

    public static void main(String[] args) {
        // 脏读
        // 模拟银行账户 对业务写方法加锁 对业务读方法不加锁 行不行？
        Account account = new Account();
        new Thread(() -> account.set("zhangsan", 100.0)).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account.getBalance("zhangsan"));

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account.getBalance("zhangsan"));

    }
}

class Account {
    String name;
    double balance;

    public synchronized void set(String name, double balance) {
        this.name = name;

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.balance = balance;
    }

    public synchronized double getBalance(String name) {
        return this.balance;
    }
}
