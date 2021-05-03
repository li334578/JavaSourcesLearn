package com.company.JavaSourceLearn.springLearn.module.lesson11;

import com.company.JavaSourceLearn.springLearn.module.lesson9.Car;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.lang.Nullable;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-20 19:56:39
 */
public class InstantiationAwareBeanPostProcessorTest {
    @Test
    public void testMethod1() {

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        // 添加一个BeanPostProcessor：InstantiationAwareBeanPostProcessor
        // 创建了一个InstantiationAwareBeanPostProcessor，丢到了容器中的BeanPostProcessor列表中
        factory.addBeanPostProcessor(new InstantiationAwareBeanPostProcessor() {
            @Nullable
            @Override
            public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
                System.out.println("调用postProcessBeforeInstantiation()");
                //发现类型是Car类型的时候，硬编码创建一个Car对象返回
                if (beanClass == Car.class) {
                    Car car = new Car();
                    car.setName("保时捷");
                    return car;
                }
                return null;
            }
        });

        // 定义一个car bean,车名为：奥迪
        AbstractBeanDefinition carBeanDefinition = BeanDefinitionBuilder.
                genericBeanDefinition(Car.class).
                addPropertyValue("name", "奥迪").
                getBeanDefinition();
        factory.registerBeanDefinition("car", carBeanDefinition);
        //从容器中获取car这个bean的实例，输出
        System.out.println(factory.getBean("car"));
        /*实际上，在实例化前阶段对bean的创建进行干预的情况，用的非常少，所以大部分bean的创建还会继续走下面的阶段。*/
    }

}
