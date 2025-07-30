package com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters;

import com.marianbastiurea.c08threads.honeyfactory.beekeeper.Beekeeper;
import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyBatch;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class BeekeeperExcelReader {

    public static List<Beekeeper> readBeekeepers(String filePath) {
        Map<String, Beekeeper> beekeepersMap = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue;

                String name = row.getCell(0).getStringCellValue();
                String honeyTypeStr = row.getCell(1).getStringCellValue().toUpperCase();
                String quantityStr = row.getCell(2).toString().trim();
                double quantity = Double.parseDouble(quantityStr);
                HoneyType type = HoneyType.valueOf(honeyTypeStr);
                HoneyBatch batch = new HoneyBatch(type, quantity);
                Beekeeper beekeeper = beekeepersMap.getOrDefault(name, new Beekeeper(name));
                beekeeper.addHoneyBatch(batch);
                beekeepersMap.put(name, beekeeper);
            }

        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }

        List<Beekeeper> beekeepers = new ArrayList<>(beekeepersMap.values());

        Collections.shuffle(beekeepers);
        return beekeepers;
    }
}
