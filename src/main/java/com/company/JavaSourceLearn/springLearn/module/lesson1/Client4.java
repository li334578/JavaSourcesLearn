package com.company.JavaSourceLearn.springLearn.module.lesson1;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.DiAutowireByConstructor;
import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.DiAutowireByName;
import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.DiAutowireByType;
import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.DiAutowireByTypeExtend;
import com.sun.javaws.IconUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 自动注入
 * @date : 2021-04-04 13:05:28
 */
public class Client4 {

    private ClassPathXmlApplicationContext context;

    @Test
    public void isAssignableFrom() {
        boolean assignableFrom = Integer.class.isAssignableFrom(String.class);
        System.out.println(assignableFrom);
    }


    @Before
    public void afterMethods() {
        context = new ClassPathXmlApplicationContext("classpath:/com/JavaSourceLearn/lesson1/AutoWireBean.xml");
    }

    @Test
    public void testAutoWire() {
        DiAutowireByName autoWire1 = context.getBean("autoWire1", DiAutowireByName.class);
        DiAutowireByName autoWire2 = context.getBean("autoWire2", DiAutowireByName.class);
        System.out.println(autoWire1);
        System.out.println(autoWire2);
        System.out.println("===================");
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void testAutoWire2() {
        context = new ClassPathXmlApplicationContext("classpath:/com/JavaSourceLearn/lesson1/AutoWireBean2.xml");
        DiAutowireByType autowire3 = context.getBean("autowire3", DiAutowireByType.class);
        System.out.println(autowire3);
    }

    @Test
    public void testAutoWire3() {
        context = new ClassPathXmlApplicationContext("classpath:/com/JavaSourceLearn/lesson1/diAutowireByTypeExtend.xml");
        DiAutowireByTypeExtend diAutowireByTypeExtend = context.getBean("diAutowireByTypeExtend", DiAutowireByTypeExtend.class);
        System.out.println(diAutowireByTypeExtend.getBaseServiceList());
        System.out.println(diAutowireByTypeExtend.getBaseServiceMap());
        System.out.println(diAutowireByTypeExtend.getService1Map());
        System.out.println(diAutowireByTypeExtend.getServiceList());
        System.out.println("----");
        System.out.println(diAutowireByTypeExtend);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }

    @Test
    public void testAutowireByConstructor() {
        // diAutowireByConstructor.xml
        context = new ClassPathXmlApplicationContext("classpath:/com/JavaSourceLearn/lesson1/diAutowireByConstructor.xml");
        DiAutowireByConstructor diAutowireByConstructor = context.getBean("diAutowireByConstructor", DiAutowireByConstructor.class);
        System.out.println(diAutowireByConstructor);
    }

    @Test
    public void testAutowireByDefault() {
        // diAutowireByDefault.xml
        context = new ClassPathXmlApplicationContext("classpath:/com/JavaSourceLearn/lesson1/diAutowireByDefault.xml");
        DiAutowireByName autowireByDefault1 = context.getBean("autowireByDefault1", DiAutowireByName.class);
        DiAutowireByName autowireByDefault2 = context.getBean("autowireByDefault2", DiAutowireByName.class);
        System.out.println(autowireByDefault1);
        System.out.println(autowireByDefault2);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }


    }
}
