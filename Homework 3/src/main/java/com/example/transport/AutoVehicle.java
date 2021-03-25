package com.example.transport;

public abstract class AutoVehicle extends Vehicle {
    protected final int maxTravellingRange;
    protected boolean isEngineDamaged;

    protected AutoVehicle(int id, int wheels, int humanCapacity, String brand, boolean inRent, boolean isDamaged,
                       int maxTravellingRange, boolean isEngineDamaged) {
        super(id, wheels, humanCapacity, brand, inRent, isDamaged);
        this.maxTravellingRange = maxTravellingRange;
        this.isEngineDamaged = isEngineDamaged;
    }

    public void setEngineDamaged(boolean engineDamaged) {
        isEngineDamaged = engineDamaged;
    }

    public boolean isEngineDamaged() {
        return isEngineDamaged;
    }
}
