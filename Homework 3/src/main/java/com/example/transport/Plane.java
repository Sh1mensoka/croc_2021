package com.example.transport;

public class Plane extends FlyingVehicle {

    private final String typeOfPlane;
    private boolean isWingsDamaged;

    public Plane(int id, int wheels, int humanCapacity, String brand, int maxFlyingRange, String typeOfPlane) {
        super(id, wheels, humanCapacity, brand, false, false, maxFlyingRange, false);
        this.typeOfPlane = typeOfPlane;
        this.isWingsDamaged = false;
    }

    public boolean isWingsDamaged() {
        return isWingsDamaged;
    }

    public void setWingsDamaged(boolean wingsDamaged) {
        isWingsDamaged = wingsDamaged;
        isDamaged = wingsDamaged;
    }
}
