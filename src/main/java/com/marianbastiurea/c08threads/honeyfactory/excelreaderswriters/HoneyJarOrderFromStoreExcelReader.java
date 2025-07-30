package com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyJarOrderFromStore;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HoneyJarOrderFromStoreExcelReader {
    public static List<HoneyJarOrderFromStore> readOrders(String excelFilePath) {
        Map<String, HoneyJarOrderFromStore> ordersMap = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row == null) continue;

                String storeName = row.getCell(0).getStringCellValue().trim();
                String honeyTypeStr = row.getCell(1).getStringCellValue().trim().toUpperCase();
                int quantity = (int) row.getCell(2).getNumericCellValue();
                HoneyType honeyType;
                try {
                    honeyType = HoneyType.valueOf(honeyTypeStr);
                } catch (IllegalArgumentException e) {
                    System.err.printf("⚠️ Invalid honey type '%s' at row %d – skipped%n", honeyTypeStr, rowIndex);
                    continue;
                }
                ordersMap
                        .computeIfAbsent(storeName, HoneyJarOrderFromStore::new)
                        .addHoneyOrder(honeyType, quantity);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>(ordersMap.values());
    }
}
