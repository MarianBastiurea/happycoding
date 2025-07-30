package com.marianbastiurea.c08threads.honeyfactory.beekeeper;

import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyBatch;

public record BeekeeperHoneyJob(String beekeeperName, HoneyBatch honeyBatch) {

    @Override
    public String toString() {
        return beekeeperName + " with " + honeyBatch;
    }
}
