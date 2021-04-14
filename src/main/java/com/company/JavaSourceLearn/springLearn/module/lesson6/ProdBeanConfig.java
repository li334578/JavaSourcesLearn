package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:57:16
 */
@EnvConditional(EnvConditional.Env.PROD)
@Configuration
public class ProdBeanConfig {

    @Bean
    public String name() {
        return "我是生产环境";
    }
}
