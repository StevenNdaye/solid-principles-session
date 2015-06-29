package ocp.example2.fixed;

import java.util.List;

public abstract class ProductFilterSpecification {

    public List<Product> Filter(List<Product> products){
        return applyFilter(products);
    }

    protected abstract List<Product> applyFilter(List<Product> products);
}
