package com.company.JavaSourceLearn.test.anno;

import java.lang.annotation.*;

/**
 * @Author: liwenbo
 * @Date: 2021年05月31日
 * @Description:
 */
@Target(ElementType.FIELD) // 作用于属性
@Retention(RetentionPolicy.RUNTIME) //注解保留到运行阶段
@Documented
public @interface MyNotEmpty {
}
