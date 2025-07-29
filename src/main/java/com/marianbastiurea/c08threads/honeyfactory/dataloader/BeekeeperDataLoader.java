package com.marianbastiurea.c08threads.honeyfactory.dataloader;


import com.marianbastiurea.c08threads.honeyfactory.Beekeeper;
import com.marianbastiurea.c08threads.honeyfactory.HoneyBatch;
import com.marianbastiurea.c08threads.honeyfactory.excelreaders.BeekeeperExcelReader;

import java.util.List;

public class BeekeeperDataLoader {

    public static List<Beekeeper> loadAndDisplayBeekeepers(String filePath) {
        List<Beekeeper> beekeepers = BeekeeperExcelReader.readBeekeepers(filePath);

        System.out.println("👩‍🌾 Beekeepers and their honey batches:");
        for (Beekeeper b : beekeepers) {
            System.out.println("Beekeeper: " + b.getBeekeeperName());
            for (HoneyBatch h : b.getHoneyBatches()) {
                System.out.println("  -> " + h.getHoneyType() + " : " + h.getQuantity() + " kg");
            }
        }

        return beekeepers;
    }
}

