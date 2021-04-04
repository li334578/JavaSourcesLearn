package com.company.JavaSourceLearn.springLearn.module.lesson1;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.Person;
import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.PersonScope;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 测试bean的scope
 * @date : 2021-04-03 20:27:52
 */
public class Client2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:/com/JavaSourceLearn/lesson1/scope.xml");
        PersonScope personScope1 = context.getBean("personScope1", PersonScope.class);
        PersonScope personScope2 = context.getBean("personScope1", PersonScope.class);
        System.out.println(personScope1);
        System.out.println(personScope2);
    }

    ClassPathXmlApplicationContext classPathXmlApplicationContext;

    @Before
    public void beforeMethod() {
        System.out.println("Spring容器准备启动");
        classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/com/JavaSourceLearn/lesson1/scope.xml");
        System.out.println("Spring容器启动完毕");
    }

    @Test
    public void singletonBean() {
        System.out.println("单例bean模式 只能获取到同一个Bean对象");
        PersonScope personScope1 = classPathXmlApplicationContext.getBean("personScope1", PersonScope.class);
        PersonScope personScope2 = classPathXmlApplicationContext.getBean("personScope1", PersonScope.class);
        PersonScope personScope3 = classPathXmlApplicationContext.getBean("personScope1", PersonScope.class);
        PersonScope personScope4 = classPathXmlApplicationContext.getBean("personScope1", PersonScope.class);
        PersonScope personScope5 = classPathXmlApplicationContext.getBean("personScope1", PersonScope.class);
        System.out.println(personScope1);
        System.out.println(personScope2);
        System.out.println(personScope3);
        System.out.println(personScope4);
        System.out.println(personScope5);
    }

    @Test
    public void prototypeBean() {
        System.out.println("多例bean模式 只能获取到同一个Bean对象");
        PersonScope personScope1 = classPathXmlApplicationContext.getBean("personScope2", PersonScope.class);
        PersonScope personScope2 = classPathXmlApplicationContext.getBean("personScope2", PersonScope.class);
        PersonScope personScope3 = classPathXmlApplicationContext.getBean("personScope2", PersonScope.class);
        PersonScope personScope4 = classPathXmlApplicationContext.getBean("personScope2", PersonScope.class);
        PersonScope personScope5 = classPathXmlApplicationContext.getBean("personScope2", PersonScope.class);
        System.out.println(personScope1);
        System.out.println(personScope2);
        System.out.println(personScope3);
        System.out.println(personScope4);
        System.out.println(personScope5);
    }
}
