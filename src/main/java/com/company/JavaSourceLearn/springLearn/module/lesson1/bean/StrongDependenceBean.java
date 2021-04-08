package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import org.springframework.beans.factory.DisposableBean;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : bean的加载和销毁顺序
 * @date : 2021-04-04 14:33:38
 */
public class StrongDependenceBean {


    /*
    DisposableBean接口，这个是spring容器提供的一个接口，
    这个接口中有个destroy方法，我们的bean类可以实现这个接口，
    当我们调用容器的close方法关闭容器的时候，spring会调用容器中所有bean的destory方法，
    用来做一些清理的工作，这个以后还会细讲的。
    */
    public static class Bean1 implements DisposableBean {

        public Bean1() {
            System.out.println(this.getClass() + "-> bean1 constructor");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + "-> bean1 destroy");
        }
    }

    public static class Bean2 implements DisposableBean {

        private Bean1 bean1;

        public Bean2(Bean1 bean1) {
            this.bean1 = bean1;
            System.out.println(this.getClass() + "-> bean2 constructor");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + "-> bean2 destroy");
        }
    }

    public static class Bean3 implements DisposableBean {

        private Bean2 bean2;

        public Bean3(Bean2 bean2) {
            this.bean2 = bean2;
            System.out.println(this.getClass() + "-> bean3 constructor");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println("bean3 destroy");
        }
    }
}
