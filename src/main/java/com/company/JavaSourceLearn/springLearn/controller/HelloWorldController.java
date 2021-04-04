package com.company.JavaSourceLearn.springLearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : controller测试
 * @date : 2021-04-03 12:41:35
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String helloWorld() {
        return "hello world";
    }
}
