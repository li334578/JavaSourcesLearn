package com.company.JavaSourceLearn.springLearn.module.lesson8;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-14 20:17:50
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ServiceA {
}
