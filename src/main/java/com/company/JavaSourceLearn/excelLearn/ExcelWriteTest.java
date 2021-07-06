package com.company.JavaSourceLearn.excelLearn;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description :
 * @date : 2021-07-05 21:32:05
 */
public class ExcelWriteTest {

    static String PATH = "E:\\IdeaProjects\\JavaSourcesLearn\\src\\main\\java\\com\\company\\JavaSourceLearn\\excelLearn\\";

    @Test
    public void testWrite01() throws Exception {
        FileOutputStream outputStream = null;
        try {
            // 创建工作簿
            Workbook workbook = new HSSFWorkbook();
            // 创建工作表
            Sheet sheet1 = workbook.createSheet("sheetName");
            // 创建行
            Row row1 = sheet1.createRow(0);
            // 创建单元格
            Cell cell11 = row1.createCell(0);
            cell11.setCellValue("单元格11写入value");
            outputStream = new FileOutputStream(PATH + "test1.xls");
            workbook.write(outputStream);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    @Test
    public void testWrite02() throws Exception {
        FileOutputStream outputStream = null;
        try {
            // 创建工作簿
            Workbook workbook = new XSSFWorkbook();
            // 创建工作表
            Sheet sheet1 = workbook.createSheet("sheetName");
            // 创建行
            Row row1 = sheet1.createRow(0);
            // 创建单元格
            Cell cell11 = row1.createCell(0);
            cell11.setCellValue("单元格11写入value xlsx");
            outputStream = new FileOutputStream(PATH + "test2.xlsx");
            workbook.write(outputStream);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
