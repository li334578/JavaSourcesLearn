package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:10:56
 */
@Order(1)
public class Condition1 implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        System.out.println(this.getClass().getName());
        return true;
    }
}
