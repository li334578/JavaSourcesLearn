package com.company.algorithm.hashTable;


/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 学生类
 * @date : 2021-03-17 21:18:45
 */
public class StudentInfo {
    private Integer age;
    private String name;

    public StudentInfo() {
    }

    public StudentInfo(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return age % 10;
    }
}
