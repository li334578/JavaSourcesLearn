package com.company.JavaSourceLearn.thread.lesson06;

import lombok.Data;
import sun.misc.Unsafe;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-08-05 20:34:53
 */
public class TestClass {
    public static final Unsafe unsafe = Unsafe.getUnsafe();
    public static long valueOffset;


    static {
        try {
            valueOffset = unsafe.objectFieldOffset(User.class.getDeclaredField("age"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.setAge(1);
        user.setName("张三");
        user.compareAndSwapAge(1, 2);
        user.compareAndSwapAge(1, 5);
    }

    @Data
    static class User {
        private Integer age;
        private String name;

        public void compareAndSwapAge(int oldValue, int newValue) {
            unsafe.compareAndSwapInt(this, valueOffset, oldValue, newValue);
        }
    }
}



