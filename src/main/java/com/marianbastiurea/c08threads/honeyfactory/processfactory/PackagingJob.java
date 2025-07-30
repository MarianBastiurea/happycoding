package com.marianbastiurea.c08threads.honeyfactory.processfactory;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;
import com.marianbastiurea.c08threads.honeyfactory.honey.HoneyJarOrderFromStore;

import java.util.concurrent.CountDownLatch;

public class PackagingJob {
    private String storeName;
    private HoneyType honeyType;
    private int quantity;
    private CountDownLatch latch;
    private final HoneyJarOrderFromStore order;

    public PackagingJob(String storeName, HoneyType honeyType, int quantity, CountDownLatch latch, HoneyJarOrderFromStore order) {
        this.storeName = storeName;
        this.honeyType = honeyType;
        this.quantity = quantity;
        this.latch = latch;
        this.order = order;
    }

    public String getStoreName() {
        return storeName;
    }

    public int getQuantity() {
        return quantity;
    }

    public CountDownLatch getLatch() {
        return latch;
    }

    public HoneyJarOrderFromStore getOrder() {
        return order;
    }
}
