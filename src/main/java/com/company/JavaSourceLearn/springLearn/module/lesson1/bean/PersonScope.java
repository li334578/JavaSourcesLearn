package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-03 20:33:40
 */
public class PersonScope {

//    private String scopeName;

    public PersonScope(String scopeName) {
        System.out.print(scopeName + "->");
        System.out.println(this);
    }
}
