package com.company.JavaSourceLearn.springLearn.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-12 20:41:58
 */
@Service
public class TestService1 {

    @Transactional(rollbackFor = Exception.class)
    public String test1() {

        int a = 1 / 0; // @1
        try {
            test2();
        } catch (Exception e) {
            e.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return "fail";
        }
        System.out.println("123");
        return "success";
    }


    public void test2() throws Exception {
        int a = 1 / 0; // @2
    }
}
