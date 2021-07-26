package com.company.JavaSourceLearn.sources.JavaReflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-05-25 21:39:53
 */
public class MethodTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = UserBean.class.getMethod("testMethodOne");
        System.out.println(method);
        // 返回指定类型的注解 不存在返回null
        TestAnno annotation = method.getAnnotation(TestAnno.class);
        System.out.println(annotation);
        // 获取直接作用到该方法上的注解
        for (Annotation declaredAnnotation : method.getDeclaredAnnotations()) {
            System.out.println(declaredAnnotation);
        }
        // 返回表示该类或接口的Class对象，该类或接口声明此对象表示的可执行文件
        Class<?> declaringClass = method.getDeclaringClass();
        System.out.println(declaringClass);
        Object defaultValue = method.getDefaultValue();
        System.out.println(defaultValue);
    }
}
