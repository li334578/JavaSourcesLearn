package com.company.JavaSourceLearn.springLearn.module.lesson2.bean2;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-05 12:18:52
 */
@Data
public class ServiceC implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    private ServiceA serviceA;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
