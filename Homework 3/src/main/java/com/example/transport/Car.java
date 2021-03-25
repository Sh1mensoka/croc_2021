package com.example.transport;

public class Car extends AutoVehicle {

    private final String typeOfCar;

    public Car(int id, int humanCapacity, String brand, int maxTravellingRange, String typeOfCar) {
        super(id, 4, humanCapacity, brand, false, false, maxTravellingRange, false);
        this.typeOfCar = typeOfCar;
    }
}
