package com.company.JavaSourceLearn.springLearn.module.lesson5.dir5;

import org.springframework.stereotype.Component;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-11 13:49:08
 */
@Component
public class ServiceB {
    public void m1() {
        System.out.println(this.getClass() + ".m1()");
    }

}
