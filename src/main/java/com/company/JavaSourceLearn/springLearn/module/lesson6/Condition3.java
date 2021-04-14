package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:10:56
 */
public class Condition3 implements Condition, PriorityOrdered {
    @Override
    public int getOrder() {
        return 1000;
    }

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        System.out.println(this.getClass().getName());
        return true;
    }
}
