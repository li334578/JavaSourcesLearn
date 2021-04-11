package com.company.JavaSourceLearn.springLearn.module.lesson4;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-07 20:44:53
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface MyAnnoBean2 {
    @AliasFor(annotation = Component.class)
    String value();
}
