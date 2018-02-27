package com.velykyi.entity.full.enums;

public enum  AirPlane {
    BOING_737(150),
    AIRBUS_320(160);

    private final int amountOfSitting;

    AirPlane(int amountOfSitting) {
        this.amountOfSitting = amountOfSitting;
    }

    public int getAmountOfSitting() {
        return amountOfSitting;
    }
}
