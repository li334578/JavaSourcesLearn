package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.beans.ConstructorProperties;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 依赖注入方式Bean
 * @date : 2021-04-04 10:43:35
 */
@Data
public class PersonModel {
    private String name;
    private Integer age;
    private String description;

    public PersonModel() {
    }

    @ConstructorProperties(value = {"name"})
    public PersonModel(String name) {
        this.name = name;
    }

    @ConstructorProperties(value = {"name", "age"})
    public PersonModel(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @ConstructorProperties(value = {"name", "age", "description"})
    public PersonModel(String name, Integer age, String description) {
        this.name = name;
        this.age = age;
        this.description = description;
    }
}
