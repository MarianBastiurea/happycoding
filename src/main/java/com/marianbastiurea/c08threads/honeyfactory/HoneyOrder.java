package com.marianbastiurea.c08threads.honeyfactory;

public class HoneyOrder {
    private final HoneyType honeyType;
    private final double quantity;

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

    @Override
    public String toString() {
        return "HoneyOrder{" +
                "honeyType=" + honeyType +
                ", quantity=" + quantity +
                '}';
    }
}

