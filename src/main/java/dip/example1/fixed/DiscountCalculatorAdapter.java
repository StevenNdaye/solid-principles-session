package dip.example1.fixed;

import dip.example1.Order;

public class DiscountCalculatorAdapter implements DiscountCalculator{
    @Override
    public double calculateDiscount(Order order) {
        return 0;
    }
}
