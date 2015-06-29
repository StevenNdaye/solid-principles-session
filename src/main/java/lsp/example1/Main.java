package lsp.example1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        products.add(new Book("Java", "Purcell"));
        products.add(new Book("JavaScript", "Mean"));
        products.add(new Movie("NonStop", "Some guy"));


        for (Product product : products) {
            System.out.println(product.getName() + " : " + product.getAuthor());
        }
    }
}
