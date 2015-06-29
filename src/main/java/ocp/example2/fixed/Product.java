package ocp.example2.fixed;

public class Product {
    private String color;
    private int size;

    public Product(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
