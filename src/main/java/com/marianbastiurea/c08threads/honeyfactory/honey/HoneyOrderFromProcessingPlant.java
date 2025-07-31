package com.marianbastiurea.c08threads.honeyfactory.honey;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

public record HoneyOrderFromProcessingPlant(HoneyType honeyType, double quantity) {

    @Override
    public String toString() {
        return "HoneyOrder{" +
                "honeyType=" + honeyType +
                ", quantity=" + quantity +
                '}';
    }
}

