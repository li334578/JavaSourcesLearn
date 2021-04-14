package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:55:29
 */
@Configuration
@EnvConditional(EnvConditional.Env.TEST)
public class TestBeanConfig {

    @Bean
    public String name() {
        return "我是测试环境!";
    }
}
