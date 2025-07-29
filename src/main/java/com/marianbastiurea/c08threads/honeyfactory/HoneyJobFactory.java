package com.marianbastiurea.c08threads.honeyfactory;

import java.util.ArrayList;
import java.util.List;

public class HoneyJobFactory {
    public static List<BeekeeperHoneyJob> createJobsFromBeekeepers(List<Beekeeper> beekeepers) {
        List<BeekeeperHoneyJob> jobs = new ArrayList<>();

        for (Beekeeper b : beekeepers) {
            for (HoneyBatch batch : b.getHoneyBatches()) {
                jobs.add(new BeekeeperHoneyJob(b.getBeekeeperName(), batch));
            }
        }

        return jobs;
    }
}
