package com.company.JavaSourceLearn.test.lesson3;

import com.company.JavaSourceLearn.springLearn.module.lesson3.Ann3;

import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-06 20:59:51
 */
public class UseMyAnn3<@Ann3("声明在类上的") T0, @Ann3("声明在类上的") T1> {

    public <@Ann3("T2是在方法上声明的泛型类型变量") T2> void m1() {
    }


    public static void main(String[] args) throws NoSuchMethodException {
        for (TypeVariable<Class<UseMyAnn3>> typeParameter : UseMyAnn3.class.getTypeParameters()) {
            printMethod(typeParameter);
        }
        for (TypeVariable typeVariable : UseMyAnn3.class.getDeclaredMethod("m1").getTypeParameters()) {
            printMethod(typeVariable);
        }

    }

    private static void printMethod(TypeVariable typeVariable) {
        System.out.println("类型变量名称:" + typeVariable.getName());
        Arrays.stream(typeVariable.getAnnotations()).forEach(System.out::println);
    }

}
