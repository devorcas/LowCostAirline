package com.velykyi.entity.full.enums;

public enum  AirPlaneModel {
    BOING(250),
    AIRBUS(250);

    private final int amountOfSitting;


    AirPlaneModel(int amountOfSitting) {
        this.amountOfSitting = amountOfSitting;
    }

    public int getAmountOfSitting() {
        return amountOfSitting;
    }
}
