package com.company.JavaSourceLearn.test.anno;

import java.util.List;

/**
 * @Author: liwenbo
 * @Date: 2021年05月25日
 * @Description:
 */
public class TestBean {
    @LogAnnotation
    private Integer intPro;
    @LogAnnotation
    private Long longPro;
    @LogAnnotation
    private String stringPro;
    @LogAnnotation
    private List<String> stringsPro;

    public Integer getIntPro() {
        return intPro;
    }

    public void setIntPro(Integer intPro) {
        this.intPro = intPro;
    }

    public Long getLongPro() {
        return longPro;
    }

    public void setLongPro(Long longPro) {
        this.longPro = longPro;
    }

    public String getStringPro() {
        return stringPro;
    }

    public void setStringPro(String stringPro) {
        this.stringPro = stringPro;
    }

    public List<String> getStringsPro() {
        return stringsPro;
    }

    public void setStringsPro(List<String> stringsPro) {
        this.stringsPro = stringsPro;
    }
}
