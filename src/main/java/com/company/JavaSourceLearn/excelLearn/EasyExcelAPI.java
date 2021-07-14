package com.company.JavaSourceLearn.excelLearn;

import com.alibaba.excel.EasyExcel;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author: liwenbo
 * @Date: 2021年07月07日
 * @Description:
 */
public class EasyExcelAPI {
    @Test
    public void testMethod1() {
        String fileName = "C:\\Users\\1\\Desktop\\barCode.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, BarCode.class, new DemoDataListener()).sheet().doRead();
    }
}
