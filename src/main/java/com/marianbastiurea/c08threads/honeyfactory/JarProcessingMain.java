package com.marianbastiurea.c08threads.honeyfactory;

import com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters.HoneyJarOrderFromStoreExcelReader;
import com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters.JarProcessorExcelReaders;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyJarOrderFromStore;

import java.util.List;

public class JarProcessingMain {
    public static void main(String[] args) {
        String excelPath = "/Users/marianbastiurea/Desktop/deliveredStatus.xlsx";
        JarProcessorExcelReaders.processDeliveredHoney(excelPath);

        String filePath = "/Users/marianbastiurea/Desktop/StoreOrder.xlsx";
        List<HoneyJarOrderFromStore> orders = HoneyJarOrderFromStoreExcelReader.readOrders(filePath);


    }
}
