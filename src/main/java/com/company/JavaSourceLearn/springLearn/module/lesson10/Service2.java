package com.company.JavaSourceLearn.springLearn.module.lesson10;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-15 20:48:20
 */
@ToString
public class Service2 {

    @Autowired
    private Service1 service1;
}
