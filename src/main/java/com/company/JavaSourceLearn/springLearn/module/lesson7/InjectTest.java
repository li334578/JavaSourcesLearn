package com.company.JavaSourceLearn.springLearn.module.lesson7;

import com.company.JavaSourceLearn.springLearn.module.lesson7.dir1.MainConfig0;
import com.company.JavaSourceLearn.springLearn.module.lesson7.dir2.MainConfig1;
import com.company.JavaSourceLearn.springLearn.module.lesson7.dir3.MainConfig2;
import com.company.JavaSourceLearn.springLearn.module.lesson7.dir4.MainConfig3;
import com.company.JavaSourceLearn.springLearn.module.lesson7.dir5.MainConfig4;
import com.company.JavaSourceLearn.springLearn.module.lesson7.dir6.MainConfig5;
import com.company.JavaSourceLearn.springLearn.module.lesson7.dir6.MainConfig6;
import com.company.JavaSourceLearn.springLearn.module.lesson7.dir7.MainConfig7;
import com.company.JavaSourceLearn.springLearn.module.lesson7.dir7.OrderService;
import com.company.JavaSourceLearn.springLearn.module.lesson7.dir7.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 19:59:37
 */

public class InjectTest {

    @Test
    public void testMethod0() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig0.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void testMethod1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig1.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void testMethod2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void testMethod3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig3.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void testMethod4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig4.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void testMethod5() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig5.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void testMethod6() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig6.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, context.getBean(beanName)));
        }
    }

    @Test
    public void testMethod7() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig7.class);
        // dao属性并没有指定具体需要注入那个bean，此时是根据尖括号中的泛型类型来匹配的
        System.out.println(context.getBean(UserService.class).getDao());
        System.out.println(context.getBean(OrderService.class).getDao());
    }
}
