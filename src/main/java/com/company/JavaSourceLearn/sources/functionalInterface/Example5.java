package com.company.JavaSourceLearn.sources.functionalInterface;

import java.util.Collections;
import java.util.Optional;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-01-16 15:02:57
 */
public class Example5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("张三");
        Employee employee2 = new Employee();
        employee2.setName("李四");
        Company company = new Company();
        company.setName("腾讯");
//        company.setList(Arrays.asList(employee1, employee2));
        Optional<Company> optionalCompany = Optional.ofNullable(company);
        System.out.println(optionalCompany.map(Company::getList).orElse(Collections.emptyList()));
    }
}
