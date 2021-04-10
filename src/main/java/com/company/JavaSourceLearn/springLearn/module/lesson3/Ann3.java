package com.company.JavaSourceLearn.springLearn.module.lesson3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-06 20:59:21
 */
@Target(value = {
        ElementType.TYPE_PARAMETER
})
@Retention(RetentionPolicy.RUNTIME)
public @interface Ann3 {
    String value();
}
