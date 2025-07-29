package com.marianbastiurea.c08threads.honeyfactory.dataloader;

import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyOrderFromProcessingPlant;
import com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters.OrderExcelReader;

import java.util.List;

public class HoneyOrderLoader {
    public static List<HoneyOrderFromProcessingPlant> loadAndDisplayOrders(String filePath) {
        List<HoneyOrderFromProcessingPlant> orders = OrderExcelReader.readAllOrders(filePath);

        System.out.println("\n📦 All Honey Orders:");
        for (HoneyOrderFromProcessingPlant order : orders) {
            System.out.println("  -> " + order.getHoneyType() + " : " + order.getQuantity() + " kg");
        }

        return orders;
    }
}
