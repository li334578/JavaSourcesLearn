package com.company.JavaSourceLearn.springLearn.module.lesson7.dir1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 19:56:47
 */
@Component
public class Service2 {

    @Autowired
    private Service1 service1;

    public Service2() {
        System.out.println("无参构造器");
    }

//    @Autowired
//    public Service2(Service1 service1) {
//        System.out.println("有参构造器");
//        this.service1 = service1;
//    }

//    @Autowired
//    public void injectService1(Service1 service1) { //@1
//        System.out.println("injectService1()普通方法注入");
//        this.service1 = service1;
//    }


//    @Autowired
//    public void setService1(Service1 service1) {
//        System.out.println("通过setter方法注入");
//        this.service1 = service1;
//    }

//    @Autowired
//    public void injectService2(Service1 service1, String name) { //@1
//        System.out.println(String.format("%s.injectService2(),{service1=%s,name=%s}",
//                this.getClass().getName(), service1, name));
//        this.service1 = service1;
//    }

//    @Autowired
//    public void injectService2(Service1 service1, @Autowired(required = false) String name) { //@1
//        System.out.println(String.format("%s.injectService2(),{service1=%s,name=%s}",
//                this.getClass().getName(), service1, name));
//        this.service1 = service1;
//    }


    @Override
    public String toString() {
        return "Service2{" +
                "service1=" + service1 +
                '}';
    }
}
