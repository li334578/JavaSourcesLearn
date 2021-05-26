package com.company.JavaSourceLearn.thread.lesson04;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-04 15:45:10
 */
public class Sync01 {

    //    volatile List lists = new ArrayList();
    volatile List lists = Collections.synchronizedList(new LinkedList<>());

    public void add(Object object) {
        lists.add(object);
    }

    public int size() {
        return lists.size();
    }


    public static void main(String[] args) {
        Sync01 sync01 = new Sync01();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                sync01.add(i);
                System.out.println("add " + i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            while (true) {
                if (sync01.size() == 5) {
                    break;
                }
            }
            System.out.println("Sync 02 end ...");
        }).start();
    }
}
