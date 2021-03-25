package com.example.transport;

public class Motorcycle extends AutoVehicle {

    private final String typeOfMotorcycle;

    public Motorcycle(int id, int wheels, int humanCapacity, String brand, int maxTravellingRange, String typeOfMotorcycle) {
        super(id, wheels, humanCapacity, brand, false, false, maxTravellingRange, false);
        this.typeOfMotorcycle = typeOfMotorcycle;
    }
}
