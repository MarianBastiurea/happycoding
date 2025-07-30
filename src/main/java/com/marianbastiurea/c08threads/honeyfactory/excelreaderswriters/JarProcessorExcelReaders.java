package com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.util.EnumMap;
import java.util.Map;

public class JarProcessorExcelReaders {

    public static Map<HoneyType, Double> readFinalStorage(String excelFilePath) {
        Map<HoneyType, Double> finalStorage = new EnumMap<>(HoneyType.class);

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet("DeliveryStatus");
            if (sheet == null) return finalStorage;

            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                if (row == null) continue;

                String honeyTypeStr = row.getCell(0).getStringCellValue().trim();
                HoneyType honeyType = HoneyType.valueOf(honeyTypeStr);
                double delivered = row.getCell(2).getNumericCellValue();

                finalStorage.put(honeyType, delivered);
            }

        } catch (Exception e) {
            System.err.println("❌ Error reading finalStorage: " + e.getMessage());
        }

        return finalStorage;
    }
}
