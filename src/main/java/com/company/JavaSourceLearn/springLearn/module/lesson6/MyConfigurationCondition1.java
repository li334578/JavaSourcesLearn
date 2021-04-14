package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.ConfigurationCondition;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:29:30
 */
public class MyConfigurationCondition1 implements ConfigurationCondition {

    @Override
    public ConfigurationPhase getConfigurationPhase() {
        return ConfigurationPhase.REGISTER_BEAN; //@1
    }

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //获取spring容器
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //判断容器中是否存在Service类型的bean
        boolean existsService = !beanFactory.getBeansOfType(Service.class).isEmpty();
        return existsService;
    }
}
