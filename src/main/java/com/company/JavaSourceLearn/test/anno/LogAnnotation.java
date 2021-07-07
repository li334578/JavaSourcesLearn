package com.company.JavaSourceLearn.test.anno;

import java.lang.annotation.*;

/**
 * @Author: liwenbo
 * @Date: 2021年05月25日
 * @Description:
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME) //注解保留到运行阶段
@Documented
public @interface LogAnnotation {

}
