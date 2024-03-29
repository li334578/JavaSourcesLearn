package com.company.JavaSourceLearn.designPatterns2.creatorMode.design03;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public class DecorationPackageMenu implements IMenu {

    private List<Matter> list = new ArrayList<Matter>(); // 装修清单
    private BigDecimal price = BigDecimal.ZERO; // 装修价格
    private BigDecimal area; // ⾯面积
    private String grade; // 装修等级；豪华欧式、轻奢⽥田园、现代简约

    public DecorationPackageMenu() {
    }

    public DecorationPackageMenu(BigDecimal area, String grade) {
        this.area = area;
        this.grade = grade;
    }

    @Override
    public IMenu appendCeiling(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(new BigDecimal("0.2")).multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendCoat(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendFloor(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public IMenu appendTile(Matter matter) {
        list.add(matter);
        price = price.add(area.multiply(matter.price()));
        return this;
    }

    @Override
    public String getDetail() {
        StringBuilder details = new StringBuilder("\r\n------------------------------------------\r\n")
                .append("装修清单\r\n")
                .append("套餐等级").append(grade).append("\r\n")
                .append("套餐价格").append(price).append("\r\n")
                .append("房屋面积").append(area).append("\r\n")
                .append("材料清单").append(area.doubleValue()).append("平米\r\n")
                .append("材料清单: \r\n");
        for (Matter matter : list) {
            details.append(matter.scene()).append(":").append(matter.brand()).append("、")
                    .append(matter.model()).append("、平米价格：").append(matter.price()).append(" 元。 \n");
        }
        return details.toString();
    }
}
