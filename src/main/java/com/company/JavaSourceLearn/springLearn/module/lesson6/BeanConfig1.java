package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:50:26
 */
@Configuration
public class BeanConfig1 {

    @Conditional(OnMissingBeanCondition.class)
    @Bean
    public IService service1() {
        return new Service1();
    }
}
