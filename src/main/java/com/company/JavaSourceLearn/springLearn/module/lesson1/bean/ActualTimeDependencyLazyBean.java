package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import lombok.Data;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 延迟初始化bean被实时初始化bean依赖
 * @date : 2021-04-05 10:15:11
 */
@Data
public class ActualTimeDependencyLazyBean {

    private LazyInitBean lazyInitBean;

    public ActualTimeDependencyLazyBean() {
        System.out.println("ActualTimeDependencyLazyBean 被初始化");
    }
}
