package com.marianbastiurea.c08threads.honeyfactory;

import java.util.List;
import java.util.*;

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
        for (BeekeeperHoneyJob job : jobs) {
            Thread t = new Thread(() -> {
                try {
                    manager.tryUnload(job);
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
    }
}
