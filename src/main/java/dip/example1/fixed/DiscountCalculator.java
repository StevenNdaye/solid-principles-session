package dip.example1.fixed;

import dip.example1.Order;

public interface DiscountCalculator {
    double calculateDiscount(Order order);
}
