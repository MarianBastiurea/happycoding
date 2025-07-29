package com.marianbastiurea.c08threads.honeyfactory.honey;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

public class HoneyJarOrderFromStore {
    private String storeName;
    private HoneyType honeyType;
    private int numberOfJars;

    public HoneyJarOrderFromStore(String storeName, HoneyType honeyType, int numberOfJars) {
        this.storeName = storeName;
        this.honeyType = honeyType;
        this.numberOfJars = numberOfJars;
    }

    public String getStoreName() {
        return storeName;
    }

    public HoneyType getHoneyType() {
        return honeyType;
    }

    public int getNumberOfJars() {
        return numberOfJars;
    }

    @Override
    public String toString() {
        return String.format("Store: %s -> %s : %d jars", storeName, honeyType, numberOfJars);
    }
}
