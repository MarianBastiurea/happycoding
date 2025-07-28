package com.marianbastiurea.c08threads.honeyfactory;

import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.Semaphore;

public class HoneyUnloadManager {

    private final Map<HoneyType, Semaphore> unloadingSemaphores = new HashMap<>();
    private final Map<HoneyType, Double> storage = new HashMap<>();
    private final Map<HoneyType, Double> maxStorageCapacity = new HashMap<>();
    private final Object lock = new Object();

    private final List<HoneyOrder> honeyOrders;

    public HoneyUnloadManager(List<HoneyOrder> honeyOrders) {
        this.honeyOrders = honeyOrders;

        for (HoneyType type : HoneyType.values()) {
            unloadingSemaphores.put(type, new Semaphore(1)); // only 1 beekeeper per type
            storage.put(type, 0.0);
            maxStorageCapacity.put(type, 1000.0); // for example: 1000 kg max per type
        }
    }

    public void tryUnload(BeekeeperHoneyJob job) throws InterruptedException {
        HoneyType type = job.getHoneyBatch().getHoneyType();
        double quantity = job.getHoneyBatch().getQuantity();
        String beekeeperName = job.getBeekeeperName();

        Semaphore semaphore = unloadingSemaphores.get(type);
        semaphore.acquire();

        try {
            synchronized (lock) {
                while (storage.get(type) + quantity > maxStorageCapacity.get(type)) {
                    System.out.printf("🛑 %s is waiting – storage full for %s (%.2f / %.2f kg)%n",
                            beekeeperName, type, storage.get(type), maxStorageCapacity.get(type));

                    boolean processed = processOrderFor(type);
                    if (!processed) {
                        System.out.println("❌ No matching order found to free up space.");
                        lock.wait(); // așteaptă să se elibereze
                    }
                }

                LocalTime start = LocalTime.now();
                System.out.printf("✅ %s started unloading %.2f kg of %s at %s%n",
                        beekeeperName, quantity, type, start);

                int barrels = (int) Math.ceil(quantity / 280.0);
                //long unloadMillis = barrels * 10L * 60 * 1000; // 10 min / butoi
                long unloadMillis=1000;
                System.out.printf("⏳ %s is unloading %d barrels (%d minutes)%n",
                        beekeeperName, barrels, barrels * 10);
                Thread.sleep(unloadMillis);

                storage.put(type, storage.get(type) + quantity);
                LocalTime end = LocalTime.now();
                System.out.printf("✅ %s finished unloading at %s (new total: %.2f kg)%n",
                        beekeeperName, end, storage.get(type));

                lock.notifyAll(); // notifică următorii
            }
        } finally {
            semaphore.release();
        }
    }


    private boolean processOrderFor(HoneyType type) {
        Optional<HoneyOrder> matchingOrder = honeyOrders.stream()
                .filter(order -> order.getHoneyType() == type)
                .findFirst();

        if (matchingOrder.isPresent()) {
            HoneyOrder order = matchingOrder.get();
            double orderQuantity = order.getQuantity();
            double currentStock = storage.get(type);

            double quantityToProcess = Math.min(orderQuantity, currentStock);

            if (quantityToProcess <= 0.0) {
                System.out.printf("⚠️ Cannot process order for %s – no stock available%n", type);
                return false;
            }

            int barrels = (int) Math.ceil(quantityToProcess / 280.0);
         //   long processingTimeMillis = barrels * 10L * 60 * 1000;
            long processingTimeMillis=1000;
            System.out.printf("🏭 Processing %.2f kg of %s (≈ %d barrels, will take %d minutes)%n",
                    quantityToProcess, type, barrels, barrels * 10);

            try {
                Thread.sleep(processingTimeMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            storage.put(type, currentStock - quantityToProcess);
            System.out.printf("✅ Processed %.2f kg of %s → new stock: %.2f kg%n",
                    quantityToProcess, type, storage.get(type));

            return true;
        }

        return false;
    }

    public double getStorageFor(HoneyType type) {
        return storage.get(type);
    }
}

