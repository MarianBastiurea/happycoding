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
            maxStorageCapacity.put(type, 3000.0); // for example: 1000 kg max per type
        }
    }


    public void tryUnload(BeekeeperHoneyJob job) throws InterruptedException {
        HoneyType type = job.getHoneyBatch().getHoneyType();
        double quantity = job.getHoneyBatch().getQuantity();
        String beekeeperName = job.getBeekeeperName();

        Semaphore semaphore = unloadingSemaphores.get(type);
        semaphore.acquire(); // exclusivitate pe tipul de miere

        try {
            synchronized (lock) {
                while (true) {
                    double current = storage.get(type);
                    double max = maxStorageCapacity.get(type);

                    // 🟢 Dacă e loc → descarcă
                    if (current + quantity <= max) {
                        break;
                    }

                    System.out.printf("🛑 %s is waiting – storage full for %s (%.2f / %.2f kg)%n",
                            beekeeperName, type, current, max);

                    boolean processed = processOrderFor(type);

                    if (!processed) {
                        // ❗ Dacă nu s-a putut procesa nimic, verificăm din nou spațiul:
                        current = storage.get(type);
                        if (current + quantity <= max) {
                            System.out.printf("🔄 Rechecking after failed processing – there's now space for %s (%s). Continuing...%n",
                                    beekeeperName, type);
                            break;
                        }

                        // 🛑 Altfel ieșim – nu are ce să mai facă
                        System.out.printf("🚫 %s could not unload %.2f kg of %s and left the center.%n",
                                beekeeperName, quantity, type);
                        return;
                    }

                    // 🔔 Procesarea a eliberat spațiu → notificăm
                    lock.notifyAll();
                }


                // 🟢 Poate descărca
                LocalTime start = LocalTime.now();
                System.out.printf("✅ %s started unloading %.2f kg of %s at %s%n",
                        beekeeperName, quantity, type, start);

                int barrels = (int) Math.ceil(quantity / 280.0);
               // long unloadMillis = barrels * 10L * 60 * 1000;
                long unloadMillis=1000;
                System.out.printf("⏳ %s is unloading %d barrels (%d minutes)%n",
                        beekeeperName, barrels, barrels * 10);
                Thread.sleep(unloadMillis);

                storage.put(type, storage.get(type) + quantity);
                LocalTime end = LocalTime.now();
                System.out.printf("✅ %s finished unloading at %s (new total: %.2f kg)%n",
                        beekeeperName, end, storage.get(type));

                lock.notifyAll(); // notifică alți stupari care poate așteaptă
            }
        } finally {
            semaphore.release();
        }
    }



    private boolean processOrderFor(HoneyType type) {
        Optional<HoneyOrder> matchingOrder = honeyOrders.stream()
                .filter(order -> order.getHoneyType() == type && !order.isProcessed())
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
            order.setProcessed(true);
            System.out.printf("✅ Processed %.2f kg of %s → new stock: %.2f kg%n",
                    quantityToProcess, type, storage.get(type));
            synchronized (lock) {
                lock.notifyAll();
            }
            return true;
        }

        return false;
    }

    public double getStorageFor(HoneyType type) {
        return storage.get(type);
    }
}

