package com.example.rental.customers;


import com.example.rental.vehicle;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<Vehicle> rentedVehicles;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    public void addRentedVehicle(Vehicle vehicle) {
        rentedVehicles.add(vehicle);
    }

    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    // Getters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
}
