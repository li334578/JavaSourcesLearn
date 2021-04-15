package com.company.JavaSourceLearn.springLearn.module.lesson7.dir6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 20:43:54
 */
@Configuration
public class MainConfig6 {
    @Bean
    public IService service1() {
        return new Service1();
    }

    @Bean
    @Primary //@1
    public IService service2() {
        return new Service2();
    }

    @Bean
    public InjectService injectService() {
        return new InjectService();
    }

}
