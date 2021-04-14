package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:20:14
 */
@Configuration
@Import({BeanConfigA.class, BeanConfigB.class})
public class MainConfig6 {
}
