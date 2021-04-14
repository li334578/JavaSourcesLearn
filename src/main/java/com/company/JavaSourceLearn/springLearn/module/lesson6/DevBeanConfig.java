package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:56:02
 */
@EnvConditional(EnvConditional.Env.DEV)
@Configuration
public class DevBeanConfig {

    @Bean
    public String name() {
        return "我是开发环境";
    }
}
