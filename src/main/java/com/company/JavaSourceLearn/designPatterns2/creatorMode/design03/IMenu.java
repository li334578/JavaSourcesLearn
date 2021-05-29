package com.company.JavaSourceLearn.designPatterns2.creatorMode.design03;

/**
 * @Author: liwenbo
 * @Date: 2021年05月23日
 * @Description:
 */
public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶

    IMenu appendCoat(Matter matter); // 涂料料

    IMenu appendFloor(Matter matter); // 地板

    IMenu appendTile(Matter matter); // 地砖

    String getDetail(); // 明细
}
