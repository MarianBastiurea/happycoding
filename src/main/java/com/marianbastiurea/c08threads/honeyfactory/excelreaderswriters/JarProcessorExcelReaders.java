package com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class JarProcessorExcelReaders {


    public static void processDeliveredHoney(String excelFilePath) {

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet("Delivery Status");

            System.out.println("\n🫙 Jar Processing Report:");
            System.out.println("──────────────────────────────────────────────");
            System.out.printf("%-15s | %-12s | %-12s | %-12s%n", "Honey Type", "Ordered (kg)", "Delivered (kg)", "Remaining (kg)");
            System.out.println("──────────────────────────────────────────────");

            DecimalFormat df = new DecimalFormat("#,##0.00");

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row == null) continue;

                String honeyType = row.getCell(0).getStringCellValue().trim();
                double ordered = row.getCell(1).getNumericCellValue();
                double delivered = row.getCell(2).getNumericCellValue();
                double remaining = ordered - delivered;

                System.out.printf("%-15s | %12s | %12s | %12s%n",
                        honeyType,
                        df.format(ordered),
                        df.format(delivered),
                        df.format(remaining));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
