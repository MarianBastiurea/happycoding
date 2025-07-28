package com.marianbastiurea.c08threads.honeyfactory;

public class BeekeeperHoneyJob {
    private final String beekeeperName;
    private final HoneyBatch honeyBatch;

    public BeekeeperHoneyJob(String beekeeperName, HoneyBatch honeyBatch) {
        this.beekeeperName = beekeeperName;
        this.honeyBatch = honeyBatch;
    }

    public String getBeekeeperName() {
        return beekeeperName;
    }

    public HoneyBatch getHoneyBatch() {
        return honeyBatch;
    }

    @Override
    public String toString() {
        return beekeeperName + " with " + honeyBatch;
    }
}
