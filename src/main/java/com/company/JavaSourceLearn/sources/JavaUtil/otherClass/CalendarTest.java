package com.company.JavaSourceLearn.sources.JavaUtil.otherClass;

import java.util.Calendar;

/**
 * @Author: liwenbo
 * @Date: 30/3/2021
 * @Description:
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(Calendar.ALL_STYLES);
        // 此方法添加或减去指定的时间量，以给定日历字段，基于日历的规则。
        instance.add(Calendar.DAY_OF_MONTH,-5);
        // 这个方法返回当前日历是否代表在指定Object表示的时间之后的时间。
        boolean isAfter = instance.after(Calendar.getInstance());
        // 这个方法返回当前日历是否代表在指定Object表示的时间之前的时间。
        boolean isBefore = instance.before(Calendar.getInstance());
        // 清除此Calendar的所有日历字段值和时间值未定义。
        instance.clear();
    }
}
