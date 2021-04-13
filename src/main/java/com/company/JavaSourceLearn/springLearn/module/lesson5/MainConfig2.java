package com.company.JavaSourceLearn.springLearn.module.lesson5;

import org.springframework.context.annotation.Import;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 13:21:33
 */
@Import({ConfigModule1.class, ConfigModule2.class})
public class MainConfig2 {
}
