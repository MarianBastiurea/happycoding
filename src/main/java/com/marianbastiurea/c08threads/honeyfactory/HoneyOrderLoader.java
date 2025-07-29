package com.marianbastiurea.c08threads.honeyfactory;

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
