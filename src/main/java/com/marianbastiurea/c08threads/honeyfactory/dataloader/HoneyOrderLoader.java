package com.marianbastiurea.c08threads.honeyfactory.dataloader;

import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyOrder;
import com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters.OrderExcelReader;

import java.util.List;

public class HoneyOrderLoader {
    public static List<HoneyOrder> loadAndDisplayOrders(String filePath) {
        List<HoneyOrder> orders = OrderExcelReader.readAllOrders(filePath);

        System.out.println("\n📦 All Honey Orders:");
        for (HoneyOrder order : orders) {
            System.out.println("  -> " + order.getHoneyType() + " : " + order.getQuantity() + " kg");
        }

        return orders;
    }
}
