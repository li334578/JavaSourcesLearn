package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:18:49
 */
@Configuration
@Conditional(MyConfigurationCondition1.class)
public class BeanConfigB {
    @Bean
    public String name() {
        return "lwb";
    }

}
