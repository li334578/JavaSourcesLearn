package com.company.JavaSourceLearn.springLearn.module.lesson7.dir4;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 20:22:51
 */
@Component
public class Service2 implements IService {

    @Resource
    private IService service0;

    @Override
    public String toString() {
        return "Service2{" +
                "service0=" + service0 +
                '}';
    }
}
