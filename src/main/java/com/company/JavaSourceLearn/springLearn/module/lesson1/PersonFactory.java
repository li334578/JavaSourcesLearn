package com.company.JavaSourceLearn.springLearn.module.lesson1;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.Person;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Person工厂
 * @date : 2021-04-03 14:26:55
 */
public class PersonFactory {

    public Person getNoArgPerson() {
        System.out.println("PersonFactory getNoArgPerson create");
        Person person = new Person();
        person.setId(1001);
        person.setName("无参工厂创建");
        return person;
    }

    public Person getAllArgPerson(Integer id, String name) {
        System.out.println("PersonFactory getAllArgPerson create");
        Person person = new Person(id, name);
        return person;
    }
}
