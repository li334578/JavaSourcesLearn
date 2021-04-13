package com.company.JavaSourceLearn.springLearn.module.lesson5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 13:20:12
 */
@Configuration
public class ConfigModule2 {

    @Bean
    public String module2() {
        return "ConfigModule2 module2";
    }
}
