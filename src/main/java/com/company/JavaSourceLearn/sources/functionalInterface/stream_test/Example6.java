package com.company.JavaSourceLearn.sources.functionalInterface.stream_test;

import cn.hutool.core.lang.copier.Copier;
import cn.hutool.core.util.RandomUtil;
import com.company.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-10-14 21:20:24
 */
public class Example6 {
    public static void main(String[] args) {
        Copier<Student> studentCopier = () -> {
            Student student = new Student();
            student.setAge(RandomUtil.randomInt(100));
            student.setName(RandomUtil.randomString(6));
            return student;
        };
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(studentCopier.copy());
        }

        List<Student> list2 = new ArrayList<>();
        if (list.stream().peek(item -> {
            if (item.getAge() > 50) {
                list2.add(item);
            }
        }).anyMatch(item -> item.getAge() > 80)) {
            System.out.println("有年龄大于80");
        }
        System.out.println("--------------------");
        System.out.println(list);
        System.out.println("--------------------");
        System.out.println(list2);
    }
}
