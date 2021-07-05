package com.company.JavaSourceLearn.springLearn.test;

import com.company.JavaSourceLearn.springLearn.service.TestService1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Spring Bean 的生命周期 life Cycle
 * @date : 2021-06-28 20:40:28
 */
public class Test1 {
    public static void main(String[] args) {
        // Spring 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // bean
        TestService1 testService1 = applicationContext.getBean("testService1", TestService1.class);
        testService1.test1();
    }
}
