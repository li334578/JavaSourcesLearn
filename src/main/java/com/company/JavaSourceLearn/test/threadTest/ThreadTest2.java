package com.company.JavaSourceLearn.test.threadTest;

import java.util.concurrent.*;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-10 20:14:48
 */
public class ThreadTest2 {

    public static void main(String[] args) throws Exception {
        ExecutorService service = new ThreadPoolExecutor(5,
                10, 5, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        // 求1-10000的和
        CountDownLatch downLatch = new CountDownLatch(10);
        Integer sum = 0;
        for (int i = 1; i < 10000; i += 10) {
            Future<Integer> future = service.submit(new MyTask(i, downLatch));
            sum += future.get();
        }
        downLatch.await();
        service.shutdown();
        System.out.println(sum);
    }
}

class MyTask implements Callable<Integer> {

    private Integer start;
    private CountDownLatch latchCounters;

    public MyTask(Integer start, CountDownLatch latchCounters) {
        this.start = start;
        this.latchCounters = latchCounters;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = start; i < start + 10; i++) {
            sum += i;
        }
        latchCounters.countDown();
        return sum;
    }
}
