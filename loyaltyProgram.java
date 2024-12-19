package vehicles;


import com.example.rental.customers.Customer;

public class LoyaltyProgram {
    private static final int POINTS_PER_RENTAL_DAY = 10;
    private static final double DISCOUNT_PER_POINT = 0.05;

    public void addPoints(Customer customer, int rentalDays) {
        int pointsEarned = rentalDays * POINTS_PER_RENTAL_DAY;
        customer.addLoyaltyPoints(pointsEarned);
    }

    public double calculateDiscount(Customer customer) {
        return customer.getLoyaltyPoints() * DISCOUNT_PER_POINT;
    }
}
