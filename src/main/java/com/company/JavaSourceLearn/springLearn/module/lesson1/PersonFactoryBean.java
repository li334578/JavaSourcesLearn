package com.company.JavaSourceLearn.springLearn.module.lesson1;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-03 15:26:46
 */
public class PersonFactoryBean implements FactoryBean<Person> {


    // 此处用到了一个count，通过这个一会可以看出isSingleton不同返回值的时候从容器获取的bean是否是同一个
    private int counter = 2000;

    @Override
    public Person getObject() {
        return new Person(counter, "使用BeanFactory实现类创建的第" + counter++ + "个对象");
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        // 是否为单例
        return true;
    }
}
