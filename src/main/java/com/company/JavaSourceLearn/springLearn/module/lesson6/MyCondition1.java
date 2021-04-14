package com.company.JavaSourceLearn.springLearn.module.lesson6;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:39:09
 */
public class MyCondition1 implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return false;
    }
}
