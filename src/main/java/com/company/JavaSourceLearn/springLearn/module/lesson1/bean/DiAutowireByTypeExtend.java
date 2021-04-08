package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-04 13:30:22
 */
@Data
public class DiAutowireByTypeExtend {

    private List<IService1> serviceList;
    private List<BaseService1> baseServiceList;
    private Map<String, IService1> service1Map;
    private Map<String, BaseService1> baseServiceMap;


    // 定义接口
    public interface IService1 {

    }

    @Data
    public static class BaseService1 {
        private String serviceName;
    }

    public static class Service1 extends BaseService1 implements IService1 {

    }

    public static class Service2 extends BaseService1 implements IService1 {

    }

}
