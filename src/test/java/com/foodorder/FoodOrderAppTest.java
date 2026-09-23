package com.foodorder;

import org.junit.Test;
import static org.junit.Assert.*;

public class FoodOrderAppTest {

    @Test
    public void testCalculateTotal() {
        FoodOrderApp app = new FoodOrderApp();
        assertEquals(500.0, app.calculateTotal(250, 2), 0.001);
    }

    @Test
    public void testApplyDiscount() {
        FoodOrderApp app = new FoodOrderApp();
        assertEquals(450.0, app.applyDiscount(500, 10), 0.001);
    }

    @Test
    public void testFoodItemAndOrder() {
        Order order = new Order();
        order.addItem(new FoodItem("Pizza", 250));
        order.addItem(new FoodItem("Burger", 150));

        assertEquals(2, order.getItemCount());
        assertEquals(400.0, order.calculateSubtotal(), 0.001);
        assertEquals(360.0, order.calculateTotal(10), 0.001);
    }
}
