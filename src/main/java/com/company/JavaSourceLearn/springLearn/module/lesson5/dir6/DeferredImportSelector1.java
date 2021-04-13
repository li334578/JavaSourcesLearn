package com.company.JavaSourceLearn.springLearn.module.lesson5.dir6;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 15:28:15
 */
public class DeferredImportSelector1 implements DeferredImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                Configuration2.class.getName()
        };
    }
}
