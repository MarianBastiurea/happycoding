package com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class DeliveryStatusExcelWriter {

    public static void writeDeliveryStatusToExcel(
            Map<HoneyType, Double> orderedByType,
            Map<HoneyType, Double> deliveredByType,
            Map<HoneyType, Double> storage,
            String filePath) {

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Delivery Status");

            // Header row
            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("Honey Type");
            header.createCell(1).setCellValue("Ordered (kg)");
            header.createCell(2).setCellValue("Delivered (kg)");
            header.createCell(3).setCellValue("Missing (kg)");
            header.createCell(4).setCellValue("Remaining Stock (kg)");

            int rowNum = 1;

            for (HoneyType type : orderedByType.keySet()) {
                double ordered = orderedByType.getOrDefault(type, 0.0);
                double delivered = deliveredByType.getOrDefault(type, 0.0);
                double missing = ordered - delivered;
                double remainingStock = storage.getOrDefault(type, 0.0);

                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(type.name());
                row.createCell(1).setCellValue(ordered);
                row.createCell(2).setCellValue(delivered);
                row.createCell(3).setCellValue(missing);
                row.createCell(4).setCellValue(remainingStock);
            }

            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
            }

            System.out.println("\n📄 Delivery status written to Excel: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
