package com.company.JavaSourceLearn.algorithm2.lesson2;

/**
 * @Author: liwenbo
 * @Date: 2021年06月07日
 * @Description: 并查集
 */
public class CheckAndSet3 {

    private int[] data;

    public CheckAndSet3(int[] data) {
        this.data = data;
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
    }


    public int find(int x) {
        return x == data[x] ? x : (data[x] = find(data[x]));
    }


    public void merge(int x, int y) {
        data[find(x)] = find(y);
    }
}
