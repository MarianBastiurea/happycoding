package com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyJarOrderFromStore;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HoneyJarOrderFromStoreExcelReader {
    public static List<HoneyJarOrderFromStore> readOrders(String filePath) {
        List<HoneyJarOrderFromStore> orders = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                // Skip header row
                if (row.getRowNum() == 0) continue;

                Cell storeCell = row.getCell(0);
                Cell honeyTypeCell = row.getCell(1);
                Cell jarsCell = row.getCell(2);

                String storeName = storeCell.getStringCellValue().trim();
                String honeyTypeStr = honeyTypeCell.getStringCellValue().trim().toUpperCase();
                int numberOfJars = (int) jarsCell.getNumericCellValue();

                HoneyType honeyType = HoneyType.valueOf(honeyTypeStr);

                HoneyJarOrderFromStore order = new HoneyJarOrderFromStore(storeName, honeyType, numberOfJars);
                orders.add(order);
            }

        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("🛒 Honey Jar Orders from Stores:");
        for (HoneyJarOrderFromStore order : orders) {
            System.out.println(order);
        }

        return orders;
    }
}
