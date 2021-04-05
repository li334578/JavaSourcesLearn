package com.company.JavaSourceLearn.springLearn.module.lesson1;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.ThreadScope;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-03 21:27:33
 */
public class ThreadBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        configurableListableBeanFactory.registerScope("threadScope", new ThreadScope());
    }
}
