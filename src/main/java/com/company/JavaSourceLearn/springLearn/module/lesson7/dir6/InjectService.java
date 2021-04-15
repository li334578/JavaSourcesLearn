package com.company.JavaSourceLearn.springLearn.module.lesson7.dir6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 20:40:17
 */
@Component
public class InjectService {

    @Autowired
    private IService service1; //@1

    @Override
    public String toString() {
        return "InjectService{" +
                "service1=" + service1 +
                '}';
    }

}
