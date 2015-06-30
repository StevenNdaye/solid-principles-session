package dip.example1.fixed;

import dip.example1.Order;

public interface TaxStrategy {
    double findTaxAmount(Order order);
}
