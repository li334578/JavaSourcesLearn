package com.company.JavaSourceLearn.algorithm2.lesson2;

import org.junit.Before;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 并查集2
 * @date : 2021-06-06 16:02:47
 */
public class CheckAndSet2 {

    int[] data;

    public void init() {
        data = new int[1000];
        for (int i = 0; i < 1000; i++) {
            data[i] = i;
        }
    }

    public int find1(int x) {
        return x == data[x] ? x : find1(data[x]);
    }

    public int find2(int x) {
        int temp = x;
        while (temp != data[temp]) {
            temp = data[temp];
        }
        // temp = 2 x =10

        int i;
        // 优化
        while (x != temp) {
            i = data[x];
            data[x] = temp;
            x = i;
        }
        return temp;
    }

}
