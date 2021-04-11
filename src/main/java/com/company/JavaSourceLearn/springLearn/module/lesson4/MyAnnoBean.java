package com.company.JavaSourceLearn.springLearn.module.lesson4;

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
public @interface MyAnnoBean {
}
