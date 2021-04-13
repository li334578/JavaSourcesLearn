package com.company.JavaSourceLearn.springLearn.module.lesson5.dir4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 13:45:22
 */
@Configuration
public class Module1Config {
    @Bean
    public String name() {
        return "lwb";
    }

    @Bean
    public String address() {
        return "上海市";
    }

}
