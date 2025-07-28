package com.marianbastiurea.c08threads.honeyfactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Read beekeepers from Excel
        List<Beekeeper> beekeepers = BeekeeperExcelReader.readBeekeepers("/Users/marianbastiurea/Desktop/beekeepers.xlsx");

        System.out.println("👩‍🌾 Beekeepers and their honey batches:");
        for (Beekeeper b : beekeepers) {
            System.out.println("Beekeeper: " + b.getBeekeeperName());
            for (HoneyBatch h : b.getHoneyBatches()) {
                System.out.println("  -> " + h.getHoneyType() + " : " + h.getQuantity() + " kg");
            }
        }

        // 2. Read honey orders from Excel
        String orderFilePath = "/Users/marianbastiurea/Desktop/honeyOrders.xlsx";
        List<HoneyOrder> orders = OrderExcelReader.readAllOrders(orderFilePath);

        System.out.println("\n📦 All Honey Orders:");
        for (HoneyOrder order : orders) {
            System.out.println("  -> " + order.getHoneyType() + " : " + order.getQuantity() + " kg");
        }

        // 3. Initialize HoneyUnloadManager with orders
        HoneyUnloadManager manager = new HoneyUnloadManager(orders);

        // 4. Create jobs from beekeepers (each HoneyBatch becomes a job)
        List<BeekeeperHoneyJob> jobs = new ArrayList<>();
        for (Beekeeper b : beekeepers) {
            for (HoneyBatch batch : b.getHoneyBatches()) {
                jobs.add(new BeekeeperHoneyJob(b.getBeekeeperName(), batch));
            }
        }

        // 5. Shuffle jobs to simulate random arrival order
        Collections.shuffle(jobs);


        // 6. Start a thread for each job
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


        // 7. Wait for all threads to finish
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 8. Final summary of honey storage
        System.out.println("\n📊 Final honey storage in center:");
        for (HoneyType type : HoneyType.values()) {
            System.out.printf("  - %s: %.2f kg%n", type, manager.getStorageFor(type));
        }

        // 9. Check if all orders have been processed
        boolean allOrdersProcessed = orders.stream().allMatch(HoneyOrder::isProcessed);

        // Dacă unele comenzi nu au fost procesate complet, adăugăm detalii
        if (allOrdersProcessed) {
            System.out.println("\n✅ All honey orders have been processed.");
        } else {
            System.out.println("\n⚠️ Some honey orders were not fully processed. Details:");

            // Afișăm comenzile care nu au fost procesate complet
            for (HoneyOrder order : orders) {
                if (!order.isProcessed()) {
                    System.out.printf("  -> Order for %s : %.2f kg was not processed.%n",
                            order.getHoneyType(), order.getQuantity());
                }
            }
        }


        // 10. Final message
        System.out.println("\n🎉 All beekeepers have finished unloading and left the center.");
    }
}
