package com.company.JavaSourceLearn.springLearn.module.lesson9;

import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.*;

import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-14 20:45:30
 */
public class TestClass {

    @Test
    public void testMethod1() {
        // 指定bean的class
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Car.class.getName());
        // 获取BeanDefinition
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        System.out.println(beanDefinition); // <=> <bean class="com.javacode2018.lesson002.demo1.Car" />
    }

    @Test
    public void testMethod2() {
        // 指定Bean的class
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Car.class.getName());
        beanDefinitionBuilder.addPropertyValue("name", "特斯拉Model X");
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        System.out.println(beanDefinition);
        // 创建spring容器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerBeanDefinition("car", beanDefinition);
        Car car = factory.getBean("car", Car.class);
        System.out.println(car);
    }

    @Test
    public void testMethod3() {
        BeanDefinition carBeanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Car.class.getName())
                .addPropertyValue("name", "特斯拉 Model S").getBeanDefinition();
        BeanDefinition userBeanDefinition = BeanDefinitionBuilder.rootBeanDefinition(User.class.getName())
                .addPropertyValue("name", "法外狂徒 张三")
                .addPropertyReference("car", "car")
                .getBeanDefinition();
        // 创建spring容器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerBeanDefinition("car", carBeanDefinition);
        factory.registerBeanDefinition("user", userBeanDefinition);
        System.out.println(factory.getBean("car"));
        System.out.println(factory.getBean("user"));
        /*
        *   上面的代码等价于
        *   <bean id="car" class="com.javacode2018.lesson002.demo1.Car">
                <property name="name" value="奥迪"/>
            </bean>

            <bean id="user" class="com.javacode2018.lesson002.demo1.User">
                <property name="name" value="马士兵老师"/>
                <property name="car" ref="car"/>
            </bean>
        * */
    }

    @Test
    public void testMethod4() {
        BeanDefinition carBeanDefinition1 = BeanDefinitionBuilder.rootBeanDefinition(Car.class.getName())
                .addPropertyValue("name", "劳斯莱斯 幻影").getBeanDefinition();
        BeanDefinition carBeanDefinition2 = BeanDefinitionBuilder
                .genericBeanDefinition().setParentName("car1").getBeanDefinition();
        // 创建spring容器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerBeanDefinition("car1", carBeanDefinition1);
        factory.registerBeanDefinition("car2", carBeanDefinition2);
        //从容器中获取car1
        System.out.println(String.format("car1->%s", factory.getBean("car1")));
        //从容器中获取car2
        System.out.println(String.format("car2->%s", factory.getBean("car2")));
        /*
        *  以上代码等价于
        *   <bean id="car1" class="com.javacode2018.lesson002.demo1.Car">
                <property name="name" value="保时捷"/>
            </bean>
            <bean id="car2" parent="car1" />
        *
        * */
    }


    @Test
    public void testMethod5() {
        BeanDefinition carBeanDefinition1 = BeanDefinitionBuilder.rootBeanDefinition(Car.class.getName())
                .addPropertyValue("name", "林肯 Plus").getBeanDefinition();
        BeanDefinition carBeanDefinition2 = BeanDefinitionBuilder.rootBeanDefinition(Car.class.getName())
                .addPropertyValue("name", "悍马 Plus").getBeanDefinition();
        //定义CompositeObj这个bean
        //创建stringList这个属性对应的值
        ManagedList<String> stringList = new ManagedList<>();
        stringList.addAll(Arrays.asList("Spring", "Primary", "singleton", "prototype"));
        //创建carList这个属性对应的值,内部引用其他两个bean的名称[car1,car2]
        ManagedList<RuntimeBeanReference> carList = new ManagedList<>();
        carList.add(new RuntimeBeanReference("car1"));
        carList.add(new RuntimeBeanReference("car2"));

        //创建stringList这个属性对应的值
        ManagedSet<String> stringSet = new ManagedSet<>();
        stringSet.addAll(Arrays.asList("swagger", "backup", "review"));

        //创建carSet这个属性对应的值,内部引用其他两个bean的名称[car1,car2]
        ManagedList<RuntimeBeanReference> carSet = new ManagedList<>();
        carSet.add(new RuntimeBeanReference("car1"));
        carSet.add(new RuntimeBeanReference("car2"));

        //创建stringMap这个属性对应的值
        ManagedMap<String, String> stringMap = new ManagedMap<>();
        stringMap.put("系列1", "java高并发系列");
        stringMap.put("系列2", "Maven高手系列");
        stringMap.put("系列3", "mysql系列");

        ManagedMap<String, RuntimeBeanReference> stringCarMap = new ManagedMap<>();
        stringCarMap.put("car1", new RuntimeBeanReference("car1"));
        stringCarMap.put("car2", new RuntimeBeanReference("car2"));


        //下面我们使用原生的api来创建BeanDefinition
        GenericBeanDefinition compositeObj = new GenericBeanDefinition();
        compositeObj.setBeanClassName(CompositeObj.class.getName());
        compositeObj.getPropertyValues().add("name", "马士兵老师").
                add("salary", 50000).
                add("car1", new RuntimeBeanReference("car1")).
                add("stringList", stringList).
                add("carList", carList).
                add("stringSet", stringSet).
                add("carSet", carSet).
                add("stringMap", stringMap).
                add("stringCarMap", stringCarMap);

        //将上面bean 注册到容器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerBeanDefinition("car1", carBeanDefinition1);
        factory.registerBeanDefinition("car2", carBeanDefinition2);
        factory.registerBeanDefinition("compositeObj", compositeObj);

        //下面我们将容器中所有的bean输出
        for (String beanName : factory.getBeanDefinitionNames()) {
            System.out.println(String.format("%s->%s", beanName, factory.getBean(beanName)));
        }

        /*
        *
        *   RuntimeBeanReference：用来表示bean引用类型，类似于xml中的ref
            ManagedList：属性如果是List类型的，t需要用到这个类进行操作，这个类继承了ArrayList
            ManagedSet：属性如果是Set类型的，t需要用到这个类进行操作，这个类继承了LinkedHashSet
            ManagedMap：属性如果是Map类型的，t需要用到这个类进行操作，这个类继承了LinkedHashMap
        * */

        /*
        * properties文件的方式
          这种方式估计大家比较陌生，将bean定义信息放在properties文件中，然后通过解析器将配置信息解析为BeanDefinition对象。
          properties内容格式如下：
          employee.(class)=MyClass       // 等同于：<bean class="MyClass" />
          employee.(abstract)=true       // 等同于：<bean abstract="true" />
          employee.group=Insurance       // 为属性设置值，等同于：<property name="group" value="Insurance" />
          employee.usesDialUp=false      // 为employee这个bean中的usesDialUp属性设置值,等同于：等同于：<property name="usesDialUp" value="false" />

          salesrep.(parent)=employee     // 定义了一个id为salesrep的bean，指定父bean为employee，等同于：<bean id="salesrep" parent="employee" />
          salesrep.(lazy-init)=true      // 设置延迟初始化，等同于：<bean lazy-init="true" />
          salesrep.manager(ref)=tony     // 设置这个bean的manager属性值，是另外一个bean，名称为tony，等同于：<property name="manager" ref="tony" />
          salesrep.department=Sales      // 等同于：<property name="department" value="Sales" />

          techie.(parent)=employee       // 定义了一个id为techie的bean，指定父bean为employee，等同于：<bean id="techie" parent="employee" />
          techie.(scope)=prototype       // 设置bean的作用域，等同于<bean scope="prototype" />
          techie.manager(ref)=jeff       // 等同于：<property name="manager" ref="jeff" />
          techie.department=Engineering  // <property name="department" value="Engineering" />
          techie.usesDialUp=true         // <property name="usesDialUp" value="true" />

          ceo.$0(ref)=secretary          // 设置构造函数第1个参数值，等同于：<constructor-arg index="0" ref="secretary" />
          ceo.$1=1000000                 // 设置构造函数第2个参数值，等同于：<constructor-arg index="1" value="1000000" />
        *
        * */
    }

}
