package com.company.JavaSourceLearn.sources.functionalInterface;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 员工类
 * @date : 2021-01-16 15:01:57
 */
public class Employee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
