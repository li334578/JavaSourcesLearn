package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:12:10
 */
@Configuration
@Import({Condition1.class,Condition2.class,Condition3.class})
public class MainConfig5 {
}
