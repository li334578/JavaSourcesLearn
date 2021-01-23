package com.company.sources.JavaUtil.collectionClass.mapclass.hashMap_test.jdk7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : HashMap
 * @date : 2021-01-22 21:06:01
 */
public class HashMapExample1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        System.out.println(list.size());
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("hello", "world");
        // hash , key , value , bucketIndex
        // 头插法
        // table[bucketIndex] = new Entry(hash,key,value,table[bucketIndex]);
        // 初始化hashMap的容量为2的幂次方数
        // 17 -> 32 17-1 左移一位 32 除最高位的1 低位全置为0
        // key为null 放到hash表的0位置上 因为null无法计算hash值
        // 并发修改异常modCount
        for (String s : hashMap.keySet()) {
            // 会导致并发修改异常
            hashMap.remove(s);
        }
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            // 可以避免并发修改异常
            iterator.remove();
        }
    }
}
