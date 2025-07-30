package com.marianbastiurea.c08threads.honeyfactory.processfactory;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class PackagingWorker implements Runnable {

    private final HoneyType honeyType;
    private final BlockingQueue<PackagingJob> queue;
    private final Map<HoneyType, Double> finalStorage;
    private static final int TIME_TO_FILL_A_JAR =10;

    public PackagingWorker(HoneyType honeyType,
                           BlockingQueue<PackagingJob> queue,
                           Map<HoneyType, Double> finalStorage) {
        this.honeyType = honeyType;
        this.queue = queue;
        this.finalStorage = finalStorage;
    }

    @Override
    public void run() {
        System.out.println("👷 Worker for " + honeyType + " started.");

        try {
            while (!Thread.currentThread().isInterrupted()) {
                PackagingJob job = queue.take();
                String store = job.getStoreName();
                int quantity = job.getQuantity();
                System.out.printf("🛠 Worker %s took job: %d jars for %s%n",
                        honeyType, quantity, store);
                int jarsToPackage = 0;

                synchronized (finalStorage) {
                    double available = finalStorage.getOrDefault(honeyType, 0.0);
                    if (available > 0) {
                        jarsToPackage = (int) Math.min(quantity, available);
                        finalStorage.put(honeyType, available - jarsToPackage);
                    }
                }
                for (int i = 0; i < jarsToPackage; i++) {
                    Thread.sleep(TIME_TO_FILL_A_JAR);
                    job.getOrder().incrementDelivered(honeyType);
                }

                int remaining = quantity - jarsToPackage;
                if (jarsToPackage > 0 && remaining > 0) {
                    System.out.printf("⚠️ Partial delivery: %d jars delivered, %d on processing (%s)%n",
                            jarsToPackage, remaining, store);
                } else if (jarsToPackage == 0) {
                    System.out.printf("🚫 No %s in storage for %s – entire order on processing%n",
                            honeyType, store);
                } else {
                    System.out.printf("✅ All %d jars of %s delivered to %s%n",
                            jarsToPackage, honeyType, store);
                }

                job.getLatch().countDown();
            }

        } catch (InterruptedException e) {
            System.out.println("🔴 Worker for " + honeyType + " interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}

