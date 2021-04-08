package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import lombok.Data;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 自动注入-名称
 * @date : 2021-04-04 13:08:37
 */
@Data
public class DiAutowireByName {

    private Service1 service1;
    private Service2 service2;

    @Data
    public static class Service1 {
        private String serviceName;
    }

    @Data
    public static class Service2 {
        private String serviceName;
    }

}
