package com.foodorder;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Food item cannot be null");
        }
        items.add(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public double calculateSubtotal() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public double calculateTotal(double discountPercent) {
        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }
        double subtotal = calculateSubtotal();
        return subtotal - (subtotal * discountPercent / 100);
    }
}
