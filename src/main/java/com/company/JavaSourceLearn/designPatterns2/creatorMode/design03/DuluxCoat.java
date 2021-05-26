package com.company.JavaSourceLearn.designPatterns2.creatorMode.design03;

import java.math.BigDecimal;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐⼠士(Dulux)";
    }

    @Override
    public String model() {
        return "第⼆代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐士是阿克苏诺⻉贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年年全球有5000万户家庭使⽤用多乐士油漆。";
    }
}
