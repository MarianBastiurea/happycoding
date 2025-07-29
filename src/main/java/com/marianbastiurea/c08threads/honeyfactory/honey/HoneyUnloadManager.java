package com.marianbastiurea.c08threads.honeyfactory.honey;

import com.marianbastiurea.c08threads.honeyfactory.beekeeper.BeekeeperHoneyJob;
import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Semaphore;

public class HoneyUnloadManager {

    private final Map<HoneyType, Semaphore> unloadingSemaphores = new HashMap<>();
    private final Map<HoneyType, Double> storage = new HashMap<>();
    private final Map<HoneyType, Double> maxStorageCapacity = new HashMap<>();
    private final Object lock = new Object();
    private final Map<HoneyOrderFromProcessingPlant, Double> deliveredQuantities = new HashMap<>();
    private final List<HoneyOrderFromProcessingPlant> honeyOrderFromProcessingPlants;

    public HoneyUnloadManager(List<HoneyOrderFromProcessingPlant> honeyOrderFromProcessingPlants) {
        this.honeyOrderFromProcessingPlants = honeyOrderFromProcessingPlants;

        for (HoneyType type : HoneyType.values()) {
            unloadingSemaphores.put(type, new Semaphore(1)); // only 1 beekeeper per type
            storage.put(type, 0.0);
            maxStorageCapacity.put(type, 3000.0); // for example: 3000 kg max per type
        }
    }

    public Map<HoneyOrderFromProcessingPlant, Double> getDeliveredQuantities() {
        return deliveredQuantities;
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


                }


                // 🟢 Poate descărca
                LocalTime start = LocalTime.now();
                System.out.printf("✅ %s started unloading %.2f kg of %s at %s%n",
                        beekeeperName, quantity, type, start);

                int barrels = (int) Math.ceil(quantity / 280.0);
                // long unloadMillis = barrels * 10L * 60 * 1000;
                long unloadMillis = 100;
                System.out.printf("⏳ %s is unloading %d barrels (%d minutes)%n",
                        beekeeperName, barrels, barrels * 10);
                Thread.sleep(unloadMillis);

                storage.put(type, storage.get(type) + quantity);
                LocalTime end = LocalTime.now();
                System.out.printf("✅ %s finished unloading at %s (new total: %.2f kg)%n",
                        beekeeperName, end, storage.get(type));
            }
        } finally {
            semaphore.release();
        }
    }


    private boolean processOrderFor(HoneyType type) {
        Optional<HoneyOrderFromProcessingPlant> matchingOrder = honeyOrderFromProcessingPlants.stream()
                .filter(order -> order.getHoneyType() == type)
                .filter(order -> {
                    double delivered = deliveredQuantities.getOrDefault(order, 0.0);
                    return delivered < order.getQuantity(); // comanda nu e completă
                })
                .findFirst();

        if (matchingOrder.isPresent()) {
            HoneyOrderFromProcessingPlant order = matchingOrder.get();
            double orderedQty = order.getQuantity();
            double deliveredSoFar = deliveredQuantities.getOrDefault(order, 0.0);
            double remainingQty = orderedQty - deliveredSoFar;
            double currentStock = storage.get(type);

            double quantityToProcess = Math.min(remainingQty, currentStock);

            if (quantityToProcess <= 0.0) {
                System.out.printf("⚠️ Cannot process order for %s – no stock available or order already fulfilled.%n", type);
                return false;
            }

            int barrels = (int) Math.ceil(quantityToProcess / 280.0);
            // long processingTimeMillis= barrels * 10L * 60 * 1000;
            long processingTimeMillis = 100; // simulare: 1 sec per livrare

            System.out.printf("🏭 Processing %.2f kg of %s (≈ %d barrels)%n",
                    quantityToProcess, type, barrels);

            try {
                Thread.sleep(processingTimeMillis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // actualizare stoc și cantitate livrată
            storage.put(type, currentStock - quantityToProcess);
            deliveredQuantities.put(order, deliveredSoFar + quantityToProcess);

            System.out.printf("✅ Delivered %.2f kg of %s (%.2f total delivered, %.2f remaining)%n",
                    quantityToProcess, type,
                    deliveredQuantities.get(order),
                    orderedQty - deliveredQuantities.get(order));

            return true;
        }

        return false;
    }

    public double getStorageFor(HoneyType type) {
        return storage.get(type);
    }

    public Map<HoneyType, Double> getStorage() {
        return storage;
    }
}

