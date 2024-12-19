package com.example.rentals.motorcycle;

public class Motorcycle extends Vehicle 
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days * 0.9; // Apply discount for motorcycles
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }
}
