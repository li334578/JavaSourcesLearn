package com.company.JavaSourceLearn.springLearn.module.lesson5;

import com.company.JavaSourceLearn.springLearn.module.lesson5.dir5.ServiceA;
import com.company.JavaSourceLearn.springLearn.module.lesson5.dir5.ServiceB;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 13:16:53
 */
public class ImportTest {
    @Test
    public void testMethod1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig1.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void testMethod2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
            System.out.println(context.getBean(beanDefinitionName));
        }
    }

    @Test
    public void testMethod3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void testMethod4() {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        //2.输出容器中定义的所有bean信息
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void testMethod5() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig5.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void testMethod6() {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig6.class);
        ServiceA serviceA = context.getBean(ServiceA.class);
        ServiceB serviceB = context.getBean(ServiceB.class);
        serviceA.m1();
        serviceB.m1();
    }


    @Test
    public void testMethod7() {
        //1.通过AnnotationConfigApplicationContext创建spring容器，参数为@Import标注的类
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig7.class);

    }
}
