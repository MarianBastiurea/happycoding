package com.marianbastiurea.c08threads.honeyfactory;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters.DeliveryStatusExcelWriter;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyOrderFromProcessingPlant;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderProcessingVerifier {

    public static void verifyAndDisplayOrderStatus(
            List<HoneyOrderFromProcessingPlant> orders,
            Map<HoneyOrderFromProcessingPlant, Double> deliveredQuantities,
            Map<HoneyType, Double> finalStorage) {

        System.out.println("\n📦 Final Honey Order Status:");

        Map<HoneyType, Double> orderedByType = new HashMap<>();
        Map<HoneyType, Double> deliveredByType = new HashMap<>();
        
        for (HoneyOrderFromProcessingPlant order : orders) {
            HoneyType type = order.getHoneyType();
            double ordered = order.getQuantity();
            double delivered = deliveredQuantities.getOrDefault(order, 0.0);

            orderedByType.put(type, orderedByType.getOrDefault(type, 0.0) + ordered);
            deliveredByType.put(type, deliveredByType.getOrDefault(type, 0.0) + delivered);
        }

        boolean allProcessed = true;

        for (HoneyType type : orderedByType.keySet()) {
            double ordered = orderedByType.getOrDefault(type, 0.0);
            double delivered = deliveredByType.getOrDefault(type, 0.0);
            double remaining = ordered - delivered;
            double inStorage = finalStorage.getOrDefault(type, 0.0);

            if (remaining > 0.0) {
                allProcessed = false;
                System.out.printf("  ⚠️ %s: Ordered %.2f kg, Delivered %.2f kg, Missing %.2f kg, In Storage %.2f kg%n",
                        type, ordered, delivered, remaining, inStorage);
            } else {
                System.out.printf("  ✅ %s: Fully delivered (%.2f kg), In Storage %.2f kg%n",
                        type, delivered, inStorage);
            }
        }

        String outputFile = "/Users/marianbastiurea/Desktop/deliveredStatus.xlsx";
        DeliveryStatusExcelWriter.writeDeliveryStatusToExcel(
                orderedByType,
                deliveredByType,
                finalStorage,
                outputFile
        );

        if (allProcessed) {
            System.out.println("\n✅ All honey orders have been fulfilled.");
        } else {
            System.out.println("\n⚠️ Some honey orders were not fully fulfilled. See breakdown above.");
        }
    }
}
