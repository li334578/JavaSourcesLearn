package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:01:36
 */
@Configuration
@Import({ProdBeanConfig.class, TestBeanConfig.class, DevBeanConfig.class})
public class MainConfig4 {
}
