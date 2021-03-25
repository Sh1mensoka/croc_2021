package com.example;

import com.example.transport.Bike;
import com.example.transport.Vehicle;

public class Application {

    public static void changeStatus(Vehicle vehicle) {
        vehicle.setInRent(!vehicle.isInRent());
    }

    public static void changeDamageStatus(Vehicle vehicle) {
        vehicle.setDamaged(!vehicle.isDamaged());
    }

    public static void main(String[] args) {
        Bike bike = new Bike (1, 2, 1, "Suzuki");
        changeDamageStatus(bike);
    }

}
