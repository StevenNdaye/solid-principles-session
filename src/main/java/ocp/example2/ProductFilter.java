package ocp.example2;

import java.util.ArrayList;
import java.util.List;

public class ProductFilter {

    public List<Product> byColor(List<Product> products, ProductColor productColor) {

        List<Product> productList = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getColor().equals(productColor.getColor())) {
                productList.add(product);
            }
        }

        return productList;
    }


    public List<Product> byColorAndSize(List<Product> products, ProductColor productColor, ProductSize productSize) {

        List<Product> productList = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getColor().equals(productColor.name()) && product.getSize() == productSize.getSize()) {
                productList.add(product);
            }
        }

        return productList;
    }

    public List<Product> bySize(List<Product> products, ProductSize productSize) {

        List<Product> productList = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getSize() == productSize.getSize()) {
                productList.add(product);
            }
        }

        return productList;
    }


}
