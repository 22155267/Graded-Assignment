package com.example.rental.vehicles ;


public class Truck extends Vehicle {
    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 1.2; // Higher rate for trucks
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
