package com.company.JavaSourceLearn.designPatterns2.creatorMode.design03;

import java.math.BigDecimal;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class LiBangCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "立邦始终以开发绿⾊产品、注重高科技、高品质为目标，以技术力量不断推进科研和开发，满足消费者需求";
    }
}
