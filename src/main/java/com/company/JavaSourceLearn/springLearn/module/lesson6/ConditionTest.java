package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:42:38
 */
public class ConditionTest {

    @Test
    public void testMethod1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig1.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanDefinitionName, context.getBean(beanDefinitionName)));
        }
    }

    @Test
    public void testMethod2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanDefinitionName, context.getBean(beanDefinitionName)));
        }
    }

    @Test
    public void testMethod3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanDefinitionName, context.getBean(beanDefinitionName)));
        }
    }

    @Test
    public void testMethod4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanDefinitionName, context.getBean(beanDefinitionName)));
        }
    }

    @Test
    public void testMethod5() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig5.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanDefinitionName, context.getBean(beanDefinitionName)));
        }
    }

    @Test
    public void testMethod6() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig6.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanDefinitionName, context.getBean(beanDefinitionName)));
        }
    }
}
