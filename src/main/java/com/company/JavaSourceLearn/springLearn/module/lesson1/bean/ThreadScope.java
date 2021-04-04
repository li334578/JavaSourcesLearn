package com.company.JavaSourceLearn.springLearn.module.lesson1.bean;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 线程内共享的scope
 * @date : 2021-04-03 21:06:54
 */
public class ThreadScope implements Scope {

    public ThreadScope() {
    }

    public ThreadScope(String scopeName) {
        System.out.println(Thread.currentThread().getName() + "创建了" + scopeName + "->" + this);
    }

    private static final String THREAD_SCOPE = "threadScope";

    private ThreadLocal<Map<String, Object>> beanMap = new ThreadLocal() {
        @Override
        protected Object initialValue() {
            return new HashMap<>();
        }
    };

    /**
     * 返回当前作用域中name对应的bean对象
     *
     * @param s             需要检索的bean的名称
     * @param objectFactory 如果name对应的bean在当前作用域中没有找到，那么可以调用这个ObjectFactory来创建这个对象
     * @return
     */
    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        Object bean = beanMap.get().get(s);
        if (Objects.isNull(bean)) {
            // bean为null
            bean = objectFactory.getObject();
            beanMap.get().put(s, bean);
        }
        return bean;
    }

    /**
     * 将name对应的bean从当前作用域中移除
     *
     * @param s bean的名称
     * @return
     */
    @Override
    public Object remove(String s) {
        return beanMap.get().remove(s);
    }

    /**
     * 用于注册销毁回调，如果想要销毁相应的对象,则由Spring容器注册相应的销毁回调，
     * 而由自定义作用域选择是不是要销毁相应的对象
     *
     * @param s        bean名称
     * @param runnable 回到函数callback
     */
    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {
        //bean作用域范围结束的时候调用的方法，用于bean清理
        System.out.println(s);
    }

    /**
     * 用于解析相应的上下文数据，比如request作用域将返回request中的属性
     *
     * @param s bean名称
     * @return
     */
    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    /**
     * 作用域的会话标识，比如session作用域将是sessionId
     *
     * @return
     */
    @Override
    public String getConversationId() {
        return Thread.currentThread().getName();
    }
}
