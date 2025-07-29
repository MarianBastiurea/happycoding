package com.marianbastiurea.c08threads.honeyfactory;

import java.util.ArrayList;
import java.util.List;

public class BeekeeperJobExecutor {
    public static List<Thread> executeJobsInThreads(List<Beekeeper> beekeepers, HoneyUnloadManager manager) {
        List<Thread> threads = new ArrayList<>();

        for (Beekeeper beekeeper : beekeepers) {
            Thread t = new Thread(() -> {
                try {
                    for (HoneyBatch batch : beekeeper.getHoneyBatches()) {
                        BeekeeperHoneyJob job = new BeekeeperHoneyJob(beekeeper.getBeekeeperName(), batch);
                        manager.tryUnload(job);
                    }
                    System.out.printf("🚚 %s has finished unloading all honey batches.%n", beekeeper.getBeekeeperName());

                    // Simulăm plata
                    double totalPayment = 0;
                    for (HoneyBatch batch : beekeeper.getHoneyBatches()) {
                        double pricePerKg = HoneyPrice.valueOf(batch.getHoneyType().name()).getPricePerKg();
                        totalPayment += batch.getQuantity() * pricePerKg;
                    }
                    System.out.printf("💰 %s has been paid: %.2f lei.%n", beekeeper.getBeekeeperName(), totalPayment);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            threads.add(t);
            t.start();
        }

        return threads;
    }
}
