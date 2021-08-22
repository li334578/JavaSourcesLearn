package com.company.JavaSourceLearn.thread.lesson05;

import org.junit.Test;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : redis分布式锁
 * @date : 2021-07-10 14:56:47
 */
@Component
public class RedisLock {

    @Resource
    private JedisPool jedisPool;
    private Jedis resource;


    @PostConstruct
    public void initMethod() {
        resource = jedisPool.getResource();
    }

    @Test
    public void testMethod() {
        resource.set("xxx", "123");
        System.out.println(1234);
    }

}
