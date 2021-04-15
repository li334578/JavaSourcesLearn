package com.company.JavaSourceLearn.springLearn.module.lesson7.dir5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 20:22:51
 */
@Component
@Qualifier("tag1")
public class Service1 implements IService {
}
