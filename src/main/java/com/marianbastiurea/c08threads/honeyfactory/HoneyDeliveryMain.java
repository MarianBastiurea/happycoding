package com.marianbastiurea.c08threads.honeyfactory;

import com.marianbastiurea.c08threads.honeyfactory.beekeeper.Beekeeper;
import com.marianbastiurea.c08threads.honeyfactory.beekeeper.BeekeeperHoneyJob;
import com.marianbastiurea.c08threads.honeyfactory.beekeeper.BeekeeperJobExecutor;
import com.marianbastiurea.c08threads.honeyfactory.dataloader.BeekeeperDataLoader;
import com.marianbastiurea.c08threads.honeyfactory.dataloader.HoneyOrderLoader;
import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyJobFactory;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyOrderFromProcessingPlant;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyUnloadManager;

import java.util.Collections;
import java.util.List;

public class HoneyDeliveryMain {
    public static void main(String[] args) {

        List<Beekeeper> beekeepers = BeekeeperDataLoader.loadAndDisplayBeekeepers("/Users/marianbastiurea/Desktop/beekeepers.xlsx");

        List<HoneyOrderFromProcessingPlant> orders = HoneyOrderLoader.loadAndDisplayOrders("/Users/marianbastiurea/Desktop/honeyOrders.xlsx");

        HoneyUnloadManager manager = new HoneyUnloadManager(orders);

        List<BeekeeperHoneyJob> jobs = HoneyJobFactory.createJobsFromBeekeepers(beekeepers);

        Collections.shuffle(jobs);

        List<Thread> threads = BeekeeperJobExecutor.executeJobsInThreads(beekeepers, manager);

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n📊 Final honey storage in center:");
        for (HoneyType type : HoneyType.values()) {
            System.out.printf("  - %s: %.2f kg%n", type, manager.getStorageFor(type));
        }

        OrderProcessingVerifier.verifyAndDisplayOrderStatus(
                orders,
                manager.getDeliveredQuantities(),
                manager.getStorage()
        );

        System.out.println("\n🎉 All beekeepers have finished unloading and left the center.");
    }
}
