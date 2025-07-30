package com.marianbastiurea.c08threads.honeyfactory.processfactory;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

import java.util.concurrent.BlockingQueue;

public class PackagingWorker implements Runnable {

    private HoneyType honeyType;
    private BlockingQueue<PackagingJob> queue;

    public PackagingWorker(HoneyType honeyType, BlockingQueue<PackagingJob> queue) {
        this.honeyType = honeyType;
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("👷 Worker for " + honeyType + " started.");
        try {
            while (!Thread.currentThread().isInterrupted()) {
                PackagingJob job = queue.take();
                System.out.printf("🛠 Worker %s took job: %d jars for %s%n",
                        honeyType, job.getQuantity(), job.getStoreName());

                int quantity = job.getQuantity();

                for (int i = 0; i < quantity; i++) {
                    Thread.sleep(10);
                    job.getOrder().incrementDelivered(honeyType);
                }

                System.out.printf("✅ %d jars of %s for %s were packaged.%n",
                        quantity, honeyType, job.getStoreName());

                job.getLatch().countDown();
            }
        } catch (InterruptedException e) {
            System.out.println("🔴 Worker for " + honeyType + " interrupted.");
            Thread.currentThread().interrupt();
        }
    }
}

