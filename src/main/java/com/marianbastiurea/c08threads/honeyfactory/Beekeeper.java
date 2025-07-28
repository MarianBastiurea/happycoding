package com.marianbastiurea.c08threads.honeyfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

public class Beekeeper extends Thread {
    private final String beekeeperName;
    private List<HoneyBatch> honeyBatches;
    private final Map<HoneyType, BlockingQueue<BeekeeperHoneyJob>> honeyQueues;

    public Beekeeper(Map<HoneyType, BlockingQueue<BeekeeperHoneyJob>> honeyQueues, List<HoneyBatch> honeyBatches, String beekeeperName) {
        this.honeyQueues = honeyQueues;
        this.honeyBatches = honeyBatches;
        this.beekeeperName = beekeeperName;
    }

    public Beekeeper(String beekeeperName) {
        this.beekeeperName = beekeeperName;
        this.honeyBatches = new ArrayList<>();
        this.honeyQueues = null; // va fi setat separat înainte de start()
    }

    @Override
    public void run() {
        String timestamp = java.time.LocalTime.now().toString();
        System.out.println(beekeeperName + " arrived at " + timestamp + " with " + honeyBatches.size() + " batches.");

        for (HoneyBatch batch : honeyBatches) {
            try {
                BeekeeperHoneyJob job = new BeekeeperHoneyJob(beekeeperName, batch);
                honeyQueues.get(batch.getHoneyType()).put(job);
                System.out.println(beekeeperName + " queued for " + batch.getHoneyType() + " (" + batch.getQuantity() + " kg).");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println(beekeeperName + " was interrupted while queuing for " + batch.getHoneyType());
            }
        }
    }

    public String getBeekeeperName() {
        return beekeeperName;
    }

    public void addHoneyBatch(HoneyBatch batch) {
        if (honeyBatches == null) {
            honeyBatches = new ArrayList<>();
        }
        honeyBatches.add(batch);
    }

    public List<HoneyBatch> getHoneyBatches() {
        return honeyBatches;
    }
}
