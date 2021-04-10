package com.company.JavaSourceLearn.springLearn.module.lesson3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-06 20:56:23
 */
@Target(value = {
        ElementType.TYPE,
        ElementType.METHOD,
        ElementType.FIELD,
        ElementType.PARAMETER,
        ElementType.CONSTRUCTOR,
        ElementType.LOCAL_VARIABLE
})
@Retention(RetentionPolicy.RUNTIME)
public @interface Ann2 {
    String value();

    ElementType elementType();

}
