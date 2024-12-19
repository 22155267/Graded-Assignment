package com.example.rentals.vehicles;


import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;
    private List<Integer> ratings; // List to hold ratings

    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = true;
        this.ratings = new ArrayList<>();
    }

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        } else {
            System.out.println("Rating must be between 1 and 5.");
        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        return ratings.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    
}
