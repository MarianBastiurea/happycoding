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

        String excelPath = "excel-data/honeyOrdersFromProcessingPlant.xlsx";
        String storeOrdersPath = "excel-data/StoreOrder.xlsx";

        JarProcessorExcelReaders.processDeliveredHoney(excelPath);

        List<HoneyJarOrderFromStore> orders = HoneyJarOrderFromStoreExcelReader.readOrders(storeOrdersPath);

        Map<HoneyType, Double> finalStorage = JarProcessorExcelReaders.readFinalStorage(excelPath);

        PackagingLineManager lineManager = new PackagingLineManager(finalStorage);

        Map<HoneyType, BlockingQueue<PackagingJob>> queues = lineManager.getPackagingQueues();
        Map<HoneyType, java.util.concurrent.ExecutorService> executors = lineManager.getPackagingExecutors();

        JarPackagingCoordinator coordinator = new JarPackagingCoordinator(queues, executors, orders.size());
        coordinator.processOrders(orders);

        coordinator.awaitAllOrders();
        coordinator.shutdownAll();

        StoreOrderExcelWriter.writeResults(storeOrdersPath, orders);
    }
}
