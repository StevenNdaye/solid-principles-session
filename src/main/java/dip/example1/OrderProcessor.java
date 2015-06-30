package dip.example1;

public class OrderProcessor {

    public double calculateTotal(Order order){

        double itemTotal = order.getItemTotal();
        double discount = new DiscountCalculator().calculateDiscount(order);

        double taxAmount = 0;

        if(order.getCountry().equals("US")){
            taxAmount = findTaxAmount(order);
        } else if(order.getCountry().equals("UK")){
            taxAmount = findVatAmount(order);
        }

        return itemTotal - discount + taxAmount;
    }

    private double findVatAmount(Order order) {
        return 10;
    }

    private double findTaxAmount(Order order) {
        return 10;
    }
}
