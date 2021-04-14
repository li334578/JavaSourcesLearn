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
 * @date : 2021-04-12 19:48:22
 */
public class OnMissingBeanCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取bean工厂
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //从容器中获取IService类型bean
        assert beanFactory != null;
        Map<String, IService> serviceMap = beanFactory.getBeansOfType(IService.class);
        //判断serviceMap是否为空
        return serviceMap.isEmpty();
    }
}
