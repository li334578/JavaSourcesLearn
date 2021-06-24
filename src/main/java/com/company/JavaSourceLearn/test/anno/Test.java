package com.company.JavaSourceLearn.test.anno;

import java.lang.reflect.Field;

/**
 * @Author: liwenbo
 * @Date: 2021年05月25日
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        for (Field declaredField : TestBean.class.getDeclaredFields()) {
            LogAnnotation annotation = declaredField.getAnnotation(LogAnnotation.class);
            if (annotation != null) {
                // 存在该注解
                System.out.println(declaredField.getName());
            }
        }
    }
}
