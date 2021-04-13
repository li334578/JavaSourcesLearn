package com.company.JavaSourceLearn.springLearn.module.lesson5.dir5;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 13:52:08
 */
public class MethodCostTimeImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{MethodCostTimeProxyBeanPostProcessor.class.getName()};
    }
}
