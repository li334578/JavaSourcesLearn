package com.company.JavaSourceLearn.springLearn.module.lesson4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-07 20:46:38
 */
@ComponentScan(includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = MyAnnoBean.class)
})
public class MyBean3 {
}
