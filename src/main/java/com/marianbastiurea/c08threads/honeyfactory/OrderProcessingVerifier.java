package com.marianbastiurea.c08threads.honeyfactory;

import java.util.List;

public class OrderProcessingVerifier {
    public static void verifyAndDisplayOrderStatus(List<HoneyOrder> orders) {
        boolean allOrdersProcessed = orders.stream().allMatch(HoneyOrder::isProcessed);

        if (allOrdersProcessed) {
            System.out.println("\n✅ All honey orders have been processed.");
        } else {
            System.out.println("\n⚠️ Some honey orders were not fully processed. Details:");

            for (HoneyOrder order : orders) {
                if (!order.isProcessed()) {
                    System.out.printf("  -> Order for %s : %.2f kg was not processed.%n",
                            order.getHoneyType(), order.getQuantity());
                }
            }
        }
    }
}
