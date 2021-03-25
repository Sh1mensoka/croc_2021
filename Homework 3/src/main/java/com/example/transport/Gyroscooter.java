package com.example.transport;

public class Gyroscooter extends PersonalMobilityVehicle {

    private boolean isEngineDamaged;

    public Gyroscooter(int id, String brand) {
        super(id,2, 1, brand, false, false, true);
        this.isEngineDamaged = false;
    }

    public boolean isEngineDamaged() {
        return isEngineDamaged;
    }

    public void setEngineDamaged(boolean engineDamaged) {
        isEngineDamaged = engineDamaged;
        isDamaged = engineDamaged;
    }
}
