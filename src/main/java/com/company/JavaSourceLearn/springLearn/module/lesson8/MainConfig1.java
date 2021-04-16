package com.company.JavaSourceLearn.springLearn.module.lesson8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-14 20:24:34
 */
@Configuration
public class MainConfig1 {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    ServiceA serviceA() {
        return new ServiceA();
    }
}
