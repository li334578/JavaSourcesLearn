package main.java.com.company.JavaSourceLearn.sources.functionalInterface;

import java.util.List;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : 公司类
 * @date : 2021-01-16 15:02:17
 */
public class Company {
    private String name;
    private List<Employee> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getList() {
        return list;
    }

    public void setList(List<Employee> list) {
        this.list = list;
    }
}
