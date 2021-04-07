package com.company.JavaSourceLearn.springLearn.module.lesson2.bean2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-05 12:18:52
 */

public class ServiceE {
    private ServiceA serviceA;

    public void say() {
        System.out.println(getServiceA());
    }

    public void setServiceA(ServiceA serviceA) {
        this.serviceA = serviceA;
    }

    public ServiceA getServiceA() {
        return null;
    }
}
