package com.marianbastiurea.c08threads.honeyfactory.honey;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

public class HoneyOrderFromProcessingPlant {
    private final HoneyType honeyType;
    private final double quantity;

    public HoneyOrderFromProcessingPlant(HoneyType honeyType, double quantity) {
        this.honeyType = honeyType;
        this.quantity = quantity;
    }

    public HoneyType getHoneyType() {
        return honeyType;
    }

    public double getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "HoneyOrder{" +
                "honeyType=" + honeyType +
                ", quantity=" + quantity +
                '}';
    }
}

