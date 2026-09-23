package com.foodorder;

public class FoodOrderApp {

    public double calculateTotal(double price, int quantity) {
        if (price < 0 || quantity < 0) {
            throw new IllegalArgumentException("Price and quantity cannot be negative");
        }
        return price * quantity;
    }

    public double applyDiscount(double total, double discountPercent) {
        if (total < 0 || discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Invalid total or discount");
        }
        return total - (total * discountPercent / 100);
    }

    public static void main(String[] args) {
        FoodOrderApp app = new FoodOrderApp();

        double pizzaTotal = app.calculateTotal(250, 2);
        double finalAmount = app.applyDiscount(pizzaTotal, 10);

        System.out.println("Food Ordering System");
        System.out.println("Order total: Rs. " + pizzaTotal);
        System.out.println("After 10% discount: Rs. " + finalAmount);
    }
}
