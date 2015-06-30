package dip.example1;

public class Order {

    private double itemTotal;
    private String country;

    public Order(double itemTotal, String country) {
        this.itemTotal = itemTotal;
        this.country = country;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public String getCountry() {
        return country;
    }
}
