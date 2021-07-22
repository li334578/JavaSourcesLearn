package com.company.JavaSourceLearn.thread.lesson05;

import java.util.concurrent.CompletableFuture;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-07-08 21:09:36
 */
public class CompletableDemo {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Void> completableFuture =
                CompletableFuture.runAsync(() -> System.out.println("这个是同步调用。参数是Runnable接口"));
        completableFuture.get();

        // 异步
        CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("这个是异步调用。参数是Supplier");
            return 1024;
        });

        completableFuture1.whenComplete((t, u) -> {
            System.out.println("t->" + t); // 正常的返回值是t
            System.out.println("u->" + u); // 出异常后的返回值是u
        }).get();
    }
}
