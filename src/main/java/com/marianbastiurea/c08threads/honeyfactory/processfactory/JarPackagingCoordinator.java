package com.marianbastiurea.c08threads.honeyfactory.processfactory;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyJarOrderFromStore;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JarPackagingCoordinator {
    private final ExecutorService storeOrderExecutor;
    private final Map<HoneyType, BlockingQueue<PackagingJob>> packagingQueues;
    private final Map<HoneyType, ExecutorService> packagingExecutors;
    private final CountDownLatch totalOrdersLatch;

    public JarPackagingCoordinator(
            Map<HoneyType, BlockingQueue<PackagingJob>> packagingQueues,
            Map<HoneyType, ExecutorService> packagingExecutors,
            int numberOfOrders
    ) {
        this.packagingQueues = packagingQueues;
        this.packagingExecutors = packagingExecutors;
        this.storeOrderExecutor = Executors.newFixedThreadPool(4);
        this.totalOrdersLatch = new CountDownLatch(numberOfOrders);
    }

    public void processOrders(List<HoneyJarOrderFromStore> orders) {
        for (HoneyJarOrderFromStore order : orders) {
            storeOrderExecutor.submit(() -> {
                String storeName = order.getStoreName();
                Map<HoneyType, Integer> jarsToDeliver = order.getJarsToDeliver();

                CountDownLatch latch = new CountDownLatch(jarsToDeliver.size());

                for (Map.Entry<HoneyType, Integer> entry : jarsToDeliver.entrySet()) {
                    HoneyType honeyType = entry.getKey();
                    int quantity = entry.getValue();

                    PackagingJob job = new PackagingJob(storeName, honeyType, quantity, latch, order);
                    try {
                        System.out.printf("📤 Sending job: %s → %d jars for store %s%n",
                                honeyType, quantity, storeName);
                        packagingQueues.get(honeyType).put(job);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                try {
                    latch.await();
                    order.computeInProcessing();
                    System.out.println(order.summaryReport());
                    totalOrdersLatch.countDown();
                    System.out.printf("🏪 All jars ready for delivery to store: %s%n", storeName);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
    }

    public void shutdownAll() {
        storeOrderExecutor.shutdown();
        packagingExecutors.values().forEach(ExecutorService::shutdownNow);
    }

    public void awaitAllOrders() {
        try {
            totalOrdersLatch.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
