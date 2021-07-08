package com.company.JavaSourceLearn.thread.lesson05;

import lombok.Data;
import org.junit.jupiter.api.Test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-07-06 20:50:24
 */
public class SyncTest01 {

    @Test
    public void testMethod1() {
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "AA").start();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "BB").start();
        new Thread(() -> {
            for (int i = 0; i < 40; i++) {
                ticket.sale();
            }
        }, "CC").start();
    }
}

@Data
class Ticket {
    private Integer number = 30;

    public synchronized void sale() {
        if (number > 0) {
            System.out.println(Thread
                    .currentThread().getName() + "卖出了第" + (number--) + "张票,剩余票数" + number);
        }
    }
}
