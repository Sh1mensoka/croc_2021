package com.example.transport;

public class Bike extends PersonalMobilityVehicle{

    private boolean isChainDamaged;

    public Bike(int id, int wheels, int humanCapacity, String brand) {
        super(id, wheels, humanCapacity, brand, false, false, false);
        this.isChainDamaged = false;
    }

    public boolean isChainDamaged() {
        return isChainDamaged;
    }

    public void setChainDamaged(boolean chainDamaged) {
        isChainDamaged = chainDamaged;
        isDamaged = chainDamaged;
    }
}
