package com.marianbastiurea.c08threads.honeyfactory.enums;
public enum HoneyPrice {
    ACACIA(15.0),
    RAPESEED(12.0),
    LINDEN(18.0),
    WILDFLOWER(10.0),
    SUNFLOWER(13.0),
    FALSE_INDIGO(14.0);

    private final double pricePerKg;

    HoneyPrice(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }
}
