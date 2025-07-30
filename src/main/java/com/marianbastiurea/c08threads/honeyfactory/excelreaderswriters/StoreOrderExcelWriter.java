package com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyJarOrderFromStore;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;


public class StoreOrderExcelWriter {

    public static void writeResults(String inputPath, List<HoneyJarOrderFromStore> orders) {
        try (FileInputStream fis = new FileInputStream(inputPath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row == null) continue;

                String storeName = row.getCell(0).getStringCellValue().trim();
                String honeyTypeStr = row.getCell(1).getStringCellValue().trim().toUpperCase();
                HoneyType honeyType;
                try {
                    honeyType = HoneyType.valueOf(honeyTypeStr);
                } catch (IllegalArgumentException e) {
                    continue;
                }

                HoneyJarOrderFromStore match = orders.stream()
                        .filter(o -> o.getStoreName().equalsIgnoreCase(storeName))
                        .findFirst()
                        .orElse(null);

                if (match == null) continue;

                int delivered = match.getDeliveredMap().getOrDefault(honeyType, 0);
                int remaining = match.getInProcessingMap().getOrDefault(honeyType, 0);

                Cell deliveredCell = row.createCell(3, CellType.NUMERIC);
                deliveredCell.setCellValue(delivered);

                Cell inProcessCell = row.createCell(4, CellType.NUMERIC);
                inProcessCell.setCellValue(remaining);
            }

            try (FileOutputStream fos = new FileOutputStream(inputPath)) {
                workbook.write(fos);
            }

            System.out.println("✅ Excel updated successfully → " + inputPath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
