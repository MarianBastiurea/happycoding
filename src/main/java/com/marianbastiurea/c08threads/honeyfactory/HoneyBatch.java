package com.marianbastiurea.c08threads.honeyfactory;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

public class HoneyBatch {
    private HoneyType honeyType;
    private double quantity;

    public HoneyBatch(HoneyType type, double quantity) {
        this.honeyType = type;
        this.quantity = quantity;
    }

    public HoneyType getHoneyType() {
        return honeyType;
    }

    public double getQuantity() {
        return quantity;
    }
}
