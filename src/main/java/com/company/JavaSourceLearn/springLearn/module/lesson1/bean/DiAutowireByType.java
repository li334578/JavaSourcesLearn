package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import lombok.Data;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 自动注入-类型
 * @date : 2021-04-04 13:22:46
 */
@Data
public class DiAutowireByType {
    private DiAutowireByName.Service1 service1;
    private DiAutowireByName.Service2 service2;

    @Data
    public static class Service1 {
        private String serviceName;
    }

    @Data
    public static class Service2 {
        private String serviceName;
    }
}
