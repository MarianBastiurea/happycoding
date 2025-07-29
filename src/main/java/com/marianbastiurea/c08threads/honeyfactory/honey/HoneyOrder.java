package com.marianbastiurea.c08threads.honeyfactory.honey;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

public class HoneyOrder {
    private final HoneyType honeyType;
    private final double quantity;
    private boolean processed = false;

    public HoneyOrder(HoneyType honeyType, double quantity) {
        this.honeyType = honeyType;
        this.quantity = quantity;
    }

    public HoneyType getHoneyType() {
        return honeyType;
    }

    public double getQuantity() {
        return quantity;
    }
    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    @Override
    public String toString() {
        return "HoneyOrder{" +
                "honeyType=" + honeyType +
                ", quantity=" + quantity +
                '}';
    }
}

