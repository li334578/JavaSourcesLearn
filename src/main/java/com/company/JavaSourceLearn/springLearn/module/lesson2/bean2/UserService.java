package com.company.JavaSourceLearn.springLearn.module.lesson2.bean2;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-05 19:32:17
 */
public class UserService implements IUserService {
    @Override
    public void insert(String name) {
        System.out.println(name + "用户插入成功");
    }
}
