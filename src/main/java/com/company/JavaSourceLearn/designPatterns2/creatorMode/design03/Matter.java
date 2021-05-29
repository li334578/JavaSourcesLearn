package com.company.JavaSourceLearn.designPatterns2.creatorMode.design03;

import java.math.BigDecimal;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public interface Matter {
    // 场景 地板、地砖、涂料、吊顶
    String scene();

    // 品牌
    String brand();

    // 型号
    String model();

    // 价格
    BigDecimal price();

    // 描述
    String desc();
}
