package com.company.JavaSourceLearn.springLearn.module.lesson2.bean2;

import lombok.ToString;

import java.util.Random;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-05 12:17:30
 */
@ToString
public class ServiceA {
    private String serviceName;

    public ServiceA() {
        Random random = new Random();
        serviceName = "name->" + random.nextInt(10);
    }
}
