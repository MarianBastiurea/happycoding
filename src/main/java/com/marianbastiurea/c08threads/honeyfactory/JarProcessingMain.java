package com.marianbastiurea.c08threads.honeyfactory;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters.HoneyJarOrderFromStoreExcelReader;
import com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters.JarProcessorExcelReaders;
import com.marianbastiurea.c08threads.honeyfactory.excelreaderswriters.StoreOrderExcelWriter;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyJarOrderFromStore;
import com.marianbastiurea.c08threads.honeyfactory.processfactory.JarPackagingCoordinator;
import com.marianbastiurea.c08threads.honeyfactory.processfactory.PackagingJob;
import com.marianbastiurea.c08threads.honeyfactory.processfactory.PackagingLineManager;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class JarProcessingMain {
    public static void main(String[] args) {

        String excelPath = "/Users/marianbastiurea/Desktop/deliveredStatus.xlsx";
        JarProcessorExcelReaders.processDeliveredHoney(excelPath);

        String filePath = "/Users/marianbastiurea/Desktop/StoreOrder.xlsx";
        List<HoneyJarOrderFromStore> orders = HoneyJarOrderFromStoreExcelReader.readOrders(filePath);

        PackagingLineManager lineManager = new PackagingLineManager();
        Map<HoneyType, BlockingQueue<PackagingJob>> queues = lineManager.getPackagingQueues();
        Map<HoneyType, java.util.concurrent.ExecutorService> executors = lineManager.getPackagingExecutors();

        JarPackagingCoordinator coordinator = new JarPackagingCoordinator(queues, executors, orders.size());
        coordinator.processOrders(orders);

        coordinator.awaitAllOrders();
        coordinator.shutdownAll();

        StoreOrderExcelWriter.writeResults(
                "/Users/marianbastiurea/Desktop/StoreOrder.xlsx",
                orders
        );
    }
}
