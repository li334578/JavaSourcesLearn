package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import lombok.Data;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 自动注入之构造注入
 * @date : 2021-04-04 14:11:39
 */
@Data
public class DiAutowireByConstructor {

    private Service1 service1;
    private Service2 service2;

    public DiAutowireByConstructor() {
    }

    public DiAutowireByConstructor(Service1 service1) {
        this.service1 = service1;
    }

    public DiAutowireByConstructor(Service2 service2) {
        this.service2 = service2;
    }

    public DiAutowireByConstructor(Service1 service1, Service2 service2) {
        this.service1 = service1;
        this.service2 = service2;
    }

    @Data
    private static class BaseService {
        private String serviceName;
    }

    private static class Service1 extends BaseService {

    }

    public static class Service2 extends BaseService {

    }
}
