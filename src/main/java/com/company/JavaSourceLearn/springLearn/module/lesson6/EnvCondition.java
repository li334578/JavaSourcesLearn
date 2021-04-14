package com.company.JavaSourceLearn.springLearn.module.lesson6;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 19:58:20
 */
public class EnvCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        //当前需要使用的环境
//        EnvConditional.Env curEnv = EnvConditional.Env.DEV; //@1
        EnvConditional.Env curEnv = EnvConditional.Env.TEST;
//        EnvConditional.Env curEnv = EnvConditional.Env.PROD;
        //获取使用条件的类上的EnvCondition注解中对应的环境
        EnvConditional.Env env = (EnvConditional.Env) metadata.getAllAnnotationAttributes(EnvConditional.class.getName()).get("value").get(0);
        return env.equals(curEnv);
    }
}
