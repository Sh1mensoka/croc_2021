package com.example.transport;

public abstract class PersonalMobilityVehicle extends Vehicle {
    protected final boolean hasEngine;

    protected PersonalMobilityVehicle(int id, int wheels, int humanCapacity, String brand, boolean inRent, boolean isDamaged, boolean hasEngine) {
        super(id, wheels, humanCapacity, brand, inRent, isDamaged);
        this.hasEngine = hasEngine;
    }
}
