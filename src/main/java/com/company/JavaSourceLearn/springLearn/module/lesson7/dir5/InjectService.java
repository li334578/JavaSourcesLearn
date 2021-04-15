package com.company.JavaSourceLearn.springLearn.module.lesson7.dir5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 20:29:27
 */
@Component
public class InjectService {

    @Autowired
    @Qualifier("tag1") //@1
    private Map<String, IService> serviceMap1;

    @Autowired
    @Qualifier("tag3") //@2
    private Map<String, IService> serviceMap2;

    @Override
    public String toString() {
        return "InjectService{" +
                "serviceMap1=" + serviceMap1 +
                ", serviceMap2=" + serviceMap2 +
                '}';
    }

}
