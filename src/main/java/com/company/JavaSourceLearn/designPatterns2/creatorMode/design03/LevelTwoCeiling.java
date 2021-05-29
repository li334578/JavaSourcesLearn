package com.company.JavaSourceLearn.designPatterns2.creatorMode.design03;

import java.math.BigDecimal;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class LevelTwoCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司⾃自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶⾼高度一般就往下吊20cm，要是层⾼高很⾼高，也可增加每级的厚度";
    }
}
