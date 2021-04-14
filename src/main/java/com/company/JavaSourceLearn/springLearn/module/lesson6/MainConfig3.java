package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:52:04
 */
@Configuration
@Import({BeanConfig1.class, BeanConfig2.class})
public class MainConfig3 {
}
