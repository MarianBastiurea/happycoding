package com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class DeliveryStatusExcelWriter {

    public static void writeDeliveryStatusToExcel(
            Map<HoneyType, Double> orderedByType,
            Map<HoneyType, Double> deliveredByType,
            Map<HoneyType, Double> finalStorage,
            String outputFilePath) {

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("DeliveryStatus");


        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("HoneyType");
        header.createCell(1).setCellValue("OrderedQuantity");
        header.createCell(2).setCellValue("DeliveredQuantity");
        header.createCell(3).setCellValue("RemainingQuantity");
        header.createCell(4).setCellValue("InStorageQuantity");

        int rowIndex = 1;

        for (HoneyType type : orderedByType.keySet()) {
            Row row = sheet.createRow(rowIndex++);

            double ordered = orderedByType.getOrDefault(type, 0.0);
            double delivered = deliveredByType.getOrDefault(type, 0.0);
            double remaining = ordered - delivered;
            double inStorage = finalStorage.getOrDefault(type, 0.0);

            row.createCell(0).setCellValue(type.toString());
            row.createCell(1).setCellValue(ordered);
            row.createCell(2).setCellValue(delivered);
            row.createCell(3).setCellValue(remaining);
            row.createCell(4).setCellValue(inStorage);
        }


        for (int i = 0; i <= 4; i++) {
            sheet.autoSizeColumn(i);
        }

        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            workbook.write(fos);
        } catch (IOException e) {
            System.err.println("❌ Failed to write delivery status to Excel: " + e.getMessage());
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                System.err.println("❌ Failed to close workbook: " + e.getMessage());
            }
        }
    }
}
