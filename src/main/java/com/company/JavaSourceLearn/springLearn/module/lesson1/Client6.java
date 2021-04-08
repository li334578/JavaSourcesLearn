package com.company.JavaSourceLearn.springLearn.module.lesson1;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.*;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-04 15:48:19
 */
public class Client6 {
    private static final String classPath = "classpath:/com/JavaSourceLearn/lesson1/";

    private static ClassPathXmlApplicationContext context;

    @Test
    public void testPrimary() {
        context = new ClassPathXmlApplicationContext(classPath + "PrimaryBean.xml");
        PrimaryBean bean = context.getBean(PrimaryBean.class);
        System.out.println(bean);
    }

    @Test
    public void testActualTimeBean() {
        System.out.println("容器准备初始化");
        context = new ClassPathXmlApplicationContext(classPath + "ActualTimeBean.xml");
        System.out.println("容器初始化完成");
        context.close();
    }

    @Test
    public void testLazyInitBean() {
        System.out.println("容器准备初始化");
        context = new ClassPathXmlApplicationContext(classPath + "ActualTimeBean.xml");
        System.out.println("容器初始化完成");
        LazyInitBean bean = context.getBean(LazyInitBean.class);
        context.close();
    }

    @Test
    public void testLazyInitDependencyActualTimeBean() {
        System.out.println("容器准备初始化");
        context = new ClassPathXmlApplicationContext(classPath + "ActualTimeDependencyLazyBean.xml");
        System.out.println("容器初始化完成");
        context.close();
    }

    @Test
    public void testBeanExtend() {
        context = new ClassPathXmlApplicationContext(classPath + "beanExtend.xml");
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(context.getBean(beanDefinitionName));
        }
    }

    @Test
    public void testBeanExtends2() {
        context = new ClassPathXmlApplicationContext(classPath + "beanExtend2.xml");
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        System.out.println(context.getBean(ServiceA.class));
        System.out.println(context.getBean(ServiceB.class));
        System.out.println(context.getBean(ServiceC.class));
    }
}
