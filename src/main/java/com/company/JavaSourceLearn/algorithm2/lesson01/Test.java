package com.company.JavaSourceLearn.algorithm2.lesson01;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-06 21:17:56
 */
public class Test {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray();
        System.out.println(dynamicArray.isEmpty());
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        System.out.println(dynamicArray.get(0));
        System.out.println(dynamicArray.get(1));
        System.out.println(dynamicArray.get(2));
        dynamicArray.remove(1);
        System.out.println(dynamicArray.toString());
        System.out.println(dynamicArray.isEmpty());
        System.out.println(dynamicArray.getSize());
    }
}
