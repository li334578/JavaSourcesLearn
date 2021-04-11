package com.company.JavaSourceLearn.test.lesson4;

import com.company.JavaSourceLearn.springLearn.module.lesson4.ConfigBean;
import com.company.JavaSourceLearn.springLearn.module.lesson4.MyBean3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-07 20:26:17
 */
public class TestClass {

    @Test
    public void testMethod1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBean.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void testMethod2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBean3.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
