package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:24:24
 */
public class MyCondition2 implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        Map<String, Service> beansOfType = beanFactory.getBeansOfType(Service.class);
        return !beansOfType.isEmpty();
    }
}
