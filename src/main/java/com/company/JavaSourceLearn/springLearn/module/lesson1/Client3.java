package com.company.JavaSourceLearn.springLearn.module.lesson1;

import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.DiOtherTypeModel;
import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.MenuModel;
import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.PeopleModel;
import com.company.JavaSourceLearn.springLearn.module.lesson1.bean.PersonModel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : PersonModel注入
 * @date : 2021-04-04 10:46:51
 */

public class Client3 {


    private ClassPathXmlApplicationContext context;

    @Before
    public void builderContext() {
        // 加载xml文件
        this.context = new ClassPathXmlApplicationContext("classpath:/com/JavaSourceLearn/lesson1/personModel.xml");
    }

    @Test
    public void personModelIndex() {
        PersonModel personModelIndex1 = context.getBean("personModelIndex1", PersonModel.class);
        PersonModel personModelIndex2 = context.getBean("personModelIndex2", PersonModel.class);
        PersonModel personModelIndex3 = context.getBean("personModelIndex3", PersonModel.class);
        System.out.println(personModelIndex1);
        System.out.println(personModelIndex2);
        System.out.println(personModelIndex3);

        PersonModel diByConstructorParamType1 = context.getBean("diByConstructorParamType1", PersonModel.class);
        PersonModel diByConstructorParamType2 = context.getBean("diByConstructorParamType2", PersonModel.class);
        System.out.println(diByConstructorParamType1);
        System.out.println(diByConstructorParamType2);
        PersonModel diByConstructorParamName1 = context.getBean("diByConstructorParamName1", PersonModel.class);
        PersonModel diByConstructorParamName2 = context.getBean("diByConstructorParamName2", PersonModel.class);
        PersonModel diByConstructorParamName3 = context.getBean("diByConstructorParamName3", PersonModel.class);
        System.out.println(diByConstructorParamName1);
        System.out.println(diByConstructorParamName2);
        System.out.println(diByConstructorParamName3);
    }

    @Test
    public void personModelSetter() {
        MenuModel diBySetter1 = context.getBean("diBySetter1", MenuModel.class);
        MenuModel diBySetter2 = context.getBean("diBySetter2", MenuModel.class);
        MenuModel diBySetter3 = context.getBean("diBySetter3", MenuModel.class);
        System.out.println(diBySetter1);
        System.out.println(diBySetter2);
        System.out.println(diBySetter3);
    }

    @Test
    public void peopleModels() {
        PeopleModel idObjectBean1 = context.getBean("idObjectBean1", PeopleModel.class);
        PeopleModel idObjectBean2 = context.getBean("idObjectBean2", PeopleModel.class);
        PeopleModel idObjectBean3 = context.getBean("idObjectBean3", PeopleModel.class);
        System.out.println(idObjectBean1);
        System.out.println(idObjectBean2);
        System.out.println(idObjectBean3);
    }

    @Test
    public void diOtherPropertiesTest() {
        DiOtherTypeModel diOtherProperties = context.getBean("diOtherProperties", DiOtherTypeModel.class);
        System.out.println(diOtherProperties);
    }
}
