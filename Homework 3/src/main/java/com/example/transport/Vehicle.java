package com.example.transport;

public abstract class Vehicle {
    protected final int id;
    protected final int wheels;
    protected final int humanCapacity;
    protected final String brand;
    protected boolean inRent;
    protected boolean isDamaged;

    protected Vehicle(int id, int wheels, int humanCapacity, String brand, boolean inRent, boolean isDamaged) {
        this.id = id;
        this.wheels = wheels;
        this.humanCapacity = humanCapacity;
        this.brand = brand;
        this.inRent = inRent;
        this.isDamaged = isDamaged;
    }

    public void setInRent(boolean inRent) {
        this.inRent = inRent;
    }

    public void setDamaged(boolean damaged) {
        isDamaged = damaged;
    }

    public boolean isInRent() {
        return inRent;
    }

    public boolean isDamaged() {
        return isDamaged;
    }
}
