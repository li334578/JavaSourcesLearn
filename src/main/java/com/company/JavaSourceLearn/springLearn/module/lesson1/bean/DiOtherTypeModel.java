package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 其他类型model
 * @date : 2021-04-04 11:23:50
 */
@Data
public class DiOtherTypeModel {
    private List<String> listProperties;
    private Set<Person> personProperties;
    private Map<String, String> mapProperties;
    private Integer[] arrayProperties;
    private Properties properties;
}
