package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:54:01
 */
@Conditional(EnvCondition.class) //@1
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnvConditional {
    enum Env {
        TEST, DEV, PROD
    }

    Env value() default Env.DEV;
}
