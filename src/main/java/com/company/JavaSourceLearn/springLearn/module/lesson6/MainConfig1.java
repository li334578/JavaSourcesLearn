package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:40:23
 */
@Conditional(MyCondition1.class)
@Configuration
public class MainConfig1 {

    @Bean
    public String name() {
        return "lwb";
    }
}
