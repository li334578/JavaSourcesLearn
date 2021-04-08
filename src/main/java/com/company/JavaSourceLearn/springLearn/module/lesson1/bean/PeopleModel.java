package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import lombok.Data;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 类型Bean注入
 * @date : 2021-04-04 11:14:21
 */
@Data
public class PeopleModel {
    private String className;
    private Person person;

    public PeopleModel() {
    }

    public PeopleModel(String className) {
        this.className = className;
    }

    public PeopleModel(Person person) {
        this.person = person;
    }

    public PeopleModel(String className, Person person) {
        this.className = className;
        this.person = person;
    }
}
