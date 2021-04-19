package com.company.JavaSourceLearn.springLearn.module.lesson9;

import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-14 21:04:31
 */
@Data
@ToString
public class CompositeObj {
    private String name;
    private Integer salary;

    private Car car1;
    private List<String> stringList;
    private List<Car> carList;

    private Set<String> stringSet;
    private Set<Car> carSet;

    private Map<String, String> stringMap;
    private Map<String, Car> stringCarMap;


}
