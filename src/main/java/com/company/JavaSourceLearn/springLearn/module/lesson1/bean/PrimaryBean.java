package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import lombok.Data;

import java.util.List;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 测试Primary
 * @date : 2021-04-04 15:42:45
 */
@Data
public class PrimaryBean {

    private IService iService;
    private List<IService> list;

    private interface IService {

    }

    private static class ServiceA implements IService {

    }

    private static class ServiceB implements IService {

    }
}
