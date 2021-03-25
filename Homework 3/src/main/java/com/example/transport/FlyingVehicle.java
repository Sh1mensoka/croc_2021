package com.example.transport;

public abstract class FlyingVehicle extends Vehicle {
    protected final int maxFlyingRange;
    protected boolean isEngineDamaged;

    protected FlyingVehicle(int id, int wheels, int humanCapacity, String brand, boolean inRent, boolean isDamaged,
                            int maxFlyingRange, boolean isEngineDamaged) {
        super(id, wheels, humanCapacity, brand, inRent, isDamaged);
        this.maxFlyingRange = maxFlyingRange;
        this.isEngineDamaged = isEngineDamaged;
    }
}
