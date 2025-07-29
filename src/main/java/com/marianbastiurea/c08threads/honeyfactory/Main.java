package com.marianbastiurea.c08threads.honeyfactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Read beekeepers from Excel
       List<Beekeeper> beekeepers = BeekeeperDataLoader.loadAndDisplayBeekeepers("/Users/marianbastiurea/Desktop/beekeepers.xlsx");

        // 2. Read honey orders from Excel
        List<HoneyOrder> orders = HoneyOrderLoader.loadAndDisplayOrders("/Users/marianbastiurea/Desktop/honeyOrders.xlsx");

        // 3. Initialize HoneyUnloadManager with orders
        HoneyUnloadManager manager = new HoneyUnloadManager(orders);

        // 4. Create jobs from beekeepers (each HoneyBatch becomes a job)
        List<BeekeeperHoneyJob> jobs = HoneyJobFactory.createJobsFromBeekeepers(beekeepers);

        // 5. Shuffle jobs to simulate random arrival order
        Collections.shuffle(jobs);
        
        // 6. Start a thread for each job
        List<Thread> threads = BeekeeperJobExecutor.executeJobsInThreads(beekeepers, manager);


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
