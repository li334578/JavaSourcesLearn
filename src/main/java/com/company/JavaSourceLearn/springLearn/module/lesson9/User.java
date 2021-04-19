package com.company.JavaSourceLearn.springLearn.module.lesson9;

import lombok.Data;
import lombok.ToString;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-14 20:53:44
 */
@Data
@ToString
public class User {
    private String name;
    private Car car;
}
