package com.example.transport;

public class Helicopter extends FlyingVehicle {

    private boolean isBladesDamaged;

    public Helicopter(int id, int wheels, int humanCapacity, String brand, int maxFlyingRange) {
        super(id, wheels, humanCapacity, brand, false, false, maxFlyingRange, false);
        this.isBladesDamaged = false;
    }

    public boolean isBladesDamaged() {
        return isBladesDamaged;
    }

    public void setBladesDamaged(boolean bladesDamaged) {
        isBladesDamaged = bladesDamaged;
        isDamaged = bladesDamaged;
    }
}
