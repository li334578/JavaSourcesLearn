package com.company.JavaSourceLearn.springLearn.module.lesson7.dir7;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-04-13 20:54:47
 */
public class BaseService<T> {

    @Autowired
    private IDao<T> dao; //@1

    public IDao<T> getDao() {
        return dao;
    }

    public void setDao(IDao<T> dao) {
        this.dao = dao;
    }
}
