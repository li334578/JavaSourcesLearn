package com.company.JavaSourceLearn.springLearn.module.lesson2.bean2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : IService的代理类
 * @date : 2021-04-05 13:09:30
 */
public class ServiceProxy implements IService {

    //目标对象，被代理的对象
    private IService target;

    public ServiceProxy(IService target) {
        this.target = target;
    }

    @Override
    public void method1() {
        long starTime = System.nanoTime();
        this.target.method1();
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass() + ".method1()方法耗时(纳秒):" + (endTime - starTime));

    }

    @Override
    public void method2() {
        long starTime = System.nanoTime();
        this.target.method2();
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass() + ".method2()方法耗时(纳秒):" + (endTime - starTime));
    }

    @Override
    public void method3() {
        long starTime = System.nanoTime();
        this.target.method3();
        long endTime = System.nanoTime();
        System.out.println(this.target.getClass() + ".method3()方法耗时(纳秒):" + (endTime - starTime));
    }
}
