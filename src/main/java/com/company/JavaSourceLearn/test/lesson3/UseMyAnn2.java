package com.company.JavaSourceLearn.test.lesson3;

import com.company.JavaSourceLearn.springLearn.module.lesson3.Ann2;

import java.lang.annotation.ElementType;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-06 20:57:22
 */
@Ann2(value = "我用在类上", elementType = ElementType.TYPE)
public class UseMyAnn2 {

    @Ann2(value = "我用在字段上", elementType = ElementType.FIELD)
    private String a;

    @Ann2(value = "我用在构造方法上", elementType = ElementType.CONSTRUCTOR)
    public UseMyAnn2(@Ann2(value = "我用在方法参数上", elementType = ElementType.PARAMETER) String a) {
        this.a = a;
    }

    @Ann2(value = "我用在了普通方法上面", elementType = ElementType.METHOD)
    public void m1() {
        @Ann2(value = "我用在了本地变量上", elementType = ElementType.LOCAL_VARIABLE) String a;
    }

}
