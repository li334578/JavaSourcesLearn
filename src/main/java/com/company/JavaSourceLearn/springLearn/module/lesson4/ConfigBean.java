package com.company.JavaSourceLearn.springLearn.module.lesson4;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-07 20:24:02
 */
@Configuration
public class ConfigBean {
    @Bean
    public Person person() {
        return new Person();
    }

    @Bean("person1")
    public Person person1() {
        return new Person();
    }

    @Bean({"person3Bean", "person3BeanAlias1", "person3BeanAlias2"})
    public Person person2() {
        return new Person();
    }
}
