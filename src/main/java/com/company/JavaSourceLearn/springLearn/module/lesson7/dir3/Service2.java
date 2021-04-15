package com.company.JavaSourceLearn.springLearn.module.lesson7.dir3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 20:11:04
 */
@Component
public class Service2 implements IService {
    @Autowired
    private List<IService> services;

    @Autowired
    private Map<String, IService> serviceMap;

    @Override
    public String toString() {
        return "Service2{\n" +
                "services=" + services +
                ", \n serviceMap=" + serviceMap +
                '}';
    }

}
