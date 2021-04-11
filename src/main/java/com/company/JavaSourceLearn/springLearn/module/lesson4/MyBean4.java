package com.company.JavaSourceLearn.springLearn.module.lesson4;

import com.company.JavaSourceLearn.springLearn.module.lesson2.bean2.IService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-10 20:05:21
 */
@ComponentScan(basePackageClasses = MyBean1.class)
@ComponentScan(
        useDefaultFilters = false, //不启用默认过滤器
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = IService.class)
        })
public class MyBean4 {
}
