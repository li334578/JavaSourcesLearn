package com.company.JavaSourceLearn.test.threadTest;

import com.company.JavaSourceLearn.springLearn.service.TestService1;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:52:38
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Mytest {

    @Resource
    private TestService1 testService1;

    public void test1() {
        System.out.println(testService1.test1());
    }
}
