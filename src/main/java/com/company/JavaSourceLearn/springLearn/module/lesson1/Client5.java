package com.company.JavaSourceLearn.springLearn.module.lesson1;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-04 14:38:54
 */
public class Client5 {

    private static final String classPath = "classpath:/com/JavaSourceLearn/lesson1/";

    private static ClassPathXmlApplicationContext context;

    @Test
    public void normalBeanTest1() {
        System.out.println("容器准备启动");
        context = new ClassPathXmlApplicationContext(classPath + "NormalBean.xml");
        System.out.println("容器启动完毕");
        System.out.println("容器准备关闭");
        context.close();
        System.out.println("容器关闭完毕");
    }

    @Test
    public void strongDependenceBeanTest() {
        System.out.println("容器准备启动");
        context = new ClassPathXmlApplicationContext(classPath + "StrongDependenceBean.xml");
        System.out.println("容器启动完毕");
        System.out.println("容器准备关闭");
        context.close();
        System.out.println("容器关闭完毕");
    }

    @Test
    public void testDependenceOn() {
        // NormalBeanDependenceOn.xml
        System.out.println("容器准备启动");
        context = new ClassPathXmlApplicationContext(classPath + "NormalBeanDependenceOn.xml");
        System.out.println("容器启动完毕");
        System.out.println("容器准备关闭");
        context.close();
        System.out.println("容器关闭完毕");
    }
}
