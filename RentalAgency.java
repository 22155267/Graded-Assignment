package com.example.rental.agency;

import com.example.rental.customers.Customer;
import com.example.rental.services.LoyaltyProgram;
import com.example.rental.vehicles.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicleFleet;
    private LoyaltyProgram loyaltyProgram;

    public RentalAgency() {
        this.vehicleFleet = new ArrayList<>();
        this.loyaltyProgram = new LoyaltyProgram();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleFleet.add(vehicle);
    }

    public Vehicle findAvailableVehicle() {
        for (Vehicle vehicle : vehicleFleet) {
            if (vehicle.isAvailableForRental()) {
                return vehicle;
            }
        }
        return null; // No available vehicle
    }

    public void processRental(Customer customer, Vehicle vehicle, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.setAvailable(false);
            customer.addRentedVehicle(vehicle);
            loyaltyProgram.addPoints(customer, days); // Add loyalty points
            System.out.println("Rented: " + vehicle.getModel() + " for " + days + " days.");
        } else {
            System.out.println("Vehicle not available.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        System.out.println("Returned: " + vehicle.getModel());
    }

    public void printLoyaltyDiscount(Customer customer) {
        double discount = loyaltyProgram.calculateDiscount(customer);
        System.out.println("Loyalty discount for " + customer.getName() + ": $" + discount);
    }
}
