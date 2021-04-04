package com.company.JavaSourceLearn.springLearn.module.lesson1;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.Person;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Person静态工厂
 * @date : 2021-04-03 14:13:18
 */
public class PersonStaticFactory {
    public static Person getNoArgsInstance() {
        System.out.println("PersonStaticFactory getNoArgsInstance create Person");
        Person person = new Person();
        person.setId(1000);
        person.setName("静态工厂无参创建");
        return person;
    }

    public static Person getAllArgsInstance(Integer id, String name) {
        System.out.println("PersonStaticFactory getAllArgsInstance create Person");
        Person person = new Person(id, name);
        return person;
    }
}
