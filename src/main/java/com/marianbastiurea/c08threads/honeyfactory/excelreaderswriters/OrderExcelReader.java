package com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters;

import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyOrder;
import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderExcelReader {

    public static List<HoneyOrder> readAllOrders(String filePath) {
        List<HoneyOrder> orders = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip header

                String honeyTypeStr = row.getCell(0).getStringCellValue().trim().toUpperCase();
                double quantity = row.getCell(1).getNumericCellValue();

                HoneyType type = HoneyType.valueOf(honeyTypeStr);
                orders.add(new HoneyOrder(type, quantity));
            }

        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }

        return orders;
    }
}
