package ocp.example2.fixed;

import java.util.ArrayList;
import java.util.List;

public class ColorFilterSpecification extends ProductFilterSpecification {

    private ProductColor productColor;

    public ColorFilterSpecification(ProductColor productColor) {
        this.productColor = productColor;
    }

    @Override
    protected List<Product> applyFilter(List<Product> products) {
        List<Product> productList = new ArrayList<Product>();

        for (Product product : products) {
            if (product.getColor().equals(productColor.getColor())) {
                productList.add(product);
            }
        }

        return productList;
    }
}
