package com.company.JavaSourceLearn.springLearn.module.lesson7.dir2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 20:11:04
 */
@Component
public class Service2 implements IService {
    @Autowired
    private IService service1;

    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
