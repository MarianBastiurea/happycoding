package com.marianbastiurea.c08threads.honeyfactory.dataloader;

import com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters.OrderExcelReader;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyOrderFromProcessingPlant;

import java.util.List;

public class HoneyOrderLoader {
    public static List<HoneyOrderFromProcessingPlant> loadAndDisplayOrders(String filePath) {
        List<HoneyOrderFromProcessingPlant> orders = OrderExcelReader.readAllOrders(filePath);

        System.out.println("\n📦 All Honey Orders:");
        for (HoneyOrderFromProcessingPlant order : orders) {
            System.out.println("  -> " + order.honeyType() + " : " + order.quantity() + " kg");
        }
        return orders;
    }
}
