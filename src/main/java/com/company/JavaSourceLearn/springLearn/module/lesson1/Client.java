package com.company.JavaSourceLearn.springLearn.module.lesson1;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-03 13:27:04
 */
public class Client {
    public static void main(String[] args) {
        // bean配置文件位置
        String classpath = "classpath:/com/JavaSourceLearn/lesson1/beans.xml";
        // 创建ClassPathXmlApplicationContext
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(classpath);
        // 从容器中获得需要的bean
        HelloWorld helloWord = context.getBean("helloWorld", HelloWorld.class);
        // 使用对象
        helloWord.say();

        Person person1 = context.getBean("person1", Person.class);
        Person person2 = context.getBean("person2", Person.class);
        Person person3 = context.getBean("person3", Person.class);
        Person person3_1 = context.getBean("person3_1", Person.class);
        String[] person4s = context.getAliases("person4");
        String[] person5s = context.getAliases("person5");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person3_1);
        System.out.println(Arrays.toString(person4s));
        System.out.println(Arrays.toString(person5s));
        // beans.xml所有bean名称
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanDefinitionNames));
        // 通过bean名称获取bean及bean的别名信息
        for (String beanName : beanDefinitionNames) {
            System.out.print(beanName + "的beanName列表是->");
            System.out.println(Arrays.toString(context.getAliases(beanName)));
        }
        System.out.println("==============================");
        // 通过构造函数创建的bean对象
        Person person7 = context.getBean("person7", Person.class);
        System.out.println(person7);
        // 静态工厂方式创建person
        Person person8 = context.getBean("person8", Person.class);
        Person person9 = context.getBean("person9", Person.class);
        System.out.println(person8);
        System.out.println(person9);
        // beanFactory方式创建person
        Person person10 = context.getBean("person10", Person.class);
        Person person11 = context.getBean("person11", Person.class);
        System.out.println(person10);
        System.out.println(person11);
        // beanFactory实现类创建bean
        Person person12 = context.getBean("person12", Person.class);
        Person person13 = context.getBean("person12", Person.class);
        System.out.println(person12);
        System.out.println(person13);

    }
}
